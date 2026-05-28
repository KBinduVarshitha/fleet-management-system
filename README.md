# Fleet Management System

## Project Overview

Fleet Management System is a backend-based application developed using Spring Boot and MySQL. The project helps manage vehicles, drivers, delivery tasks, and routes efficiently through REST APIs. It also includes a basic route optimization module for managing delivery paths.


## Technologies Used

* Java
* Spring Boot
* MySQL
* Spring Data JPA / Hibernate
* Maven
* Postman
* GitHub



## Features Implemented

 Vehicle Management

* Add vehicle
* View all vehicles
* Update vehicle details
* Delete vehicle

### Driver Management

* Add driver
* View all drivers

### Delivery Task Management

* Add delivery tasks
* View delivery tasks

### Route Management

* Add routes
* View routes

### Route Optimization

* Basic route optimization logic implemented

### Exception Handling

* Global exception handling added



## Project Structure


src/main/java/fleetmanagement
│
├── controller
├── entity
├── repository
├── service
├── exception
└── FleetmanagementApplication.java


## API Endpoints

### Vehicle APIs

| Method | Endpoint       |
| ------ | -------------- |
| GET    | /vehicles      |
| POST   | /vehicles      |
| PUT    | /vehicles/{id} |
| DELETE | /vehicles/{id} |
