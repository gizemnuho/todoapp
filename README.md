# ✅ Todo App

This is a simple "To-Do" application built using Spring Boot.  
It allows users to create, list, update, and delete tasks through a clean REST API.

---

## 🚀 Features

- Add tasks
- List tasks
- Update tasks
- Delete tasks
- Simple and clean REST API structure

---

## 🛠️ Technologies Used

- Java 21 (or higher, e.g., Java 24)
- Spring Boot
- Spring Data JPA
- MySQL
- Lombok

---




🌐 API Endpoint Examples
GET /tasks — Get all tasks

POST /tasks — Create a new task

PUT /tasks/{id} — Update an existing task

DELETE /tasks/{id} — Delete a task

## ⚙️ Installation

```bash
git clone https://github.com/gizemnuho/todoapp.git
cd todoapp



Make sure you have MySQL installed and running.
Create a database named, for example, todoapp_db, and update your application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/todoapp_db
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
spring.jpa.hibernate.ddl-auto=update

Then run the project:
./mvnw spring-boot:run



