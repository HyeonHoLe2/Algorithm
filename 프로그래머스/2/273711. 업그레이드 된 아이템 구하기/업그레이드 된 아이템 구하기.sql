-- 코드를 작성해주세요
SELECT info.item_id, info.item_name, info.rarity
FROM item_info info JOIN item_tree tree ON info.item_id=tree.item_id
WHERE tree.parent_item_id IN (
    SELECT item_id
    FROM item_info
    WHERE rarity = 'RARE')
ORDER BY item_id desc;