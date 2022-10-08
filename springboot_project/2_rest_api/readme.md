# Develop a REST API in Springboot
Follow the below steps to develop a REST API using Spring Boot

### 1. What is REST ?
#### 1.1. Overview
#### 1.2. REST API - URL Structure


### 2. Project Structure
1. Open the project - [Calculator App](https://github.com/licet-gwc/gwc_2022/tree/main/springboot_project/1_project_setup/sample_app/calculator) in STS IDE.
2. By default, the main class contains the annotation
3. In STS Project Explorer, create the following packages under `com.gwc.calculator`
    - `service` - to Create the Service Layer which has the Java classes containing the Business Logic
    - `controller` - to create the Controller classes which has the REST endpoint details

### 3. Service Layer
1. The Sample App is a Calculator App. So we can assume the Business logic is to perform arithmetic operations like addition, subtraction etc.,.
2. Create a Service class under the package - `com.gwc.calculator.service` with following methods 
    - **Class Name:** `CalculatorService`
    - **Methods:** `getSum, getDifference etc.,`
3. Annotations used:
    - `@Service` annotation is used at the class level to expose it as a Service
4. Reference - *[CalculatorService.java](https://github.com/licet-gwc/gwc_2022/blob/main/springboot_project/2_rest_api/sample_app/calculator/src/main/java/com/gwc/calculator/service/CalculatorService.java)*

### 4. Controller
1. Create the Controller class under the package - `com.gwc.calculator.controller` and create the methods to invoke the service methods
    - **Class Name:** `CalculatorController`
    - **Methods:** `getSum, getDifference etc.,` - Each method calls the respective service method and returns the result from service method
2. Annotations used:
    - Service class is `@Autowired` so that the dependency on the Service class and its lifecycle is managed by Spring framework
    - `@RestController` is used at the class level to expose it as the controller for 1 or many RESTful endpoints.
    - `@RequestMapping` is used at the class level to create the base endpoint.
    - Annotations for HTTP method - `@GetMapping`, `@PostMapping`, `@DeleteMapping`, `@PutMapping`, `@PatchMapping`
        - These annotations are used at the method level to expose the endpoint which are accessed via respective HTTP method.
    - `@PathVariable` is used at the method parameter level to define if the parameter is included as part of the URL path.
        - If this annotation is not used for the parameter, then by default the respective parameter will be considered as Query parameter
    - `@RequestBody` is specifically in URLs with POST method, where the parameters are passed in the Request Body and not in the URL path. 

3. Reference - *[CalculatorController.java](https://github.com/licet-gwc/gwc_2022/blob/main/springboot_project/2_rest_api/sample_app/calculator/src/main/java/com/gwc/calculator/controller/CalculatorController.java)*

### 5. How to test REST API
1. Start the Springboot application
2. GET endpoints can be tested directly in the browser
3. Other than GET method, the endpoints can only be tested with a REST client
    - Software like [Postman](https://www.postman.com/downloads/), [ARC (Advanced REST Client - chrome plugin)](https://chrome.google.com/webstore/detail/advanced-rest-client/) etc., can be used

### 6. Swagger / Open API
1. Swagger / Open API specification provides a standard way to interface with the REST apis. This helps in easier documentation, testing and sharing of the REST apis without any reference to it source code.
2. In Spring Boot, Swagger UI can be enabled easily by adding the dependency - `springdoc-openapi-ui` from maven. The steps are as below.
3. Open the `pom.xml` file add the following content just above the line containing - `</dependencies>` and save it.
   ```
	<dependency>
		<groupId>org.springdoc</groupId>
		<artifactId>springdoc-openapi-ui</artifactId>
		<version>1.6.11</version>
	</dependency>
    ```
4. Add the following properties in `application.properties` file
    ```
    springdoc.swagger-ui.path=/swagger-ui.html
    springdoc.api-docs.path=/calculator/v1/api-docs
    springdoc.swagger-ui.operationsSorter=method
    ```
    
    - `springdoc.swagger-ui.path` - defines the URL path to access the Swagger UI page for testing the REST APIs
    - `springdoc.api-docs.path` - defines the URL path to access the API documentation in JSON format

5. Start the application after completing above steps, and then the Swagger UI page will be accessible via the URL - [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html) 
6. Reference - [https://swagger.io/specification/](https://swagger.io/specification/)

