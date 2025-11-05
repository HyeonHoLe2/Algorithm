-- 코드를 작성해주세요
SELECT distinct id, email, first_name, last_name 
FROM developers de JOIN skillcodes sk ON 
(sk.CODE & de.SKILL_CODE) > 0
WHERE sk.name in ('Python', 'C#')
ORDER BY id;