use data;
insert into  data.elements (average_daily, code_element, hazard_class, max_once, name_element)
VALUES ( 0.66, 34, 4, 0.76, 'Калій');

insert into data.elements (average_daily, code_element, hazard_class, max_once, name_element)
VALUES ( 0.6, 44, 5, 0.76, 'Силіцій');





DELETE FROM elements;
DELETE FROM city;
DELETE FROM element_factory;
DELETE FROM factory;

SELECT * FROM elements;
SELECT * FROM  city;
SELECT * FROM factory;
SELECT * FROM element_factory;
