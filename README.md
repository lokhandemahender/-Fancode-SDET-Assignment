# Fancode SDET Assignment

This project demonstrates how to use the Apache HttpComponents Fluent API to make HTTP requests and parse the responses using Gson. The task is to automate a scenario where all users of the city `FanCode` should have more than half of their todos tasks completed.

## Scenario

- **Given**: User has the todo tasks
- **And**: User belongs to the city FanCode
- **Then**: User's completed task percentage should be greater than 50%

### Note

- You can use any language to write API automation/Framework.
- FanCode City can be identified by latitude between (-40 to 5) and longitude between (5 to 100) in users API.

## Resources (APIs)

- [Users](http://jsonplaceholder.typicode.com/users)
- [Todos](http://jsonplaceholder.typicode.com/todos)
- [Posts](http://jsonplaceholder.typicode.com/posts)
- [Comments](http://jsonplaceholder.typicode.com/comments)
- [Albums](http://jsonplaceholder.typicode.com/albums)
- [Photos](http://jsonplaceholder.typicode.com/photos)

## Deliverables

1. Solution should be on GitHub or any other similar tool.
2. README mentioning the steps for setting up and running the project.

## Prerequisites

- Java 11 or higher
- Maven 3.6.0 or higher

## Project Setup

1. **Clone the repository:**

    ```sh
    git clone https://github.com/your-username/fancode-sdet-assignment.git
    cd fancode-sdet-assignment
    ```

2. **Open the project in your IDE:**

    - IntelliJ IDEA, Eclipse, or any other IDE that supports Maven projects.

3. **Ensure the following dependencies are added to your `pom.xml`:**

    ```xml
    <dependencies>
        <dependency>
            <groupId>com.google.code.gson</groupId>
            <artifactId>gson</artifactId>
            <version>2.8.8</version>
        </dependency>
        <dependency>
            <groupId>org.apache.httpcomponents.client5</groupId>
            <artifactId>httpclient5</artifactId>
            <version>5.1.2</version>
        </dependency>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-api</artifactId>
            <version>5.7.2</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-engine</artifactId>
            <version>5.7.2</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
    ```

4. **Reimport the Maven project:**

    - **IntelliJ IDEA**: Right-click on the `pom.xml` file and select `Reimport`.
    - **Eclipse**: Right-click on the project and select `Maven` -> `Update Project`.

5. **Clean and install the Maven project:**

    ```sh
    mvn clean install
    ```

## Project Structure





![image](https://github.com/lokhandemahender/-Fancode-SDET-Assignment/assets/58061126/12055a3e-90c9-408b-8881-1ab6b293db7c)


Code Implementation
pom.xml

<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.fancode</groupId>
    <artifactId>fancode-sdet-assignment</artifactId>
    <version>1.0-SNAPSHOT</version>

    <dependencies>
        <dependency>
            <groupId>com.google.code.gson</groupId>
            <artifactId>gson</artifactId>
            <version>2.8.8</version>
        </dependency>
        <dependency>
            <groupId>org.apache.httpcomponents.client5</groupId>
            <artifactId>httpclient5</artifactId>
            <version>5.1.2</version>
        </dependency>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-api</artifactId>
            <version>5.7.2</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-engine</artifactId>
            <version>5.7.2</version>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <build>
        <pluginManagement>
            <plugins>
                <plugin>
                    <groupId>org.apache.maven.plugins</groupId>
                    <artifactId>maven-compiler-plugin</artifactId>
                    <version>3.8.1</version>
                    <configuration>
                        <source>11</source>
                        <target>11</target>
                    </configuration>
                </plugin>
                <plugin>
                    <groupId>org.apache.maven.plugins</groupId>
                    <artifactId>maven-surefire-plugin</artifactId>
                    <version>2.22.2</version>
                </plugin>
            </plugins>
        </pluginManagement>
    </build>
</project>


This project contains tests for the UserValidation class.

## Running the Tests

To run the tests, follow these steps:

1. Make sure the project is set up correctly in your IDE.
2. Ensure that the project includes dependencies for JUnit or TestNG.
3. Locate the UserValidationTest class in the project.
4. Right-click on the class name or individual test methods.
5. Select "Run 'UserValidationTest'" or "Run 'testIsFancodeCityUser'" / "Run 'testGetCompletedTaskPercentage'" to execute the tests.

------------------------End---------------------- 
