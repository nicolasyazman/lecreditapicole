# Build Stage: Use an official Maven image with OpenJDK 21 to build the app
FROM jelastic/maven:3.9.5-openjdk-21 AS build

# Set the working directory inside the container
WORKDIR /app

# Copy the Maven project file (pom.xml) into the container
COPY pom.xml ./

# Download the Maven dependencies (this caches them to avoid downloading on each build)
RUN mvn dependency:go-offline

# Copy the rest of the application source code into the container
COPY src ./src

# Compile the application and package it into a .jar file (without running tests)
RUN mvn clean package -DskipTests -DfinalName=lecreditapicole

# Expose the port the app will listen on (adjust this if needed)
EXPOSE 8080

# Command to run the application using Java
CMD ["java", "-jar", "target/lecreditapicole.jar"]