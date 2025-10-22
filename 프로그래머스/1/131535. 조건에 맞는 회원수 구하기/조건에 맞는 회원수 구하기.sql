-- 코드를 입력하세요
SELECT COUNT(user_id) AS users
FROM user_info
WHERE YEAR(joined) = '2021' and AGE >= '20' and AGE <='29';
