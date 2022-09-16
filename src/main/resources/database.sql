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
INSERT INTO factory(id, name_factory,city_id) VALUES (1, 'ПрАТ "Азот"', 1);
INSERT INTO factory(id, name_factory,city_id) VALUES (2, 'ПрАТ "Черкаське хімволокно"', 1);
INSERT INTO factory(id, name_factory,city_id) VALUES (3, 'ПрАТ "Миронівська птахофабрика"', 1);


INSERT INTO element_factory(id, average_daily, code_element, hazard_class, is_excess, max_once, name_element, value_element, factory_id, message)
VALUES (1, -1, 337, 4, false, -1, 'Вуглецю оксид', 4, 1,'Зменшення обсягів виробництва');

INSERT INTO element_factory(id, average_daily, code_element, hazard_class, is_excess, max_once, name_element, value_element, factory_id, message)
VALUES (2, -1, 301, 3, false, -1, 'Азоту діоксид', 0.3, 1, 'Зменшення обсягів виробництва');

INSERT INTO element_factory(id, average_daily, code_element, hazard_class, is_excess, max_once, name_element, value_element, factory_id, message)
VALUES (3, -1, 303, 4, false, -1, 'Аміак', 0.1, 1, 'Зменшення обсягів виробництва');

INSERT INTO element_factory(id, average_daily, code_element, hazard_class, is_excess, max_once, name_element, value_element, factory_id, message)
VALUES (4, -1, 1836, 4, false, -1, 'Діетиланін',  0.005, 2,'Використання вугілля з меншим вмістом сірки');

INSERT INTO element_factory(id, average_daily, code_element, hazard_class, is_excess, max_once, name_element, value_element, factory_id, message)
VALUES (5, -1, 301, 3, false, -1, 'Азоту діоксид', 0.1, 2, 'Зменшення обсягів виробництва');

INSERT INTO element_factory(id, average_daily, code_element, hazard_class, is_excess, max_once, name_element, value_element, factory_id, message)
VALUES (6, -1, 1401, 4, false, -1, 'Ацетон', 0.4, 2, 'Встановлення додаткового очисного обладнання');

INSERT INTO element_factory(id, average_daily, code_element, hazard_class, is_excess, max_once, name_element, value_element, factory_id, message)
VALUES (7, -1, 602, 2, false, -1, 'Бензол', 1.2, 2, 'Встановлення додаткового очисного обладнання');

INSERT INTO element_factory(id, average_daily, code_element, hazard_class, is_excess, max_once, name_element, value_element, factory_id, message)
VALUES (8, -1, 337, 4, false, -1, 'Вуглецю оксид', 4, 3,'Обробка посліду для використання в якості палива');

INSERT INTO element_factory(id, average_daily, code_element, hazard_class, is_excess, max_once, name_element, value_element, factory_id, message)
VALUES (9, -1, 301, 3, false, -1, 'Азоту діоксид', 0.26, 3, 'Зменшення обсягів виробництва');

INSERT INTO element_factory(id, average_daily, code_element, hazard_class, is_excess, max_once, name_element, value_element, factory_id, message)
VALUES (10, -1, 10280, 2, false, -1, 'Дитолілметан', 0.02, 3,'Обробка посліду для використання в якості палива');

INSERT INTO element_factory(id, average_daily, code_element, hazard_class, is_excess, max_once, name_element, value_element, factory_id, message)
VALUES (11, -1, 1401, 4, false, -1, 'Ацетон', 0.2, 3, 'Встановлення додаткового очисного обладнання');