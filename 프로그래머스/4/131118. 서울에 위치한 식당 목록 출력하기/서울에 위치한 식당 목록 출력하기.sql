SELECT r.rest_id,
       r.rest_name,
       r.food_type,
       r.favorites,
       r.address,
       ROUND(r.avg_review_score, 2) AS review_score
FROM (
    SELECT info.rest_id,
           info.rest_name,
           info.food_type,
           info.favorites,
           info.address,
           AVG(review.review_score) AS avg_review_score
    FROM rest_info AS info
    JOIN rest_review AS review
      ON info.rest_id = review.rest_id
    GROUP BY info.rest_id, info.rest_name, info.food_type, info.favorites, info.address
) AS r
WHERE r.address LIKE '서울%'
ORDER BY r.avg_review_score DESC, r.favorites DESC;