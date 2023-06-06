# Demo Application

This is a simple Spring Boot application that demonstrates basic API endpoints.

## Files

1. **DemoApplication.java**: The main class that runs the Spring Boot application.
2. **DemoController.java**: The controller class that contains the API endpoints.
3. **DemoApplicationTests.java**: The test class for the application.

## API Endpoints

1. `/demo`: Returns a simple text message "This is a demo".
2. `/sayHello`: Returns a JSON object with a message "Hello from the API".
3. `/sayBye`: Returns a JSON object with a message "Bye from the API".

## Running the Application

To run the application, execute the following command:
```
./mvnw spring-boot:run
```
## Running Tests

To run the tests, execute the following command:

```
./mvnw test
```

## Accessing the API

Once the application is running, you can access the API endpoints using a web browser or a tool like [Postman](https://www.postman.com/).

For example, to access the `/demo` endpoint, navigate to:

```
http://localhost:8080/demo
```