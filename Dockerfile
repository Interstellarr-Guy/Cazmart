# Use Java 17
FROM eclipse-temurin:17-jdk

WORKDIR /app

# Copy Maven wrapper and pom
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .

# Download dependencies
RUN chmod +x mvnw
RUN ./mvnw dependency:go-offline

# Copy source code
COPY src src

# Build jar
RUN ./mvnw -DskipTests clean package

# Run app
CMD ["java", "-jar", "target/Cazmart-0.0.1-SNAPSHOT.jar"]
