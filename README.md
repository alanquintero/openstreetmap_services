# OpenStreetMap Services

Spring Boot application providing backend services for OpenStreetMap data.

## Running OpenStreetMap Services Locally

### 1. Prerequisites

- Java 17 or higher installed
- Maven installed (or use the included Maven wrapper)

### 2. Build and run the application

```bash
# Clean and run the app
mvn clean spring-boot:run
```

The app will start on http://localhost:8080

### 3. Access the endpoints

Default endpoint (home): http://localhost:8080/

Example API endpoint: http://localhost:8080/api/v1/geometries

### 4. Example output

Calling GET /api/v1/geometries will return JSON like:

```
[
  {
    "id": 1,
    "geometryType": "Polygon",
    "regionName": "MT MEADOWS AREA",
    "zipCode": "00012",
    "stateCode": "CA",
    "arcs": "[[0, 1, 2]]",
    "stateId": 5
  },
  {
    "id": 2,
    "geometryType": "Polygon",
    "regionName": "WEST PIMA COUNTY",
    "zipCode": "00014",
    "stateCode": "AZ",
    "arcs": "[[3, 4, 5, 6, 7]]",
    "stateId": 3
  }
]
```

### 5. Database

The app uses an in-memory H2 database preloaded from `data.sql`.

The `data.sql` file was generated using the project [jsonToQuery](https://github.com/alanquintero/jsonToQuery/) and will
reset each time the app restarts.

The data.sql file was generated with the next project:

### 6. Running Tests

```
mvn test
```
