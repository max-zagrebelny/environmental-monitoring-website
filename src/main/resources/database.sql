use data;

DELETE FROM elements;

DELETE FROM element_factory;
DELETE FROM factory;
DELETE FROM city;
DELETE FROM environmental_tax;
DELETE FROM concentration;
DELETE FROM population_loss;
DELETE FROM animal_loss;

SELECT * FROM elements;
SELECT * FROM city;
SELECT * FROM factory;
SELECT * FROM element_factory;
SELECT * FROM environmental_tax;
SELECT * FROM concentration;
SELECT * FROM population_loss;
SELECT * FROM animal_loss;

INSERT INTO city (id, name_city, city_year) VALUES (1,'Черкаси', 2021);
INSERT INTO factory(id, name_factory,city_id, population_id) VALUES (1, 'ПрАТ "Азот"', 1, 1);
INSERT INTO factory(id, name_factory,city_id, population_id) VALUES (2, 'ПрАТ "Черкаське хімволокно"', 1, 2);
INSERT INTO factory(id, name_factory,city_id, animal_id, population_id) VALUES (3, 'ПрАТ "Миронівська птахофабрика"', 1, 1, 3);


INSERT INTO element_factory(id, is_excess, name_element, value_element, factory_id, message, percentage, total_emissions, code_tax, element_id, concentration_id)
VALUES (1, false, 'Вуглецю оксид', 4, 1,'Зменшення обсягів виробництва', 0, 282.278, 9, 337, 630080);

INSERT INTO element_factory(id, is_excess, name_element, value_element, factory_id, message, percentage, total_emissions, code_tax, element_id, concentration_id)
VALUES (2, false, 'Азоту діоксид', 0.3, 1, 'Зменшення обсягів виробництва', 0, 1025.964, 1, 301, 102440);

INSERT INTO element_factory(id, is_excess,  name_element, value_element, factory_id, message, percentage, total_emissions, code_tax, element_id, concentration_id)
VALUES (3, false, 'Аміак', 0.1, 1, 'Зменшення обсягів виробництва', 0, 885.287 , 2, 303, 7664417);

INSERT INTO element_factory(id, is_excess, name_element, value_element, factory_id, message, percentage, total_emissions, code_tax, element_id)
VALUES (4, false, 'Амонію сульфат', 0.12, 1, 'Зменшення обсягів виробництва', 0, 15.287 , 41, 351);


INSERT INTO element_factory(id, is_excess, name_element, value_element, factory_id, message, percentage, total_emissions, code_tax, element_id, concentration_id)
VALUES (5, false, 'Діетиланілін',  0.005, 2,'Використання вугілля з меншим вмістом сірки', 0, 43.568, 26, 1836, 121697);

INSERT INTO element_factory(id, is_excess, name_element, value_element, factory_id, message, percentage, total_emissions, code_tax, element_id, concentration_id)
VALUES (6, false, 'Азоту діоксид', 0.1, 2, 'Зменшення обсягів виробництва', 0, 790.465, 1, 301, 102440);

INSERT INTO element_factory(id,  is_excess, name_element, value_element, factory_id, message, percentage, total_emissions, code_tax, element_id, concentration_id)
VALUES (7, false, 'Ацетон', 0.4, 2, 'Встановлення додаткового очисного обладнання', 0, 3644.966, 4, 1401, 67641);

INSERT INTO element_factory(id, is_excess, name_element, value_element, factory_id, message, percentage, total_emissions, code_tax, element_id, concentration_id)
VALUES (8, false, 'Бензол', 1.2, 2, 'Встановлення додаткового очисного обладнання', 0, 1792.437, 10, 602, 71432);

INSERT INTO element_factory(id, is_excess, name_element, value_element, factory_id, message, percentage, total_emissions, code_tax, element_id, concentration_id)
VALUES (9, false, 'Вуглецю оксид', 4, 3,'Обробка посліду для використання в якості палива', 0, 19.172, 9, 337, 630080);

INSERT INTO element_factory(id, is_excess, name_element, value_element, factory_id, message, percentage, total_emissions, code_tax, element_id, concentration_id)
VALUES (10, false, 'Азоту діоксид', 0.26, 3, 'Зменшення обсягів виробництва', 0, 73.255, 1, 301, 102440);

INSERT INTO element_factory(id, is_excess, name_element, value_element, factory_id, message, percentage, total_emissions, code_tax, element_id)
VALUES (11, false, 'Дитолілметан', 0.02, 3,'Обробка посліду для використання в якості палива', 0, 5.001, 51, 10280);

INSERT INTO element_factory(id,  is_excess, name_element, value_element, factory_id, message, percentage, total_emissions, code_tax, element_id, concentration_id)
VALUES (12, false, 'Ацетон', 0.2, 3, 'Встановлення додаткового очисного обладнання', 0, 10.344, 4, 1401, 67641);

INSERT INTO environmental_tax(id, type_elements, name_element, tax_rates)
VALUES(1, 'Викиди в атмосферне повітря', 'Азоту оксиди',  2574.43 );

INSERT INTO environmental_tax(id, type_elements, name_element, tax_rates)
VALUES(2, 'Викиди в атмосферне повітря', 'Аміак', 482.84);

INSERT INTO environmental_tax(id, type_elements, name_element, tax_rates)
VALUES(3, 'Викиди в атмосферне повітря', 'Ангідрид сірчистий', 2574.43 );

INSERT INTO environmental_tax(id, type_elements, name_element, tax_rates)
VALUES(4, 'Викиди в атмосферне повітря', 'Ацетон', 965.67 );

INSERT INTO environmental_tax(id, type_elements, name_element, tax_rates)
VALUES(5, 'Викиди в атмосферне повітря', 'Бензопірен', 3277278.63);

INSERT INTO environmental_tax(id, type_elements, name_element, tax_rates)
VALUES(6, 'Викиди в атмосферне повітря', 'Бутилацетат', 579.84 );

INSERT INTO environmental_tax(id, type_elements, name_element, tax_rates)
VALUES(7, 'Викиди в атмосферне повітря', 'Ванадію п’ятиокис', 9656.78 );

INSERT INTO environmental_tax(id, type_elements, name_element, tax_rates)
VALUES(8, 'Викиди в атмосферне повітря', 'Водень хлористий', 96.99 );

INSERT INTO environmental_tax(id, type_elements, name_element, tax_rates)
VALUES(9, 'Викиди в атмосферне повітря', 'Вуглецю окис', 96.99);

INSERT INTO environmental_tax(id, type_elements, name_element, tax_rates)
VALUES(10, 'Викиди в атмосферне повітря', 'Вуглеводні', 145.50);

INSERT INTO environmental_tax(id, type_elements, name_element, tax_rates)
VALUES(11, 'Викиди в атмосферне повітря', 'Газоподібні фтористі сполуки', 6373.91);

INSERT INTO environmental_tax(id, type_elements, name_element, tax_rates)
VALUES(12, 'Викиди в атмосферне повітря', 'Тверді речовини', 96.99 );

INSERT INTO environmental_tax(id, type_elements, name_element, tax_rates)
VALUES(13, 'Викиди в атмосферне повітря', 'Кадмію сполуки',  20376.22);

INSERT INTO environmental_tax(id, type_elements, name_element, tax_rates)
VALUES(14, 'Викиди в атмосферне повітря', 'Марганець та його сполуки', 20376.22);

INSERT INTO environmental_tax(id, type_elements, name_element, tax_rates)
VALUES(15, 'Викиди в атмосферне повітря', 'Нікель та його сполуки', 103816.62 );

INSERT INTO environmental_tax(id, type_elements, name_element, tax_rates)
VALUES(16, 'Викиди в атмосферне повітря', 'Озон', 2574.43 );

INSERT INTO environmental_tax(id, type_elements, name_element, tax_rates)
VALUES(17, 'Викиди в атмосферне повітря', 'Ртуть та її сполуки', 109127.84 );

INSERT INTO environmental_tax(id, type_elements, name_element, tax_rates)
VALUES(18, 'Викиди в атмосферне повітря', 'Свинець та його сполуки', 109127.84 );

INSERT INTO environmental_tax(id, type_elements, name_element, tax_rates)
VALUES(19, 'Викиди в атмосферне повітря', 'Сірководень', 8273.63 );

INSERT INTO environmental_tax(id, type_elements, name_element, tax_rates)
VALUES(20, 'Викиди в атмосферне повітря', 'Сірковуглець', 5376.59 );

INSERT INTO environmental_tax(id, type_elements, name_element, tax_rates)
VALUES(21, 'Викиди в атмосферне повітря', 'Спирт н-бутиловий', 2574.43);

INSERT INTO environmental_tax(id, type_elements, name_element, tax_rates)
VALUES(22, 'Викиди в атмосферне повітря', 'Стирол', 18799.08 );

INSERT INTO environmental_tax(id, type_elements, name_element, tax_rates)
VALUES(23, 'Викиди в атмосферне повітря', 'Фенол', 11685.10);

INSERT INTO environmental_tax(id, type_elements, name_element, tax_rates)
VALUES(24, 'Викиди в атмосферне повітря', 'Формальдегід', 6373.91);

INSERT INTO environmental_tax(id, type_elements, name_element, tax_rates)
VALUES(25, 'Викиди в атмосферне повітря', 'Хром та його сполуки', 69113.38);


INSERT INTO environmental_tax(id, type_elements, name_element, hazard_class, tax_rates)
VALUES(26, 'Викиди в атмосферне повітря', 'Атмосферні',  1,  18413.24);

INSERT INTO environmental_tax(id, type_elements, name_element, hazard_class, tax_rates)
VALUES(27, 'Викиди в атмосферне повітря', 'Атмосферні',  2, 4216.92);

INSERT INTO environmental_tax(id, type_elements, name_element, hazard_class, tax_rates)
VALUES(28, 'Викиди в атмосферне повітря', 'Атмосферні',  3, 628.32);

INSERT INTO environmental_tax(id, type_elements, name_element, hazard_class, tax_rates)
VALUES(29, 'Викиди в атмосферне повітря', 'Атмосферні',  4, 145.50);


INSERT INTO environmental_tax(id, type_elements, name_element, concentration, tax_rates)
VALUES(30, 'Викиди в атмосферне повітря', 'Атмосферні', 0.0001, 775097.25 );

INSERT INTO environmental_tax(id, type_elements, name_element, concentration, tax_rates)
VALUES(31, 'Викиди в атмосферне повітря', 'Атмосферні', 0.001, 66410.35   );

INSERT INTO environmental_tax(id, type_elements, name_element, concentration, tax_rates)
VALUES(32, 'Викиди в атмосферне повітря', 'Атмосферні', 0.01, 9173.92 );

INSERT INTO environmental_tax(id, type_elements, name_element, concentration, tax_rates)
VALUES(33, 'Викиди в атмосферне повітря', 'Атмосферні', 0.1, 2574.43 );

INSERT INTO environmental_tax(id, type_elements, name_element, concentration, tax_rates)
VALUES(34, 'Викиди в атмосферне повітря', 'Атмосферні', 0.11, 96.99 );



INSERT INTO environmental_tax(id, type_elements, name_element, tax_rates)
VALUES(35, 'Cкиди окремих забруднюючих речовин у водні об’єкти','Азот амонійний', 12883.84 );

INSERT INTO environmental_tax(id, type_elements, name_element, tax_rates)
VALUES(36, 'Cкиди окремих забруднюючих речовин у водні об’єкти', 'Органічні речовини', 5156.8 );

INSERT INTO environmental_tax(id, type_elements, name_element, tax_rates)
VALUES(37, 'Cкиди окремих забруднюючих речовин у водні об’єкти', 'Завислі речовини', 369.52 );

INSERT INTO environmental_tax(id, type_elements, name_element, tax_rates)
VALUES(38, 'Cкиди окремих забруднюючих речовин у водні об’єкти', 'Нафтопродукти', 75792.4 );

INSERT INTO environmental_tax(id, type_elements, name_element, tax_rates)
VALUES(39, 'Cкиди окремих забруднюючих речовин у водні об’єкти', 'Нітрати', 1108.56 );

INSERT INTO environmental_tax(id, type_elements, name_element, tax_rates)
VALUES(40, 'Cкиди окремих забруднюючих речовин у водні об’єкти', 'Нітрити', 63278.16 );

INSERT INTO environmental_tax(id, type_elements, name_element, tax_rates)
VALUES(41, 'Cкиди окремих забруднюючих речовин у водні об’єкти', 'Сульфати', 369.52 );

INSERT INTO environmental_tax(id, type_elements, name_element, tax_rates)
VALUES(42, 'Cкиди окремих забруднюючих речовин у водні об’єкти', 'Фосфати', 10297.44 );

INSERT INTO environmental_tax(id, type_elements, name_element, tax_rates)
VALUES(43, 'Cкиди окремих забруднюючих речовин у водні об’єкти', 'Хлориди', 369.52 );


INSERT INTO environmental_tax(id, type_elements, name_element, concentration, tax_rates)
VALUES(44, 'Cкиди окремих забруднюючих речовин у водні об’єкти', 'Водні', 0.001, 1349948.0 );

INSERT INTO environmental_tax(id, type_elements, name_element, concentration, tax_rates)
VALUES(45, 'Cкиди окремих забруднюючих речовин у водні об’єкти','Водні', 0.1, 978777.84 );

INSERT INTO environmental_tax(id, type_elements, name_element, concentration, tax_rates)
VALUES(46, 'Cкиди окремих забруднюючих речовин у водні об’єкти','Водні', 1, 168741.52 );

INSERT INTO environmental_tax(id, type_elements, name_element, concentration, tax_rates)
VALUES(47, 'Cкиди окремих забруднюючих речовин у водні об’єкти','Водні', 10, 17173.04 );

INSERT INTO environmental_tax(id, type_elements, name_element, concentration, tax_rates)
VALUES(48, 'Cкиди окремих забруднюючих речовин у водні об’єкти','Водні', 11, 3437.76 );



INSERT INTO environmental_tax(id, type_elements, name_element, hazard_class, tax_rates)
VALUES(49, 'Розміщення відходів', 'Розміщення в межах населеного пункту або на відстані менш як 3 км від таких меж', 1, 4638.66 );

INSERT INTO environmental_tax(id, type_elements, name_element, hazard_class, tax_rates)
VALUES(50, 'Розміщення відходів', 'Розміщення на відстані від 3 км і більше від меж населеного пункту', 1, 1546.22 );

INSERT INTO environmental_tax(id, type_elements, name_element, hazard_class, tax_rates)
VALUES(51, 'Розміщення відходів', 'Розміщення в межах населеного пункту або на відстані менш як 3 км від таких меж', 2, 168.96);

INSERT INTO environmental_tax(id, type_elements, name_element, hazard_class, tax_rates)
VALUES(52, 'Розміщення відходів', 'Розміщення на відстані від 3 км і більше від меж населеного пункту', 2, 56.32 );


INSERT INTO environmental_tax(id, type_elements, name_element, hazard_class, tax_rates)
VALUES(53, 'Розміщення відходів', 'Розміщення в межах населеного пункту або на відстані менш як 3 км від таких меж', 3, 42.36 );

INSERT INTO environmental_tax(id, type_elements, name_element, hazard_class, tax_rates)
VALUES(54, 'Розміщення відходів', 'Розміщення на відстані від 3 км і більше від меж населеного пункту', 3, 14.12 );


INSERT INTO environmental_tax(id, type_elements, name_element, hazard_class, tax_rates)
VALUES(55, 'Розміщення відходів', 'Розміщення в межах населеного пункту або на відстані менш як 3 км від таких меж', 4, 16.5 );

INSERT INTO environmental_tax(id, type_elements, name_element, hazard_class, tax_rates)
VALUES(56, 'Розміщення відходів', 'Розміщення на відстані від 3 км і більше від меж населеного пункту', 4, 5.50 );


INSERT INTO environmental_tax(id, type_elements, name_element, hazard_class, tax_rates)
VALUES(57, 'Розміщення відходів', 'Розміщення в межах населеного пункту або на відстані менш як 3 км від таких меж', 5, 1.62);

INSERT INTO environmental_tax(id, type_elements, name_element, hazard_class, tax_rates)
VALUES(58, 'Розміщення відходів', 'Розміщення на відстані від 3 км і більше від меж населеного пункту', 5, 0.54);

INSERT INTO environmental_tax(id, type_elements, name_element, tax_rates)
VALUES(59, 'Утворення радіоактивних відходів', 'Радіоактивні', 50 );


INSERT INTO environmental_tax(id, type_elements, name_element, tax_rates)
VALUES(60, 'Тимчасове зберігання радіоактивних відходів', 'Високоактивні', 21084.66 );

INSERT INTO environmental_tax(id, type_elements, name_element, tax_rates)
VALUES(61, 'Тимчасове зберігання радіоактивних відходів', 'Середньоактивні та низькоактивні', 4216.92);


INSERT INTO concentration(id, critical_organs, rfc, type_risk, is_carcinogen)
VALUES(102440, 'Органи дихання', 0.04, 'Інгаляційний вплив', '-');

INSERT INTO concentration(id, critical_organs, rfc, type_risk, is_carcinogen)
VALUES(630080, 'ЦНС, серц.-суд.,кров', 0.0, 'Інгаляційний вплив', '-');

INSERT INTO concentration(id, critical_organs, rfc, type_risk, is_carcinogen)
VALUES(7664417, 'Органи дихання', 0.1, 'Інгаляційний вплив', '-');

INSERT INTO concentration(id, critical_organs, rfc, type_risk, is_carcinogen)
VALUES(67641, 'Печінка, нирки, ЦНС', 30, 'Інгаляційний вплив', '-');

INSERT INTO concentration(id, critical_organs, rfc, sf, type_risk, is_carcinogen)
VALUES(71432, 'Розвиток, кров, ЦНС', 0.06, 0.027, 'Інгаляційний вплив', '+');

INSERT INTO concentration(id, critical_organs, rfc, type_risk, is_carcinogen)
VALUES(121697, 'Розвиток, кров, ЦНС', 0.0055, 'Інгаляційний вплив', '-');




INSERT INTO population_loss(id, cch, min, mln, mtn, mzn, vd, nz)
VALUES(1, 4.0, 10.0, 40.0, 5.0, 4.0, 15.0, 4.0),
		(2, 2.0, 9.0, 20.0, 2.0, 2.0, 16.0, 2.0),
        (3, 1.0, 4.0, 10.0, 1.0, 0.0, 0.0, 0.0);

INSERT INTO animal_loss(id, amount_damages, total_weight) VALUE (1, 70000.0, 3.0);