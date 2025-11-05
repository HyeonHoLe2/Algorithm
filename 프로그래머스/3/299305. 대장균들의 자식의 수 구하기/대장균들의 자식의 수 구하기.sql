SELECT 
    E1.id,
    (SELECT COUNT(*)
     FROM ECOLI_DATA E2
     WHERE E1.id = E2.parent_id) AS child_count
FROM ECOLI_DATA E1
ORDER BY E1.id;
