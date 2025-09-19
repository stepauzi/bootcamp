create database bootcamp_2508;

use bootcamp_2508;

-- SQL command is case-insensitive 
create table persons (
	id bigint,
	name varchar(20),
    age int
);

-- * means all columns
select * from persons;

-- Put data into table
insert into persons (id, name, age) values (1, 'John', 23);
-- 2 Peter 18
insert into persons (id, name, age) values (2, 'Peter', 18);
-- 3 Lucas 44
insert into persons (name, id, age) values ('Lucas', 3, 44);

-- query language
select age, name from persons;

-- where (conditional)
select age, name from persons where name = 'John';

-- select the id, names from persons whose age > 20
select id, name from persons where age > 20;

delete from persons;

-- Peter's age -> 40
-- For update statement, execute the update ONLY when the conditions fulfills;
update persons set age = 40 where name = 'Peter';

-- update two columns
update persons set age = 80, name = 'Peter Wong' where name = 'Peter';

-- insert 
insert into persons values (4, 'Sally', 30);
insert into persons values (5, 'Leo', 3), (6, 'Jennie', 18);

-- AND OR 
select * from persons where age < 31 OR age > 60;
select * from persons where (age < 31 or age > 60) and (name = 'Leo' or name = 'Sally');

-- alter
alter table persons add gender varchar(1);

select * from persons;

update persons set gender ='M' where id in (1,2,3,5);
update persons set gender ='F' where id in (4,6);

select * from persons;

insert into persons (id, name) values (10, 'Kelly');
insert into persons values (11, 'David', null, null);

-- alter dob date
alter table persons add dob date;

-- default string format (YYYY-MM-DD) for date in MYSQL
update persons set dob = '2022-10-03' where name = 'Leo';
update persons set dob = str_to_date('2022-11-13', '%Y-%m-%d') where name = 'John';

select * from persons where dob > '2022-10-31';

-- select null condition (is/is not)
select * from persons where gender is null;
select * from persons where gender is not null;
select * from persons where gender is not null and dob is not null;

-- deimcal place -> decimal/numeric
-- numberic(5,2):5 -> integer in 3 digits, 2 -> 2 deimcal places
alter table persons add weight numeric(3,2);
alter table persons modify weight numeric(5,2);
update persons set weight = 70.1 where name = 'John';
update persons set weight = 59.4 where name = 'Kelly';
update persons set weight = 62.9 where name = 'Jennie';

-- update persons set weight = 1000 where name = 'Jennie' -- out of range
-- update persons set weight = - 1000 where name = 'Jennie' -- out of range
update persons set weight = 999.99 where name = 'Jennie'; -- ok
update persons set weight = -999.99 where name = 'Jennie'; -- ok

alter table persons add height numeric(5,2);
update persons set height = 150.3 where name = 'John';
update persons set height = 180.5 where name = 'Kelly';
update persons set height = 173.4 where name = 'Jennie';

-- Custom Column
-- power(), round(), ifnull()
select id
, name as person_name
, age
, weight
, height
, 'hello'
, ifnull(round(weight / power (height / 100 ,2), 2), 'NA') as bmi 
from persons
where age is not null;

select * from persons;

-- SQL support remainder by %
select age % 10 from persons;

-- Not equals to
select *
from persons
where gender <> 'F';

-- 'between' by default inclusive and ignore null cases 
-- 'between' is for date format only
select *
from persons
where dob between '2022-10-03' and '2022-11-13';

-- String functions
-- String does not support + operation
-- select name + '!!!" from persons;
select concat(name, '!!!') as new_name
, name
, age
from persons;

-- substring
-- Database index starts from 1
-- first '1' -> first char
-- second '1' -> the number of characters you need
select substring(name, 1, 1) as first_char_name
from persons;

-- Find the persons who has the name start with J
select *
from persons
where substring(name, 1, 1) = 'J';

select length(name), name from persons;

select upper(name), lower(name), name from persons;

-- replace -> case senitive
select replace(name, 'n', 'x') from persons;
select concat_ws('#', name, ifnull(age, 'NA')) from persons;

-- indexOf
-- java: return index range from 0 to length -1, return -1 for not found
-- sql: return index range from 1 to length, return 0 for not found
select instr(name, 'J') from persons;

update persons set name = '彼得'
where name = 'David';

select * from persons;

select length(name), name, char_length(name) from persons;

-- like + % (zero or more)
select * from persons where name like 'J%';
select * from persons where name like '%nn%';
select * from persons where name like '%ie%';

select floor(weight), ceil(weight), weight from persons;

-- Data operations
select date_add(dob, interval 3 month)
, date_sub(dob, interval 3 month)
, date_add(dob, interval 2 year)
, date_add(dob, interval 2 day)
,dob
from persons;


select extract(year from dob)
, extract(month from dob)
, extract(day from dob)
, dob
from persons;

-- select 
select name, case
		when weight > 70 then 'overweight'
        when weight > 60 then 'normal'
        else 'underweight'
	end as weight_label
from persons;

-- group by
create table employees (
	name varchar(20),
    department varchar(2),
    join_date date,
    salary numeric(8,2)
    );
    
insert into employees values ('John', 'IT', '2000-10-01', 25500.5);
insert into employees values ('Mary', 'IT', '1999-10-01', 29000.5);
insert into employees values ('Peter', 'MK', '2012-02-01', 14000.5);
insert into employees values ('Sally', 'HR', '2023-11-01', 18000.5);
insert into employees values ('Jennie', 'HR', '2019-12-01', 45000.5);
insert into employees values ('Sue', 'HR', '2020-06-01', 23000.5);

select * from employees;

-- group by -> stat (count, avg, max, min, sum)
-- group field X -> select field X ( you can bypass the field X)
select department, round(avg(salary), 2), max(salary), min(salary), sum(salary), count(*)
from employees 
group by department;

select sum(salary)
from employees;

-- HAVING
select department, sum(salary) -- Step 3
from employees
where salary >= 20000 -- Step 1
group by department having max(salary) > 28000 -- Step 2
order by sum(salary) desc; -- Step 4

select * from employees;
alter table employees add gender varchar(1);
update employees set gender = 'M' where name = 'John';
update employees set gender = 'F' where name = 'Mary';
update employees set gender = 'M' where name = 'Peter';
update employees set gender = 'F' where name = 'Sally';
update employees set gender = 'F' where name = 'Jennie';
update employees set gender = 'F' where name = 'Sue';

select department, gender, sum(salary), max(salary), min(join_date)
from employees
group by department, gender;

alter table employees add id bigint;

update employees set id = '1' where name = 'John';
update employees set id = '2' where name = 'Mary';
update employees set id = '3' where name = 'Peter';
update employees set id = '4' where name = 'Sally';
update employees set id = '5' where name = 'Jennie';
update employees set id = '6' where name = 'Sue';

create table jobs (
	id bigint,
    name varchar(100),
    employee_id bigint
);

insert into jobs values (1, 'ABC', 1);
insert into jobs values (2, 'ABC', 1);
insert into jobs values (3, 'ABC', 1);
insert into jobs values (4, 'ABdC', 2);
insert into jobs values (5, 'ABfC', 3);
insert into jobs values (6, 'ABC', 3);
insert into jobs values (7, 'AvBC', 5);
insert into jobs values (8, 'ABaC', 5);
insert into jobs values (9, 'aABC', 5);
insert into jobs values (10, 'ABzC', 6);
select * from jobs;

-- Inner Join (x)
select e.name as employee_name
, e.department
, j.id
, j.name as job_description
from employees e inner join jobs j
where e.id = j.employee_id
and e.name = 'John';

