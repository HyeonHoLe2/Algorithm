-- 코드를 작성해주세요
SELECT COUNT(*) as fish_count
FROM fish_info
WHERE length <= 10 OR length IS NULL;