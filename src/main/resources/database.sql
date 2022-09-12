
use data;
insert into  data.elements (average_daily, code_element, hazard_class, max_once, name_element)
VALUES ( 0.66, 34, 4, 0.76, 'калій');

insert into data.elements (average_daily, code_element, hazard_class, max_once, name_element)
VALUES ( 0.6, 44, 5, 0.76, 'Силіцій');

INSERT INTO city (name_city) VALUES ('Черкаси');



DELETE FROM elements;
DELETE FROM city;

SELECT * FROM elements;
SELECT * FROM  city;