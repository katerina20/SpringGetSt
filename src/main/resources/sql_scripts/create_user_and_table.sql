CREATE USER spring_user IDENTIFIED BY spring;
GRANT ALL PRIVILEGES TO spring_user;
CONNECT spring_user/spring;
CREATE TABLE flowers (id number(4), name varchar(30), color varchar(30));
INSERT INTO flowers VALUES(1, 'Chamomile', 'white');
INSERT INTO flowers VALUES(2, 'Rose', 'yellow');
INSERT INTO flowers VALUES(2, 'Eustoma', 'violet');
COMMIT;