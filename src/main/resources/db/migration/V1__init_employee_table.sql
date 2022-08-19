DROP TABLE IF EXISTS employee;
CREATE TABLE employee(
    id int auto_increment primary key,
    first_name varchar(100) not null,
    last_name varchar(100) not null,
    email varchar(100)
);