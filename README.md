# 🛒 Microservices-Based E-commerce Backend System

This is a backend system built using **Spring Boot** and **Microservices architecture**. The project simulates the core services of an e-commerce system, including users, products, and orders, with each service running independently and using its own database.

---

## 🧱 Technologies Used

- Spring Boot  
- Spring Cloud Eureka (Service Discovery)  
- Spring Cloud Config (Centralized Configuration)  
- Spring Cloud Gateway (API Gateway)  
- MySQL (Separate DB per service)  
- Spring Data JPA  
- Maven  

---

## 📦 Microservices Included

| Service        | Description                              | Database |
|----------------|------------------------------------------|----------|
| **Eureka Server**     | Service registry for discovery         | -        |
| **Config Server**     | Centralized configuration management   | -        |
| **API Gateway**       | Routes requests to microservices       | -        |
| **User Service**      | Manages user data and auth             | MySQL    |
| **Product Service**   | Manages product data                   | MySQL    |
| **Order Service**     | Manages customer orders                | MySQL    |

Each service is connected to the Eureka server and reads its configuration from the Config Server using `application.properties` files.

---

## ⚙️ How It Works

- Each microservice is registered to the **Eureka Server**.
- Configuration files are stored in a **remote Git repo** and managed by the **Config Server**.
- The **API Gateway** handles routing to the proper microservice using service names.
- Each service is fully isolated and connected to its own **MySQL database**.

---

## 🚀 Getting Started

> To run the project locally, make sure you have:
- Java 17+
- Maven
- MySQL installed and running
- Git (for pulling config files)

1. Start the **Eureka Server**
2. Start the **Config Server**
3. Start the microservices (User, Product, Order)
4. Start the **API Gateway**
5. Test endpoints via Postman or any REST client

---

## 🗂 Project Structure

