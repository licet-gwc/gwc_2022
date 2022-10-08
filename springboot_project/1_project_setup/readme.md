# Springboot Project details
Follow the below steps to generate the Spring Boot project using Spring Initializr tool.

### 1. Generate Project using Spring Initializr
1. Click here to goto [Spring Initializr](https://start.spring.io/)
2. Inside the Spring Initializr page, provide values for the following fields,
  * **Project:** *Maven Project*
  * **Spring Boot version:** *2.7.4*
  * **Project Metadata:**
    - **Group:** *com.gwc*
    - **Artifact:** *myfirstapp*
    - **Name:** *My First Application*
    - **Description:** *My First Application*
    - **Package Name:** *com.gwc.myfirstapp*
  * **Packaging:** *JAR*
  * **Java:** *11*
3. Click on `Add Dependencies` button and search for following libraries and add them to the project
    * *Spring Web*
    * *Spring Boot DevTools*
    * *Spring Data JPA*
    * *H2 Database*
    * *Lombok*
4. Click on `Generate` button at the bottom of this page to download the strucutre of the Spring Boot Project with above details.
5. After the zip file is downloaded, extract this file contents into the STS Workspace `eg., c:\mywork\sts_workspace\myfirstapp`

### 2. Import the project into Sprint Tool Suite (STS)
1. Open the STS application
2. Open the menu `File` -> `Import...`
3. In the `Import` window, select `Maven` -> `Existing Maven Projects` and click on `Next` button
4. Use the file path from Step 1.5 for `Root Directory` and press `tab` key
5. `pom.xml` file from `myfirstapp` project is listed. Ensure the Checkbox is selected for this file, and click `Finish` to complete the project import.
6. After the import is completed, the entire project is now imported in STS tool.
7. Explore the `pom.xml` file and verify it has all the required dependencies added into it.
8. All these dependencies will now be downloaded under the maven repository located at the path - `c:\users\{username}\.m2\repository`

### 3. H2 Database
#### 3.1. Database Configuration
1. In the project, open the `application.properties` file under `src/main/resources` path. It is empty by default.
2. Add the following properties for the H2 Database configuration.
  ```
  spring.datasource.initialize=true
  spring.datasource.url=jdbc:h2:mem:jpadb
  spring.datasource.driverClassName=org.h2.Driver
  spring.datasource.username=gwcusr
  spring.datasource.password=gwcpwd
  spring.h2.console.enabled=true
  spring.h2.console.path=/h2db
  spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
  spring.jpa.generate-ddl=true
  spring.jpa.hibernate.ddl-auto=none
  spring.jpa.hibernate.naming.physical-strategy=org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl
  spring.jpa.properties.hibernate.format_sql=true
  spring.jpa.properties.hibernate.validator.apply_to_ddl=false
  spring.jpa.show-sql=true
  ```
3. Click on the project name in the Project Explorer, and run the application by selecting the menu `Run` -> `Run As` -> `Spring Boot App`
4. Once the application begins to start, the startup logs will appear under the console tab in STS.
5. Check for the following log statements to ensure the Application has started successfully.
  ```
  [1] Tomcat started on port(s): 8080 (http) with context path ''
  [2] Started Application in 'x' seconds
  [3] H2 console available at '/h2db'. Database available at 'jdbc:h2:mem:jpadb'
  ```
7. From the above logs, we can understand that our web application is using port 8080 and the H2 Database is accessible at the endpoint - `/h2db`
8. Goto the URL - http://localhost:8080/h2db to view the H2 Database console.
9. Use the property values from `application.properties` file to login into the H2 Database
  ```
  Driver Class: org.h2.Driver
  JDBC URL: jdbc:h2:mem:jpadb
  Username: gwcusr
  Password: gwcpwd
  ```
10. Upon submitting the above details, the H2 Database will be connected and the DB console is accessible via browser now.

**Activity:**
Once the DB console is logged in successfully, execute your DB scripts to check if the tables and insert scripts are working fine.
Refer to this [page](https://www.h2database.com/html/commands.html) for SQL commands specific to H2 database.

Note: Ensure to save all your scripts in a different file, as the DB objects will be dropped once the application is stopped.


#### 3.2. Adding Local Storage for H2 Database
1. Step 3.1 starts the H2 database in In-Memory mode, which means the DB objects stored in temporary memory (eg., RAM).
2. Create a new folder to store the data as a physical file eg., `c:\mywork\h2db_files`
3. Update the below property in `application.properties` to store the database in above path
   ```
   spring.datasource.url=jdbc:h2:file:c:/mywork/h2db_files/h2db'
   ```
5. Once the application is started, two new files - `h2db.mv.db` & `h2db.trace.db` are created under this path to persist the data.
6. Now execute your DB scripts for table creation and inserting data in it.
7. Stop and Start the application again to verify the database objects and the data inserted are not erased.

