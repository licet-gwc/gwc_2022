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




