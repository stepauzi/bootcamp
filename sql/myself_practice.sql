create database myself_practice;
use myself_practice;
drop database myself_practice;

create table students (
student_id bigint primary key auto_increment,
student_name varchar(50),
student_age bigint,
student_grade varchar(5)
);

insert into students (student_name, student_age, student_grade) values
('Tom', 20, 'A'),
('Mary', '22', 'B'),
('John', '21', 'A'),
('Anna', '20', 'C'),
('Peter', '22', 'B');

select * from students
where student_age > 20;

select count(*) as total_students, round(avg(student_age),0) as avg_age
from students;

select grade, count(*) as num_students
from students
group by grade
having count(*) >= 2;

select name, student_age from students
order by student_age desc;

create table courses (
	course_id bigint primary key auto_increment,
    student_id bigint,
    course_name varchar(50),
    foreign key (student_id) references students(student_id)
);

insert into courses (student_id, course_name) values
(1, 'Math'),
(1, 'English'),
(2, 'Math'),
(3, 'History'),
(4, 'Math'),
(5, 'English');

select s.student_name, c.course_name
from students s 
inner join courses c 
on s.student_id = c.student_id;

select s.student_name, c.course_name
from students s
left join courses c
on s.student_id = c.student_id;

select s.student_name, count(c.course_id) as course_count
from students s
left join courses c 
on s.student_id = c.student_id
group by s.student_id, s.student_name;

