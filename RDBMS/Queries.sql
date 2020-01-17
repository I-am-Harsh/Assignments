-- 1.1 Queries

-- 1.1.1
select Staff_name as Name, Design_code as Designation_Code
from staff_masters
where staff_sal between 12000 and 25000 and hiredate < '2003-01-01';

-- 1.1.2
select staff_code as Staff_Code, Staff_Name as Name, Design_Code as Designation_Code
from staff_masters
where floor((datediff(curdate(), hiredate))/365) >=18;

-- 1.1.3
select *
from staff_masters
where mgr_code is null;

-- 1.1.4
select *
from book_masters
where book_pub_year between 2001 and 2004 or book_name like '%&%';

-- 1.1.4
select *
from book_masters
where book_pub_year between 2001 and 2004 and book_name like '%&%';

-- 1.1.5
select Staff_Name as Name
from staff_masters
where Staff_name like "%\_%";

--  2.1 Queries

-- 2.1.1
select Staff_Name, lpad(Staff_sal,15,"$") as Salary
from staff_masters;

-- 2.1.2
select Student_name as Name, date_format(Student_Dob,'%M,%d %Y') as DOB
from student_masters
where date_format(Student_Dob, '%a') like ('SAT') or date_format(STudent_dob, '%a') like ('SUN');

-- 2.1.2
select Student_Name as Name, date_format(Student_dob, "%M,%d %Y") as DOB
from student_masters
where dayofweek(Student_Dob)=1 or dayofweek(Student_Dob)=7;

-- 2.1.3
select staff_name as Staff_Name, round((datediff(curdate(), hiredate))/365)*12 as Months_Worked
from staff_masters
order by round((datediff(curdate(), hiredate))/365)*12 desc;

-- 2.1.4
select *
from staff_masters
where day(hiredate) between 1 and 15 and month(hiredate)=12;

-- 2.1.5
select Staff_name as Staff_Name, Staff_sal as Salary, case
when staff_sal >= 50000 then "A"
when staff_sal >= 25000 and staff_sal < 50000 then "B"
when staff_sal >= 10000 and staff_sal < 25000 then "C"
else "D"
end
from staff_masters;

-- 2.1.6
select staff_name as Staff_Name, hiredate as Hire_Date, dayname(hiredate) as Day
from staff_masters
order by case dayofweek(hiredate) 
when 1 then 7 
else dayofweek(hiredate)-1
end;

-- 2.1.7
select length(substring_index("Mississippi", "i", 3))+1 as Position
from dual;

-- 2.1.8
SELECT LAST_DAY(NOW()) - ((7 + WEEKDAY(LAST_DAY(NOW())) - 4) % 7);

-- 2.1.9
select Student_Code, Student_Name as Name, case
when Dept_Code = 20 then "Electricals"
when dept_code = 30 then "Electronics"
else "Others"
end as Dept_Name
from student_masters;

--  2.2 Queries

-- 2.2.1
select round(max(staff_sal)) as Maximum, round(min(staff_sal)) as Minimum, round(sum(staff_sal)) as Total, round(avg(staff_sal)) as Average
from staff_masters
group by dept_code;

-- 2.2.2
select Dept_Code as Department_Code, count(mgr_code) as Total_Number_Of_Managers
from staff_masters
group by Dept_code;

-- 2.2.3
select dept_code as Department_Code, sum(staff_sal)
from staff_masters
where staff_code not in (select mgr_code
from staff_masters)
group by dept_code
having sum(staff_sal) > 20000;

--  3.1 Queries 

-- 3.1.1
select Staff_Name, staff_masters.dept_code, dept_name
from staff_masters inner join department_masters on staff_masters.dept_Code = department_masters.dept_code
where Staff_sal > 20000;

-- 3.1.2
select a.Staff_Code as Staff_Code, a.Staff_Name as Staff_Name, dept_name as Department_Name, a.mgr_code as ManagerNumber, b.staff_name as ManagerName
from staff_masters b, staff_masters a inner join department_masters on a.dept_code = department_masters.dept_code
where a.mgr_code = b.staff_code;

-- 3.1.3
select a.Student_Code as Student_Code, a.student_name as Student_Name, b.book_code as Book_Code, c.book_name as Book_Name
from book_masters c, student_masters a inner join book_transactions b on a.student_code = b.student_code
where b.book_code = c.book_code and b.book_expected_return_date = curdate();

-- 3.1.4
select s.staff_code, s.staff_name, d1.dept_name, d2.design_name, b.book_code, b1.book_name, b1.book_pub_author, b.book_issue_date
from department_masters d1, designation_masters d2, book_masters b1, staff_masters s inner join book_transactions b on s.staff_code = b.staff_code
where s.dept_code  = d1.dept_code and (datediff(curdate(), b.book_issue_date)) between 0 and 30;

-- 3.1.5
select a.book_code, b.book_name, a.book_issue_date, c.staff_code, c.staff_name, d.design_name, e.dept_name, b.book_pub_author, 5*(datediff(a.book_actual_return_date, a.book_expected_return_date))
from book_transactions a inner join book_masters b inner join staff_masters c inner join designation_masters d inner join department_masters e on a.book_code = b.book_code and a.staff_code = c.staff_code and c.design_code = d.design_code and c.dept_code = e.dept_code              
where  (datediff(a.book_actual_return_date, a.book_expected_return_date)) > 0 ;

-- 3.1.6
select staff_name, staff_code, staff_sal
from staff_masters
where staff_Sal < (select avg(staff_sal)
from staff_masters);

-- 3.1.7
select book_pub_author as Author_Name, Book_Name
from book_masters
where book_pub_author = (select book_pub_author
from book_masters
having count(book_pub_author)>1);

-- 3.1.8
select a.staff_code, b.staff_name, c.dept_name
from book_transactions a inner join staff_masters b inner join department_masters c
    on a.staff_code = b.staff_code and b.dept_code = c.dept_code 
group by a.staff_code
having count(a.Staff_Code)>1;

-- 3.1.9
select a.student_code, a.student_name, b.dept_name
from student_masters a inner join department_masters b on a.dept_code = b.dept_code
where a.dept_code = (select dept_code
    from student_masters
    group by dept_code
    having count(dept_code)
    order by count(dept_code) desc limit 1);

-- 3.1.10
select a.staff_code, a.staff_name, b.dept_name, c.design_name from staff_masters a, department_masters b, designation_masters c where a.dept_code = b.dept_code and a.design_code = c.design_code and datediff(curdate(), a.hiredate) between 0 and 90;

-- 3.1.11
select a.Staff_Name as Staff_Name, count(b.mgr_code) as Count
from staff_masters a, staff_masters b
where b.mgr_code = a.staff_code
group by b.mgr_code;

-- 3.1.12
select *
from book_masters a inner join book_transactions b on a.book_code = b.book_code
where book_actual_return_date is null or book_expected_return_date = date_sub(curdate(), interval
weekday(curdate()) day);

-- 3.1.13 (Partial)
select a.dept_code , a.dept_Name,
    count(staff) as numb_of_emps
from department dept inner join employee emp
    on dept.deptid = emp.deptid
group by dept.deptid;

-- 4.1 Queries

-- 4.1.1
Create table Customer
(
    CustomerId int(5),
    Cust_name varchar(20),
    Address1 varchar(30),
    Address2 varchar(30)
);

-- 4.1.2
Alter table Customer change Cust_Name CustomerName varchar(30);
Alter table Customer modify customername varchar(30) not null;

-- 4.1.3.A
Alter table Customer Add column Gender varchar(3);
Alter table Customer Add column Age int(3);
Alter table Customer Add column PhoneNo int(10);

-- 4.1.3.B
Rename table Customer to Cust_Table;

-- 4.1.4
insert into cust_table
values
    (1000, "Allen", "#115 Chicago", "#115 Chicago", "M", 25, 7878776);
insert into cust_table
values
    (1001, "George", "#116 France", "#116 France", "M", 25, 434524);
insert into cust_table
values
    (1002, "Becker", "#114 New York", "#114 New York", "M", 45, 431525);

-- 4.1.5
Alter table Cust_Table add constraint CustId_Prim primary key(CustomerID);

-- 4.1.6
insert into cust_table
values
    (1002, "John", "114 Chicago", "#114 Chicago", "M", 45, 439525);

-- 4.1.7
Alter table Cust_Table drop constraint PRIMARY KEY;

-- 4.1.8
Alter table Cust_Table add constraint CustId_Prim primary key(CustomerID);

-- 4.1.9
Alter table Cust_Table drop constraint PRIMARY KEY;
insert into cust_table
values
    (1002, "Becker", "#114 New York", "#114 New York", "M", 45, 431525);
insert into cust_table
values
    (1003, "Nanapatekhar", "#115 India", "#115 India", "M", 45, 431525);

-- 4.1.10
Truncate table Cust_Table;

-- 4.1.11
Alter table Cust_Table Add column E_Mail varchar(30);

-- 4.1.12
Alter table Cust_Table Drop column E_Mail;

-- 4.1.13
Create table Suppliers_Table as
(select CustomerId as SuppID, Customername as Sname, Address1 as Addr1, Address2 as Addr2, PhoneNo as Contactno
from Cust_Table);

-- 4.1.14
drop table Suppliers_Table;
Create table CustomerMaster
(
    CustomerId int(5),
    CustomerName varchar(30) not null,
    Address1 varchar(30) not null,
    Address2 varchar(30),
    Gender varchar(1),
    Age int(3),
    PhoneNo int(10),
    constraint CustId_PK primary key (CustomerId)
);

-- 4.1.15
Create table AccountMaster
(
    CustomerID int(5),
    AccountNumber int(10) Auto_Increment, 
    AccountType varchar(3),
    LedgerBalance numeric(10, 2) not null, 
    constraint Acc_PK primary key(AccountNumber)
);

--4.1.16
alter table accountmaster add constraint Cust_acc foreign key(customerid) references customermaster(customerid);

--4.1.17
insert into cust_table
values
    (1000, "Allen", "115 Chicago", "115 Chicago", "M", 25, 7878776);
insert into cust_table
values
    (1001, "George", "116 France", "116 France", "M", 25, 434524);
insert into cust_table
values
    (1002, "Becker", "114 New York", "114 New York", "M", 45, 431525);

--4.1.18
alter table accountmaster add CONSTRAINT Account_check check (AccountType='IND' or AccountType='NRI');

-- 4.1.19
alter table accountmaster add constraint Balance_Check check (LedgerBalance > 5000);

-- 4.1.20

-- 4.1.21
Create table AccountDetails as
(select *
from AccountMaster);

-- 4.1.22
Create view Acc_View
(
    CustomerCode,
    AccountHolderName,
    AccountNumber,
    Type,
    Balance
)
as
    select a.CustomerId, b.customername, a.AccountNumber, a.AccountType, a.ledgerbalance
    from AccountMaster a, customermaster b
    where a.customerid=b.customerid;

-- 4.1.23
Create view vAccs_Dtls
as
    select a.CustomerId, b.customername, a.AccountNumber, a.AccountType, a.ledgerbalance
    from AccountMaster a, customermaster b
    where a.customerid=b.customerid and a.AccountType="IND" and a.ledgerbalance<10000;

-- 4.1.24
Create view accsvw10
as select * from AccountMaster with check option;

-- 4.1.25
alter table department_masters  modify dept_code int
(2) not null auto_increment;
insert into department_masters
    (dept_name)
values("IT");
insert into department_masters
    (dept_name)
values("ECE");
insert into department_masters
    (dept_name)
values("Aerospace");
select *
from department_masters;

-- 4.1.26
This and later on cannot be done in mysql

-- 5.1 Queries

-- 5.1.1
CREATE TABLE Emp
(
    EMPNO int(4) NOT NULL,
    ENAME varchar(10),
    JOB varchar(9),
    MGR int(4),
    HIREDATE DATE,
    SAL numeric(7, 2),
    COMM numeric(7, 2),
    DEPTNO int(2)
);

-- 5.1.2
insert into emp (empno, ename, sal, deptno) values (7369,'SMITH',800,20);
insert into emp (empno, ename, sal, deptno) values (7499,'ALLEN',1600,30);
insert into emp (empno, ename, sal, deptno) values (7521,'WARD',1250,30);
insert into emp (empno, ename, sal, deptno) values (7566,'JONES',2975,20);
insert into emp (empno, ename, sal, deptno) values (7654,'MARTIN',1250,30);
insert into emp (empno, ename, sal, deptno) values (7698,'BLAKE',2850,30);
insert into emp (empno, ename, sal, deptno) values (7782,'CLARK',2450,10);
insert into emp (empno, ename, sal, deptno) values (7788,'SCOTT',3000,20);
insert into emp (empno, ename, sal, deptno) values (7839,'KING',5000,10);
insert into emp (empno, ename, sal, deptno) values (7844,'TURNER',1500,30);
insert into emp (empno, ename, sal, deptno) values (7876,'ADAMS',1100,20);
insert into emp (empno, ename, sal, deptno) values (7900,'JAMES',950,30);
insert into emp (empno, ename, sal, deptno) values (7902,'FORD',3000,20);
insert into emp (empno, ename, sal, deptno) values (7934,'MILLER',1300,10);

-- 5.1.3
update emp set job=(select job from emp where empno=7788), deptno=(select deptno from emp where empno=7788) where empno=7698;

-- 5.1.4
delete from department_masters where dept_name='Sales';

-- 5.1.5
update emp set job=(select job from emp where empno=7698), deptno=(select deptno from emp where empno=7698) where empno=7788;

-- 5.1.6
insert into emp values (1000,'Allen','Clerk',1001,'2001-01-12',3000,2,10);
insert into emp values (1001,'George','Analyst',null,'1992-09-08',5000,0,10);
insert into emp values (1002,'Becker','Manager',1000,'1992-11-04',2800,4,20);
insert into emp values (1003,'Bill','Clerk',1002,'1992-11-04',3000,0,20);

-- 6.1 Queries

-- 6.1.1
Create or replace table customermaster(customerid INT(5),customername varchar(30),Address1 varchar(30),Address2 varchar(30),Gender varchar(1),Age INT(3),phoneno INT(10),sales numeric(10,2));
insert into customermaster (customerid, customername ,address1 ,address2, gender, age, phoneno,sales) values ( 6001, 'John','#115 Chicago', '#115 Chicago', 'M',25, 7878776, 10000);
insert into customermaster (customerid, customername ,address1 ,address2, gender, age, phoneno,sales) values ( 6001, 'Jack','#116 France', '#116 France ', 'M', 25, 434524, 20000);
insert into customermaster (customerid, customername ,address1 ,address2, gender, age, phoneno,sales) values ( 6002, 'James','#114 New York', '#114 New York', 'M', 45, 431525, 15000.50 );

-- 6.1.2
Select * from customermaster;

-- 6.1.3
insert into customermaster (customerid, customername ,address1 ,address2, gender, age, phoneno,sales) values ( 6003, 'John','#114 Chicago', '#114 Chicago', 'M',45, 439525, 19000.60);

-- 6.1.4
rollback to sp1;
Select * from customermaster;