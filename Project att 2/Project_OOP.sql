
CREATE DATABASE javaproject;

\c javaproject


DROP TABLE IF EXISTS UsersProject3;


CREATE TABLE UsersProject3 (
    id SERIAL PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    mobile VARCHAR(255),
    course VARCHAR(255)
);


INSERT INTO UsersProject3 (username, password, mobile, course) VALUES
('Bigabatov', 'lubit', '69', 'C++'),
('Magzhan', 'Gensh', '69-69', 'C#'),
('Norm', 'Tema', '69-69-69', '3D model'),
('Eche', 'Odin', '69-69-69-69', 'OOP');
