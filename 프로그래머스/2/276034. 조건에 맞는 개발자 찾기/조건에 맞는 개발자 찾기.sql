-- 코드를 작성해주세요
SELECT distinct id, email, first_name, last_name 
FROM developers
WHERE (skill_code & 1024) != 0 or (skill_code & 256 ) != 0
ORDER BY id;