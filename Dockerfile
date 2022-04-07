FROM openjdk:11
VOLUME /main-app
ADD target/employeemanagement-0.0.1-SNAPSHOT.jar employeemanagement.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar","/employeemanagement.jar"]
