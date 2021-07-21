# Connell Boyce's Blog and Portfolio

## Table of Contents
1. [Components](#1-components)
2. [Project Summary](#2-project-summary)
3. [Dependencies](#3-dependencies)
4. [API Endpoints](#4-api-endpoints)
5. [Resources Used](#5-resources-used)

### 1. Components
- Java 14
- Spring Boot 2.4.8
- Maven 3.6.3

### 2. Project Summary
 This project is an online portfolio and blog to display my accomplishments and any knowledge I wish to publish and share in the form of articles. The current repository is a Spring Boot back-end and middleware. It handles the authentication and persistence (within MongoDB) of the various operations the application will allow. The front-end is managed by a separate repository.

### 3. Dependencies
- Spring Boot
  - Starter Security
  - Security Core
  - Security Web
  - Security Config
  - Security Test
  - Starter Web
  - Starter Data MongoDB
  - Starter Validation
  - Starter Test
- Json Web Token
  - jjwt
- Javax
  - Validation
  - XML Bind API

### 4. API Endpoints
- Authentication
  - <b>POST:</b> Sign Up (/api/auth/signup)
    - Body: username, password, firstName, lastName, email, roles
  - <b>POST:</b> Log In (/api/auth/signin)
    - Body: username, password
  - <b>GET:</b> Get Current User's Username (/api/auth/current/username)
  - <b>GET:</b> Get Current User's UserId (/api/auth/current/id)

### 5. Resources Used
- [Pepper Garden Repository (reference material)](https://github.com/connellboyce/pepper-garden)
- [ATZ Finance Application (reference material)](https://github.com/connellboyce/finance-application)
