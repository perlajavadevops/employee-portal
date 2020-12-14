CREATE TABLE employees (
			emp_id int NOT NULL AUTO_INCREMENT,
			first_name varchar(45) DEFAULT NULL,
			last_name varchar(45) DEFAULT NULL,
			gender varchar(45) DEFAULT NULL,
			dop varchar(45) DEFAULT NULL,
			department varchar(45) DEFAULT NULL,
			PRIMARY KEY (emp_id)
		) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
