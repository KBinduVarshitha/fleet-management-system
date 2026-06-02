# Fleet Management and Route Optimization Engine

## Project Overview

This project is a Spring Boot and MySQL based Fleet Management System developed to manage vehicles, drivers, delivery tasks, and routes. The system provides REST APIs for fleet operations and serves as the foundation for route optimization and dispatch management.

---

## Features Implemented

### Vehicle Management

* Register new vehicles
* View all vehicles
* Update vehicle details
* Delete vehicles
* Track vehicle capacity, type, and status

### Driver Management

* Register new drivers
* View all drivers
* Store driver information and availability

### Delivery Task Management

* Create delivery tasks
* View all delivery tasks
* Track pickup and delivery locations
* Store package details

### Delivery Status Workflow

Implemented delivery state management using the following statuses:

* UNASSIGNED
* DISPATCHED
* IN_TRANSIT
* DELIVERED

Added API support to update delivery status dynamically.

### Route Management

* Create routes
* View all routes
* Store route information in the database

### Basic Route Optimization

Implemented an initial route optimization service that accepts a list of stops and returns an optimized sequence. This serves as the foundation for future integration with external routing APIs.

### Database Integration

* MySQL database configured
* Spring Data JPA repositories implemented
* Automatic table creation using Hibernate

### API Testing

All APIs have been tested using Postman and verified with MySQL database records.

---

## Technology Stack

* Java 17
* Spring Boot
* Spring Data JPA
* MySQL
* Maven
* Postman

---

## Project Structure

```text
controller/
service/
repository/
entity/
resources/
```

The project follows a layered architecture consisting of:

* Controllers for REST endpoints
* Services for business logic
* Repositories for database access
* Entities for database models
