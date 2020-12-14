# employee-portal
What we will build?
Basically, we have to create two projects:

employee-portal-service: This project is used to develop CRUD RESTFul APIs for a simple Employee Portal using Spring Boot 2, JPA and MySQL as a database.
employee-portal-ui: This project is used to develop single page application using Angular 8 as front-end technology. This Angular 8 application consumes CRUD Restful APIs developed and exposed by a employee-portal-service project.

In order to employee-portal-service we need to follow below steps
1. To run employee-portal-service we must have following softwares
		1. java8
		2. maven3.6.2 or maven3.6.3
2. clone project from git or download the code.
3. create 'demo' database in mysql
4. create employees in 'demo' database.
		CREATE TABLE employees1 (
			emp_id int NOT NULL AUTO_INCREMENT,
			first_name varchar(45) DEFAULT NULL,
			last_name varchar(45) DEFAULT NULL,
			gender varchar(45) DEFAULT NULL,
			dop varchar(45) DEFAULT NULL,
			department varchar(45) DEFAULT NULL,
			PRIMARY KEY (emp_id)
		) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
5. Navigate to employee-portal-service and run mvn clean install
6. to run the spring boot application navigate to target/ folder and use below command
	java -jar employee-portal-service-0.0.1-SNAPSHOT.jar
7. employee-portal-service will be running on port no 8082
8. open http://localhost:8082/swagger-ui.html and verify the apis.

	
In order to employee-portal-ui we need to follow below steps
1. To run employee-portal-ui we must have follwoing softwares
	1. node js(install nodejs in your local machine)
2. clone project from git or download the code.
3. Navigate to employee-portal-ui and Install npm by running npm install
4. run npm start
5. http://localhost:4200
6. click on the add button to create employees
7. click on the employees button to view list of employees in asscending order by employee first name.
