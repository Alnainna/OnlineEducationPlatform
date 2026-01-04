# Online Education Platform - Backend

## Description
Spring MVC REST API backend for Online Education Platform

## Technologies
- Spring Framework 5.3.10
- MyBatis 3.5.7
- MySQL 8.0
- Tomcat 9.0
- Maven

## Setup
```bash
cd OnlineEducationPlatform
mvn clean install
```

## Deployment
- Copy WAR to: /opt/tomcat/webapps/
- Start Tomcat
- Access at: http://localhost:8080/OnlineEducationPlatform

## API Endpoints
- GET /api/users - Get all users
- GET /api/users/{id} - Get user by ID
- POST /api/users - Create user
- PUT /api/users/{id} - Update user
- DELETE /api/users/{id} - Delete user
- GET /api/users/health - Health check

## Author
[Your Name]

## Date
[Date]
