create table employee(empid number(10),job_title varchar2(30),manager varchar2(20));
select * from employee;

insert into employee values(1,'Engineer','ABC');
insert into employee values(2,'Doctor','ABC');
insert into employee values(3,'Scientist','IJK');
insert into employee values(4,'Air Force','ABC');
insert into employee values(5,'System Designer','EFG');
insert into employee values(6,'System Architect','ABC');
insert into employee values(7,'Software Developer','ABC');
insert into employee values(8,'Engineer','ABC');
insert into employee values(9,'Engineer','ABC');
insert into employee values(10,'Support Executive','DEF');
insert into employee values(11,'Scientist','ABC');

CREATE or Replace PROCEDURE my_proc
AS
BEGIN
    dbms_output.put_line('Hello World');
END;
/

BEGIN
my_proc;
END;
/


-- 2nd Demo
DECLARE
    x number := 100;
    y number := 20;
PROCEDURE myproc1(x IN number,y OUT number)
is
BEGIN
y := x*x;
END;
BEGIN
x := 20;
y := 10;
myproc1(x,y);
dbms_output.put_line(y);
END;
/

-- 3rd Demo  Illustrating the usage of cursor
DECLARE
    emp_id employee.empid%TYPE;
    emp_title employee.job_title%TYPE;
    CURSOR my_cur is SELECT empid,job_title from employee;
BEGIN
    OPEN my_cur;
    LOOP
        FETCH my_cur into emp_id,emp_title;
        EXIT WHEN my_cur%NOTFOUND;
        dbms_output.put_line(emp_id || ' --- ' || emp_title);
    END LOOP;
    CLOSE my_cur;
END;
/
    
-- FOr loop
DECLARE 
    a number(10) := 10;
BEGIN
    for i in 1 .. 3 LOOP
        dbms_output.put_line(i);
    END LOOP;
END;
/

-- While Loop
DECLARE 
   a number(2) := 10; 
BEGIN 
   WHILE a < 20 LOOP 
      dbms_output.put_line('value of a: ' || a); 
      a := a + 1; 
   END LOOP; 
END; 
/ 



    