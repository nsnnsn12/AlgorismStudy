-- Join 없어진 기록 찾기
SELECT o.ANIMAL_ID
     , o.NAME
FROM ANIMAL_INS i, ANIMAL_OUTS o
WHERE i.ANIMAL_ID(+) = o.ANIMAL_ID
  AND i.DATETIME IS NULL
  ORDER BY o.ANIMAL_ID;