# Write your MySQL query statement below
Select d.name as Department , E.name as Employee , e.salary as Salary
from Employee e
join Department d
on e.departmentID=d.id
where (e.departmentId , e.salary) In (
    Select departmentId, MAX(salary)
    from employee
    group by departmentId
);
