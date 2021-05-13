create table Student(id number(3),name varchar2(20),age number(3));

insert into Student values(1,'Paras',20);
insert into Student values(2,'Paras',20);
insert into Student values(3,'Paras',20);
insert into Student values(4,'Paras',20);
insert into Student values(5,'Paras',20);
insert into Student values(6,'Paras3',20);
insert into Student values(7,'Paras',20);
insert into Student values(8,'Paras',20);
insert into Student values(9,'Paras',20);
insert into Student values(10,'Paras',20);
insert into Student values(11,'Paras',20);
insert into Student values(12,'Paras44',20);
insert into Student values(13,'Parast',20);
insert into Student values(15,'Parase',20);
insert into Student values(16,'Parass',20);
insert into Student values(17,'Parasq',20);

-- PL SQL
DECLARE
    name varchar2(20) := 'Paras';
BEGIN
    dbms_output.put_line(name);
END;


-- Subtype

DECLARE 
   SUBTYPE name IS char(20); 
   SUBTYPE message IS varchar2(100); 
   salutation name; 
   greetings message; 
BEGIN 
   salutation := 'Reader '; 
   greetings := 'Welcome to the World of PL/SQL'; 
   dbms_output.put_line('Hello ' || salutation || greetings); 
END; 
/ 

DECLARE 
    id Student.id%TYPE;
    name Student.name%TYPE;
    age Student.age%TYPE;
BEGIN
    SELECT id,name,age into id,name,age from Student where id = 1;
    dbms_output.put_line(id || name || age );
END;
/


-- Procedure
CREATE OR REPLACE PROCEDURE greetings 
AS 
BEGIN 
   dbms_output.put_line('Hello World!'); 
END; 
/


-- Find minimum of two numbers pl sql
DECLARE
    a number;
    b number;
    c number;
PROCEDURE findMin(x IN number,y in number,z out number)
IS 
BEGIN
    if x < y THEN
        z := x;
    else
        z := y;
    end if; 
END;
BEGIN
    a := 3;
    b := 4;
    findMin(a,b,c);
    dbms_output.put_line(c);
END;
/ 

-- Count the now of rows of the table  ---> finction
CREATE OR REPLACE FUNCTION total
RETURN number is 
tot number(3) := 0;
BEGIN
    SELECT count(*) into tot from student;
    return tot;
END;
/

DECLARE 
    tot number := 0;
BEGIN
    tot := total();
    dbms_output.put_line(tot);
END;
/

-- Cursors
DECLARE
    total_rows number(3) := 0;
BEGIN
    UPDATE Student set age =  age + 1;
    if sql%notfound THEN 
        dbms_output.put_line('No Records');
    elsif sql%found THEN
        total_rows := sql%rowcount;
        dbms_output.put_line(total_rows);
    end if;
END;
/

-- Explicit Cursor
--  DECLARE > OPEN > FETCH > CLOSE
DECLARE
    id student.id%TYPE;
    name student.name%TYPE;
    age student.age%TYPE;
    cursor stud is select id,name,age from student;
BEGIN   
    OPEN stud;
    LOOP
        FETCH stud into id,name,age;
        EXIT when stud%NOTFOUND;
        dbms_output.put_line(id || name ||age);
    END LOOP;
END;
/

