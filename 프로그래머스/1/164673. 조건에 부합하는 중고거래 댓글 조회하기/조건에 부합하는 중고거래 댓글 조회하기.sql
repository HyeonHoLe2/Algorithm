SELECT 
    board.title, 
    board.board_id, 
    reply.reply_id, 
    reply.writer_id, 
    reply.contents, 
    DATE_FORMAT(reply.CREATED_DATE, '%Y-%m-%d') AS CRAETED_DATE
FROM used_goods_board AS board
JOIN used_goods_reply AS reply
  ON board.board_id = reply.board_id
WHERE SUBSTR(board.CREATED_DATE,1,7) = '2022-10'
ORDER BY reply.created_date ASC, board.title ASC;