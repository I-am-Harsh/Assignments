Book_masters;
+-----------------+-------------+------+-----+---------+-------+
| Field           | Type        | Null | Key | Default | Extra |
+-----------------+-------------+------+-----+---------+-------+
| Book_code       | int(10)     | YES  |     | NULL    |       |
| Book_name       | varchar(50) | NO   |     | NULL    |       |
| Book_pub_year   | int(11)     | YES  |     | NULL    |       |
| Book_pub_author | varchar(50) | NO   |     | NULL    |       |
+-----------------+-------------+------+-----+---------+-------+

Book_transactions;
+---------------------------+---------+------+-----+---------+-------+
| Field                     | Type    | Null | Key | Default | Extra |
+---------------------------+---------+------+-----+---------+-------+
| Book_code                 | int(10) | YES  |     | NULL    |       |
| Student_code              | int(6)  | YES  |     | NULL    |       |
| Staff_code                | int(8)  | YES  |     | NULL    |       |
| Book_issue_Date           | date    | NO   |     | NULL    |       |
| Book_expected_return_date | date    | NO   |     | NULL    |       |
| Book_actual_return_date   | date    | YES  |     | NULL    |       |
+---------------------------+---------+------+-----+---------+-------+

Department_masters;
+-----------+-------------+------+-----+---------+-------+
| Field     | Type        | Null | Key | Default | Extra |
+-----------+-------------+------+-----+---------+-------+
| Dept_code | int(2)      | NO   | PRI | NULL    |       |
| Dept_Name | varchar(50) | YES  | UNI | NULL    |       |
+-----------+-------------+------+-----+---------+-------+

Designation_masters;
+-------------+-------------+------+-----+---------+-------+
| Field       | Type        | Null | Key | Default | Extra |
+-------------+-------------+------+-----+---------+-------+
| Design_Code | int(3)      | NO   | PRI | NULL    |       |
| Design_Name | varchar(50) | YES  | UNI | NULL    |       |
+-------------+-------------+------+-----+---------+-------+


Emp;
+----------+--------------+------+-----+---------+-------+
| Field    | Type         | Null | Key | Default | Extra |
+----------+--------------+------+-----+---------+-------+
| EMPNO    | int(4)       | NO   |     | NULL    |       |
| ENAME    | varchar(10)  | YES  |     | NULL    |       |
| JOB      | varchar(9)   | YES  |     | NULL    |       |
| MGR      | int(4)       | YES  |     | NULL    |       |
| HIREDATE | date         | YES  |     | NULL    |       |
| SAL      | decimal(7,2) | YES  |     | NULL    |       |
| COMM     | decimal(7,2) | YES  |     | NULL    |       |
| DEPTNO   | int(2)       | YES  |     | NULL    |       |
+----------+--------------+------+-----+---------+-------+

Staff_masters;
+---------------+---------------+------+-----+---------+-------+
| Field         | Type          | Null | Key | Default | Extra |
+---------------+---------------+------+-----+---------+-------+
| Staff_Code    | int(8)        | NO   | PRI | NULL    |       |
| Staff_Name    | varchar(50)   | NO   |     | NULL    |       |
| Design_Code   | int(11)       | YES  |     | NULL    |       |
| Dept_Code     | int(11)       | YES  |     | NULL    |       |
| Staff_dob     | date          | YES  |     | NULL    |       |
| Hiredate      | date          | YES  |     | NULL    |       |
| Mgr_code      | int(8)        | YES  |     | NULL    |       |
| Staff_sal     | decimal(10,2) | YES  |     | NULL    |       |
| Staff_address | varchar(240)  | YES  |     | NULL    |       |
+---------------+---------------+------+-----+---------+-------+

Student_marks;
+--------------+---------+------+-----+---------+-------+
| Field        | Type    | Null | Key | Default | Extra |
+--------------+---------+------+-----+---------+-------+
| Student_Code | int(6)  | YES  |     | NULL    |       |
| Student_Year | int(11) | NO   |     | NULL    |       |
| Subject1     | int(3)  | YES  |     | NULL    |       |
| Subject2     | int(3)  | YES  |     | NULL    |       |
| Subject3     | int(3)  | YES  |     | NULL    |       |
+--------------+---------+------+-----+---------+-------+


Student_masters;
+-----------------+--------------+------+-----+---------+-------+
| Field           | Type         | Null | Key | Default | Extra |
+-----------------+--------------+------+-----+---------+-------+
| Student_Code    | int(6)       | NO   | PRI | NULL    |       |
| Student_Name    | varchar(50)  | NO   |     | NULL    |       |
| Dept_Code       | int(2)       | YES  |     | NULL    |       |
| Student_Dob     | date         | YES  |     | NULL    |       |
| Student_Address | varchar(240) | YES  |     | NULL    |       |
+-----------------+--------------+------+-----+---------+-------+