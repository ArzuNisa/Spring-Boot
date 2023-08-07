
# Spring Boot

This project is a starter project for a Spring Boot learning path.


![Logo](https://miro.medium.com/v2/resize:fit:700/0*R60lnmJl4hanOBaJ.png)


Spring Boot is a project built on top of the Java-based open-source framework, Spring Framework. It is a solution that simplifies and accelerates the development of web and enterprise applications using the Spring Framework.

Spring Boot applications typically follow a three-tier architecture: presentation layer, business layer, and persistence layer. Each layer has specific responsibilities and organizes the functionalities of the application at different levels. Here are brief descriptions of these layers:

1. **Presentation Layer**:
    - The presentation layer is the layer where users interact with the application.
    - In this layer, controllers receive incoming HTTP requests and direct them to the appropriate business layer.
    - It validates and processes incoming data, and then passes the data to the view layer to be sent to the user interface.
    - In Spring Boot applications, this layer consists of classes marked with **`@RestController`** and **`@Controller`** annotations.

2. **Business Layer**:
    - The business layer is where the application's business logic and operations reside.
    - In this layer, data is processed, business rules are applied, and data is prepared for use in the business layer.
    - Tasks such as data validation, processing, and forwarding to the persistence layer are performed in this layer.
    - In Spring Boot applications, this layer includes service classes marked with the **`@Service`** annotation, which handle business logic operations.

3. **Persistence Layer**:
    - The persistence layer is responsible for the database and the permanent storage of data.
    - This layer handles tasks like saving, updating, deleting data in the database, and retrieving data from it.
    - Database operations are typically performed using Object-Relational Mapping (ORM) technology, allowing data to be represented as objects.
    - In Spring Boot applications, this layer includes Repository classes marked with the **`@Repository`** annotation, which manage database operations, often using JPA (Java Persistence API) or other ORM tools.



## RestController
- "RestController" is a Java class in the Spring Framework, and it is commonly used to provide RESTful web services. This class focuses on returning data in response to HTTP requests and typically sends data to clients in formats like JSON or XML. It is a specialized type of "Controller" class and offers a structure that facilitates data exchange in modern web applications.

## RequestMapping
- "RequestMapping" is a Java annotation within the Spring Framework, used inside a "RestController" or "Controller" class to handle HTTP requests. The "RequestMapping" annotation is used to map HTTP request methods (GET, POST, PUT, DELETE, etc.) and specific URL paths to methods in the class. This annotation directs HTTP requests made to a specific URL path in a Spring application to the specified method, and the return value of that method is sent as the HTTP response back to the client.



| HTTP Method | Spring Annotation | Description                                                                                       |
|-------------|-------------------|---------------------------------------------------------------------------------------------------|
| GET         | `@GetMapping`     | Used to handle HTTP GET requests. Typically used for data retrieval or fetching operations.    |
| POST        | `@PostMapping`    | Used to handle HTTP POST requests. Typically used for creating or saving new data.             |
| PUT         | `@PutMapping`     | Used to handle HTTP PUT requests. Typically used for updating existing records or creating new ones. |
| PATCH       | `@PatchMapping`   | Used to handle HTTP PATCH requests. Typically used for partial updates to an existing record.   |
| DELETE      | `@DeleteMapping`  | Used to handle HTTP DELETE requests. Typically used for deleting a specified record.           |


## PathVariable & RequestParam
- The **`@PathVariable`** annotation allows us to easily obtain URL-based parameters by mapping variable values from the URL to Java method parameters. This is particularly useful when using dynamic URL paths in RESTful web services.

- The **`@RequestParam`** annotation is used to map query parameters from the URL to method parameters, making it easy to retrieve data provided by the client. This is especially helpful for data querying and filtering scenarios.

There are significant differences between @PathVariable and @RequestParam annotations, and they are used for different purposes:

##### @PathVariable:

The @PathVariable annotation is used to map variables present in dynamic URL paths to Java method parameters. This annotation is used to extract variable values that are part of the URL. For example, it can be used to extract the "{name}" variable from URL paths like "/hello/{name}".This annotation is useful in RESTful services to uniquely identify resources and make the URL structure more meaningful.
##### @RequestParam:

The @RequestParam annotation is used to map query parameters (parameters in the URL separated by "?") of an HTTP request to Java method parameters.
This annotation is used to extract parameters present in the URL. For example, it can be used to extract the "name" query parameter from a URL like "/hello?name=John".
This annotation can be used in scenarios like filtering, search criteria, and pagination.

- The @PathVariable annotation is used to retrieve variables present in dynamic URL paths, while the @RequestParam annotation is used to retrieve HTTP request query parameters. Both are annotations within the Spring Framework used to pass data to Java methods for different scenarios.

- The 'required' attribute is used with the @RequestParam or @PathVariable annotations to specify whether the associated parameters are mandatory.

- The 'defaultValue' attribute is used with the @RequestParam or @PathVariable annotations to set default values for the associated parameters. It allows you to define an alternative default value to be used if the parameter is not provided or its value is empty. This helps avoid unwanted behavior and provides a better user experience in cases where a specific parameter is missing or empty.

## RequestHeader
- **`@RequestHeader`** annotation is used within a Java method in the Spring Framework to access the header information of an HTTP request. When an HTTP request is transmitted, clients may add certain header information, including details about the request and other metadata. The @RequestHeader annotation binds a specific header with its name to a method parameter. This allows easy access and utilization of the header information sent by the client.

## RequestBody
- **`@RequestBody`** annotation is used within a Java method in the Spring Framework to fetch data from the body of an HTTP request. It is commonly used for handling HTTP POST and HTTP PUT requests, where data sent by the client (in formats like JSON, XML, or others) needs to be received. The @RequestBody annotation binds the data sent by the client to a Java object, converting it into a method parameter. This facilitates processing and using the data in the application.

## Spring Boot Reflection
- "Spring Boot Reflection" is a feature within the Spring Boot framework that utilizes Java's "reflection" mechanism. Reflection is the ability to inspect and even modify the structure of a class (fields, methods, constructors, etc.) at runtime. With Spring Boot Reflection, it becomes possible to access and dynamically modify the properties of classes and objects during the application's runtime. This feature is powerful and useful for metaprogramming, enabling the program to program itself. Spring Boot leverages the reflection mechanism to implement features like Inversion of Control (IoC) and Dependency Injection (DI).

## Autowired
- The **`@Autowired`** annotation is used in a Java class or method within the Spring Framework to automatically inject dependencies. The Spring IoC (Inversion of Control) container manages application dependencies and through the @Autowired annotation, it automatically injects these dependencies into appropriate places. With this annotation, when a class or method needs another class, Spring automatically creates and injects the required dependency. This way, the instantiation and wiring of necessary objects are handled by Spring, relieving developers from manually managing dependencies.

## Qualifier
- The  **`@Qualifier`** annotation is used in the Spring Framework to specify which candidate (bean) should be used when resolving dependencies, especially in situations where there are multiple candidates for an interface or class, and it is necessary to explicitly indicate which candidate should be used by a particular application. The @Qualifier annotation is used to specify the unique name or identifier of the dependency and indicates the name of the bean to be resolved.

## Primary
- The **`@Primary`** annotation is used in the Spring Framework to specify which candidate (bean) should be given precedence when there are multiple candidates available. This situation often arises in scenarios where there are multiple bean candidates due to component scanning or configuration classes. The @Primary annotation allows a bean to be designated as the default or preferred candidate. If there are multiple candidates and one of them is marked with @Primary, that bean will be automatically selected as the primary candidate.

## Dependency Injection Methods

There are three different dependency injection methods in the Spring Framework. These methods are as follows:

- #### Field Injection

Field injection is a method where dependencies are directly injected into the class's fields.
In this method, dependencies are automatically injected using the @Autowired annotation on the fields.
While field injection is easy and concise, it is not recommended by the Spring Framework.
- #### Setter Injection

Setter injection is a method where dependencies are injected into the class's setter methods.
In this method, dependencies are automatically injected using the @Autowired annotation on the setter methods.
Setter injection is more flexible and easier to manage compared to field injection. Dependencies can be changed after the object is created.
- #### Constructor Injection

Constructor injection is a method where dependencies are injected into the class's constructor method.
In this method, the class's constructor method takes the dependencies as parameters and they are automatically injected.
Constructor injection ensures that dependencies are explicitly specified when the object is created and is the preferred injection method.

## Lazy
- The **`@Lazy`** annotation is used in the Spring Framework to enable lazy loading of dependencies, which means loading them only when they are required or requested. By default, Spring eagerly loads dependencies during the creation of a component. However, by using the @Lazy annotation, dependencies can be loaded optionally and only when they are needed. This feature is useful to optimize application startup time and resource usage by loading dependencies only when they are actually required. Especially in large and complex applications, loading dependencies lazily when needed instead of eagerly at the beginning can improve performance.


## ApplicationContext
- The ApplicationContext interface is one of the most important interfaces used in the Spring Framework. It is used to manage the state and configuration of the application at runtime. This interface forms one of the fundamental components of the Spring Inversion of Control (IoC) container and serves as a central point for managing all Spring components. The ApplicationContext extends the **`BeanFactory`** interface and includes all of its functionalities. However, it provides additional features and functionality beyond the BeanFactory.

The core functions of ApplicationContext are as follows:

1. **Bean Management**: ApplicationContext creates and manages all beans (objects) managed by Spring. It enables functionalities like dependency injection and lifecycle management.
2. **Configuration Management**: ApplicationContext manages the configuration of the application using various methods, such as XML, Java, or other configuration approaches.
3. **Event Handling**: ApplicationContext supports events and allows listening and processing of events within the application.
4. **Internationalization (i18n) Support**: ApplicationContext provides support for internationalization and localization, allowing the application to be customized for different languages and cultures.
5. **Aspect-Oriented Programming (AOP) Support**: ApplicationContext enables managing cross-cutting concerns within the application using AOP.

## Scope
- The **`@Scope`** annotation is used in the Spring Framework to determine the lifecycle and scope of beans. It is an important annotation for controlling the creation and usage process of a bean. Spring supports various scope types, and we can specify these scope types using the @Scope annotation.

Commonly used scope types in the Spring Framework are as follows:

1. **Singleton (Default)**: The bean is created only once within the application, and the same bean instance is returned for each request. This is the default scope and is used without specifying the @Scope annotation.
2. **Prototype**: A new instance of the bean is created for each request. So, a new object reference is returned for each request.
3. **Request**: The bean is created for each HTTP request, and the same object reference is returned for each request within the same HTTP request. It is used in web applications.
4. **Session**: The bean is created for each HTTP session, and the same object reference is returned for each request within the same session. It is used in web applications.
5. **Global Session**: Used in portlet-based web applications, where the bean is created for all portlet requests.
6. **WebSocket**: A bean type created for each WebSocket session and shared across all requests within the same session. This scope is used in WebSocket-based applications.
7. **Application Scope**: A bean type created only once throughout the application's lifecycle and shared across all requests. This scope is shared with the same object reference among all components within the same application.

## ComponentScan
The **`@ComponentScan`** annotation is an important annotation used in the Spring Framework for automatic component scanning. This annotation automatically converts classes in a specific package or packages into Spring-managed components. As a result, classes with other Spring component annotations such as **`@Component`**, **`@Service`**, **`@Repository`**, and **`@Controller`** are automatically detected and managed by the Spring IoC container. The @ComponentScan annotation is typically used in configuration classes (e.g., **`@Configuration`** classes) and is used to specify which packages should be scanned for automatic detection. If no package is specified, the package and its sub-packages where the class with this annotation is located will be scanned automatically.

The **`@ComponentScan.Filter`** attribute is a feature used when configuring automatic scanning with the **`@ComponentScan`** annotation. This attribute defines filters that determine which classes will be considered as components during the automatic scanning process. The **`@ComponentScan.Filter`** class can be used with the following parameters:

1. **type**: Specifies the type of the filter, and it can take one of the following values:
   - **`FilterType.ANNOTATION`**: Selects classes with a specific annotation.
   - **`FilterType.ASSIGNABLE_TYPE`**: Selects classes that are subtypes or implementations of a specific class.
   - **`FilterType.REGEX`**: Selects classes that match a specific regular expression.
   - **`FilterType.CUSTOM`**: Used for applying a custom filter.

2. **value**: Specifies the value of the filter. The value depends on the **`type`** parameter:
   - If **`type = FilterType.ANNOTATION`**, you should specify the name of the specific annotation to select classes with that annotation.
   - If **`type = FilterType.ASSIGNABLE_TYPE`**, you should specify the name of the specific class to select its subtypes or implementations.
   - If **`type = FilterType.REGEX`**, you should specify the regular expression to select classes that match the given pattern.
   - If **`type = FilterType.CUSTOM`**, you should specify your custom filter class to apply a custom filtering strategy.

The **`@ComponentScan.Filter`** attribute is useful for customizing the automatic scanning configuration flexibly and selecting only specific classes as components when needed. Custom filters can provide tailored scanning strategies based on your application's requirements.

