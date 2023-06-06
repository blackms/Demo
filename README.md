# Demo Application

This is a simple demo application that includes a controller with two endpoints. The first endpoint, `/demo`, returns a string message "This is a demo" when accessed. The second endpoint, `/sayBye`, returns a JSON object with a message "Bye from the API" when accessed.

## Running the Application

To run the application, you can use the `main` method in the `DemoApplication` class. This will start the Spring Boot application and make it available at `http://localhost:8080`.

## Testing the Application

The application includes a test class, `DemoApplicationTests`, which can be used to test the endpoints. The `contextLoads` method is a simple test that checks if the application context loads successfully.

To test the endpoints, you can use a tool like Postman or cURL to send requests to the endpoints and verify the responses.

## Conclusion

This demo application is a simple example of how to create a Spring Boot application with a controller and endpoints. It can be used as a starting point for more complex applications or as a reference for learning Spring Boot.