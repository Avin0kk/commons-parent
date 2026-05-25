# Commons Parent - Multi-Module Maven Project

A multi-module Maven project demonstrating a layered architecture with shared commons.

## Project Structure

```
Commons_parent/
├── README.md
├── .gitignore
├── pom.xml
├── module-core/
│   ├── pom.xml
│   └── src/main/java/com/example/commons/
│       ├── dto/
│       │   └── UserDTO.java
│       └── interfaces/
│           └── CrudService.java
├── module-service/
│   ├── pom.xml
│   └── src/main/java/com/example/commons/
│       └── service/
│           └── UserService.java
└── module-web/
    ├── pom.xml
    └── src/main/java/com/example/commons/
        └── web/
            └── UserController.java
```

## Modules

### module-core
- `UserDTO` - Data Transfer Object for carrying user data between layers
- `CrudService<T, ID>` - Generic interface defining standard CRUD operations

### module-service
- `UserService` - Implements `CrudService`, contains business logic for user operations

### module-web
- `UserController` - Consumes `UserService` to handle user-related operations

## How to Build

Make sure you have **Java 17+** and **Maven** installed, then run from the root:

```bash
mvn clean install
```

## Tech Stack
- Java 17
- Apache Maven (Multi-module)

## Author
Avin Goel