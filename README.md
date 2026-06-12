# Fleet Management and Route Optimization Engine

## Overview

The Fleet Management and Route Optimization Engine is a Spring Boot-based backend application developed to manage fleet operations efficiently. It provides REST APIs for managing vehicles, drivers, delivery tasks, and routes while also optimizing delivery routes using the Nearest Neighbor Algorithm. The project is integrated with MySQL for persistent data storage, documented using Swagger UI, and containerized using Docker for easy deployment.

---

## Features

- Driver Management
  - Add new drivers
  - View all drivers

- Vehicle Management
  - Add new vehicles
  - View all vehicles
  - Track vehicle status

- Route Management
  - Create and manage delivery routes
  - Assign vehicles and drivers

- Delivery Task Management
  - Create delivery tasks
  - Update task status
  - Validate delivery workflow:
    - UNASSIGNED → DISPATCHED → IN_TRANSIT → DELIVERED

- Route Optimization
  - Optimize delivery routes using the Nearest Neighbor Algorithm
  - Calculate distances between delivery points
  - Return optimized route sequence

- Exception Handling
  - Global exception handling
  - Resource not found handling

- API Documentation
  - Interactive API testing using Swagger UI

- Docker Support
  - Dockerized application for easy deployment

---

## Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Swagger (OpenAPI)
- Docker
- REST APIs

---

## Project Structure

```
src
 ├── controller
 ├── service
 ├── repository
 ├── entity
 ├── dto
 ├── exception
 ├── config
 └── resources
```

---

## Route Optimization

The application uses the **Nearest Neighbor Algorithm** to optimize delivery routes.

### Workflow

1. Start from the first delivery location.
2. Calculate the distance to every unvisited location.
3. Select the nearest location.
4. Mark it as visited.
5. Repeat until all locations are covered.
6. Return the optimized route.

---

## API Endpoints

### Drivers

- GET /drivers
- POST /drivers

### Vehicles

- GET /vehicles
- POST /vehicles

### Routes

- GET /routes
- POST /routes

### Delivery Tasks

- GET /tasks
- POST /tasks
- PUT /tasks/{id}/status

### Route Optimization

- POST /optimize-route

---

## Swagger UI

After starting the application, open:

```
http://localhost:8080/swagger-ui/index.html
```

Swagger provides:

- API documentation
- API testing
- Request/Response examples

---

## Database

Database: **MySQL**

Tables:

- Driver
- Vehicle
- Route
- DeliveryTask

---

## Docker

### Build Image

```bash
docker build -t fleet-management .
```

### Run Container

```bash
docker run -d -p 8080:8080 --name fleet-management fleet-management
```

