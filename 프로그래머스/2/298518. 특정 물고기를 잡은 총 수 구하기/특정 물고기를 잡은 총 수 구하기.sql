-- 코드를 작성해주세요
SELECT COUNT(id) AS fish_count
FROM fish_info info JOIN fish_name_info name ON info.fish_type = name.fish_type
WHERE name.fish_name IN ('BASS','SNAPPER');