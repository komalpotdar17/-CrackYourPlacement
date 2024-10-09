# Write your MySQL query statement below

with main as (
    select *, 
           sum(weight) over (order by turn rows unbounded preceding) as cur_wt,
           lead(weight, 1) over (order by turn) as next_wt
    from queue      
)

select person_name
from main
where cur_wt <= 1000 
      and (cur_wt + next_wt > 1000 or next_wt is null);