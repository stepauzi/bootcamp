create database bootcamp_exercise1;
use bootcamp_exercise1;

CREATE TABLE regions (
    region_id BIGINT PRIMARY KEY,
    region_name VARCHAR(25)
);

CREATE TABLE countries (
    country_id VARCHAR(2) PRIMARY KEY,
    country_name VARCHAR(40),
    region_id BIGINT,
    FOREIGN KEY (region_id) REFERENCES regions(region_id)
);

CREATE TABLE locations (
    location_id BIGINT PRIMARY KEY,
    street_address VARCHAR(25),
    postal_code VARCHAR(12),
    city VARCHAR(30),
    state_province VARCHAR(12),
    country_id VARCHAR(2),
    FOREIGN KEY (country_id) REFERENCES countries(country_id)
);

CREATE TABLE departments (
    department_id BIGINT PRIMARY KEY,
    department_name VARCHAR(30),
    manager_id BIGINT,
    location_id BIGINT,
    FOREIGN KEY (location_id) REFERENCES locations(location_id)
);

CREATE TABLE jobs (
    job_id VARCHAR(10) PRIMARY KEY,
    job_title VARCHAR(25),
    min_salary BIGINT,
    max_salary BIGINT
);

CREATE TABLE employees (
    employee_id BIGINT PRIMARY KEY,
    first_name VARCHAR(20),
    last_name VARCHAR(25),
    email varchar(25),
    phone_number varchar(20),
    hire_date date,
    job_id VARCHAR(10),
    salary bigint,
    commission_pct bigint,
    manager_id BIGINT,
    department_id BIGINT,
    FOREIGN KEY (job_id) REFERENCES jobs(job_id)
);

CREATE TABLE job_history (
    employee_id BIGINT,
    start_date DATE,
    end_date DATE,
    job_id VARCHAR(20),
    department_id BIGINT,
    PRIMARY KEY (employee_id, start_date),
    FOREIGN KEY (employee_id) REFERENCES employees(employee_id),
    FOREIGN KEY (department_id) REFERENCES departments(department_id),
    FOREIGN KEY (job_id) REFERENCES jobs(job_id)
);

insert into regions (region_id, region_name) values (1, 'Europe');
insert into regions (region_id, region_name) values (2, 'USA');
insert into regions (region_id, region_name) values (3, 'Asia');


insert into countries (country_id, country_name, region_id) values
('DE', 'Germany', 1);
insert into countries (country_id, country_name, region_id) values
('IT', 'Italy', 1);
insert into countries (country_id, country_name, region_id) values
('JP', 'Japan', 3);
insert into countries (country_id, country_name, region_id) values
('US', 'United State', 2);

insert into locations (location_id, street_address, postal_code, city, country_id) values
(1001, '1297 Via Cola di Rie', 989, 'Roma', 'IT');
insert into locations (location_id, street_address, postal_code, city, country_id) values
(1002, '93091 Calle della Te', 10934, 'Venice', 'IT');
insert into locations (location_id, street_address, postal_code, city, state_province) values
(1003, '2017 Shinjuku-ku', 1689, 'Tokyo', 'Tokyo JP');
insert into locations (location_id, street_address, postal_code, city, state_province, country_id) values
(1004, '2014 Jabberwocky', 26192, 'Southlake', 'Texas', 'US');

insert into jobs (job_id, job_title, min_salary, max_salary) 
values ('ST-CLERK', 'Staff Clerk', 20000, 30000);
insert into jobs (job_id, job_title, min_salary, max_salary) 
values ('MK-REP', 'Marketing Receptionist', 15000, 20000);
insert into jobs (job_id, job_title, min_salary, max_salary) 
values ('IT_PROG', 'IT Programmer', 15000, 20000);
insert into jobs (job_id, job_title, min_salary, max_salary) 
values ('CEO', 'CEO', 100000, 200000);
insert into jobs (job_id, job_title, min_salary, max_salary) 
values ('AD-MGR', 'Administration Manager', 40000, 60000);


insert into departments (department_id, department_name,location_id) values
(00, 'BOSS', 1001);
insert into departments (department_id, department_name, manager_id, location_id) values
(01, 'Administration', 200, 1001);
insert into departments (department_id, department_name, manager_id, location_id) values
(02, 'Marketing', 201, 1004);
insert into departments (department_id, department_name, manager_id, location_id) values
(03, 'Purchasing', 202, 1003);
insert into departments (department_id, department_name, manager_id, location_id) values
(04, 'IT', 203, 1003);


insert into employees 
(employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary, commission_pct, manager_id, department_id)
values (001, 'John', 'Boss', 'john@gmail.com', 12345679, Null, 'CEO', 100000, 0, NULL, 00);
insert into employees (employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary, commission_pct, manager_id, department_id) values
(100, 'Steven', 'King', 'steven@gmail.com', 12345678,  '1987-02-12', 'ST-CLERK', 24000, 0, 200, 01);
insert into employees (employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary, commission_pct, manager_id, department_id) values
(200, 'Neena', 'Kochhar', 'neena@abc.com', 24678888,  '2000-01-05', 'AD-MGR', 30000, 0, 001, 01);


insert into job_history(employee_id, start_date, end_date, job_id, department_id) values
(001, '1980-01-01', null, 'CEO', 00);
insert into job_history(employee_id, start_date, end_date, job_id, department_id) values
(100, '1987-03-01', '2000-08-25', 'ST-CLERK', 01);
insert into job_history(employee_id, start_date, end_date, job_id, department_id) values
(200, '2000-02-01', null, 'AD-MGR', 01);

select * from regions;
select * from countries;
select * from locations;
select * from departments;
select * from jobs;
select * from employees;
select * from job_history;