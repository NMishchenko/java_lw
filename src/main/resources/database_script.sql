CREATE DATABASE IF NOT EXISTS UniversityDatabase;

USE UniversityDatabase;

CREATE TABLE IF NOT EXISTS students
(
    id              INT PRIMARY KEY,
    name            VARCHAR(255)        NOT NULL,
    surname         VARCHAR(255)        NOT NULL,
    patronymic      VARCHAR(255)        NOT NULL,
    sex             DATE                NOT NULL
);

INSERT INTO students (id, name, surname, patronymic, sex)
VALUES (123456, 'Smith', 'John', 'Hardworking', 1),
       (654321, 'Doe', 'Emily', 'Diligent', 2),
       (789456, 'Brown', 'Ethan', 'Persistent', 1),
       (987654, 'Kim', 'Olivia', 'Resilient', 2),
       (456789, 'Garcia', 'Noah', 'Resourceful', 1),
       (321654, 'Wang', 'Sophia', 'Curious', 2),
       (654987, 'Lee', 'James', 'Inquisitive', 1),
       (987123, 'Johnson', 'Emma', 'Analytical', 2),
       (852369, 'Davis', 'Daniel', 'Perceptive', 1),
       (369852, 'Anderson', 'Ava', 'Observant', 2),
       (147258, 'Martinez', 'Elijah', 'Insightful', 1),
       (258369, 'Taylor', 'Mia', 'Thoughtful', 2),
       (369147, 'Johnson', 'William', 'Judicious', 1),
       (741852, 'Wang', 'Lily', 'Prudent', 2),
       (852741, 'Lee', 'Ethan', 'Wise', 1),
       (963852, 'Garcia', 'Avery', 'Sensible', 2)
;