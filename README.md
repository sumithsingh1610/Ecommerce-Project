# 🛒 E-Commerce Backend API

A production-style E-Commerce Backend application built using **Java**, **Spring Boot**, and **MySQL**. This project provides secure authentication, role-based authorization, and RESTful APIs for managing users, products, categories, carts, and orders.

---

## 🚀 Features

* 🔐 JWT Authentication & Authorization
* 👥 Role-Based Access Control (Admin/User)
* 🛍️ Product Management
* 📂 Category Management
* 🛒 Shopping Cart
* 📦 Order Management
* 👤 User Registration & Login
* ✅ Input Validation
* ⚠️ Global Exception Handling
* 📄 RESTful API Design

---

## 🛠️ Tech Stack

### Backend

* Java 17
* Spring Boot
* Spring Security
* Spring Data JPA (Hibernate)

### Database

* MySQL

### Authentication

* JWT (JSON Web Token)

### Tools

* Maven
* Git & GitHub
* Postman

---

## 📁 Project Structure

```text
src
├── controller
├── service
├── repository
├── entity
├── dto
├── security
├── exception
├── config
└── util
```

---

## 🔑 Modules

### Authentication

* Register User
* Login User
* JWT Token Generation
* Secure API Access

### Product

* Add Product
* Update Product
* Delete Product
* Get Product List

### Category

* Create Category
* Update Category
* Delete Category
* Get Categories

### Cart

* Add to Cart
* Remove from Cart
* Update Quantity
* View Cart

### Order

* Place Order
* Order History
* Order Details

---

## 🗄️ Database

* User
* Role
* Product
* Category
* Cart
* Cart Item
* Order
* Order Item

---

## 🔐 Security

* Spring Security
* BCrypt Password Encryption
* JWT Authentication
* Role-Based Authorization
* Protected REST APIs

---

## 📬 API Testing

The APIs can be tested using **Postman**.

Example endpoints:

```http
POST /api/auth/register
POST /api/auth/login

GET /api/products
POST /api/products

GET /api/categories
POST /api/categories

POST /api/cart
GET /api/cart

POST /api/orders
GET /api/orders
```

---

## ▶️ Getting Started

### Clone Repository

```bash
git clone <repository-url>
```

### Configure Database

Update `application.properties`

```properties
spring.datasource.url=
spring.datasource.username=
spring.datasource.password=
```

### Run Project

```bash
mvn spring-boot:run
```

---

## 📌 Future Improvements

* Redis Caching
* Docker Support
* Payment Gateway Integration
* Email Notifications
* Swagger/OpenAPI Documentation
* Unit & Integration Testing
* Microservices Architecture

---

## 👨‍💻 Author

**Sumith Singh**

* LinkedIn: https://www.linkedin.com/in/sumith-singh-
* GitHub: https://github.com/sumithsingh1610

---

⭐ If you found this project useful, consider giving it a star.
