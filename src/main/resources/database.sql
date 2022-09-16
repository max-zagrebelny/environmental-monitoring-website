use data;

DELETE FROM elements;

DELETE FROM element_factory;
DELETE FROM factory;
DELETE FROM city;


SELECT * FROM elements;
SELECT * FROM city;
SELECT * FROM factory;
SELECT * FROM element_factory;

INSERT INTO city (id, name_city) VALUES (1,'Черкаси');
INSERT INTO factory(id, name_factory,city_id) VALUES (1, 'Хімволокно', 1);
INSERT INTO factory(id, name_factory,city_id) VALUES (2, 'Фотоприбор', 1);
INSERT INTO factory(id, name_factory,city_id) VALUES (3, 'ФОП Ласунка', 1);

INSERT INTO element_factory(id, average_daily, code_element, hazard_class, is_excess, max_once, name_element, value_element, factory_id, message)
VALUES (1, -1, 301, 3, false, -1, 'Азоту діоксид', 0.3, 1, 'Встановлення додаткового очисного обладнання');

INSERT INTO element_factory(id, average_daily, code_element, hazard_class, is_excess, max_once, name_element, value_element, factory_id, message)
VALUES (2, -1, 1301, 2, false, -1, 'Акролеїн', 0.03, 1, 'Встановлення додаткового очисного обладнання');

INSERT INTO element_factory(id, average_daily, code_element, hazard_class, is_excess, max_once, name_element, value_element, factory_id, message)
VALUES (3, -1, 303, 4, false, -1, 'Аміак', 0.1, 1, 'Встановлення додаткового очисного обладнання');

INSERT INTO element_factory(id, average_daily, code_element, hazard_class, is_excess, max_once, name_element, value_element, factory_id, message)
VALUES (4, -1, 1401, 4, false, -1, 'Ацетон', 0.4, 2, 'Встановлення додаткового очисного обладнання');

INSERT INTO element_factory(id, average_daily, code_element, hazard_class, is_excess, max_once, name_element, value_element, factory_id, message)
VALUES (5, -1, 602, 2, false, -1, 'Бензол', 1.2, 2, 'Встановлення додаткового очисного обладнання');