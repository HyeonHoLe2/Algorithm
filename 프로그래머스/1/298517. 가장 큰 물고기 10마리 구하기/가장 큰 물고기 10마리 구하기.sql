-- 코드를 작성해주세요

SELECT id, length
FROM fish_info
WHERE (length <= 10) = 0
ORDER BY length desc, id 
LIMIT 10;