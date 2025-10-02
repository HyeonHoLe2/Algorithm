SELECT f.flavor
FROM first_half f 
JOIN icecream_info i ON i.flavor = f.flavor
WHERE i.ingredient_type = 'fruit_based' and f.total_order > 3000
ORDER BY f.total_order desc;