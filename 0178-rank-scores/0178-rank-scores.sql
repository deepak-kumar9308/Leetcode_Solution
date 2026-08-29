# Write your MySQL query statement below
Select score , Dense_rank() over(order by score desc) as 'rank'
from scores
order by score desc;