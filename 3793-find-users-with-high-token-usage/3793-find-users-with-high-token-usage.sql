# Write your MySQL query statement below
SELECT user_id , count(prompt) as prompt_count ,round(AVG(tokens),2) as avg_tokens
from prompts 
group by user_id
having count(prompt) >=3
   AND max(tokens)>avg(tokens)
order by avg(tokens) desc , user_id asc;