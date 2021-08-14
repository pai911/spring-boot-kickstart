### Maven Build Stage ###
FROM maven:3.6-jdk-11 as builder
WORKDIR /app

# Prepare Maven POM
COPY pom.xml .

# Resolve dependencies
RUN mvn dependency:go-offline

# Copy source code
COPY src ./src

# Build the app
RUN mvn clean package  -Dmaven.test.skip

# Split the built app into multiple layers to improve layer rebuild
RUN java -Djarmode=layertools -jar ./target/spring-boot-kickstart.jar extract

### For Running Tests ###
FROM builder as test
CMD ["mvn", "test"]

### Run Stage ###
FROM openjdk:11.0-jre
WORKDIR /app

# Copy built app layer by layer
COPY --from=builder app/dependencies/ ./
COPY --from=builder app/spring-boot-loader/ ./
COPY --from=builder app/snapshot-dependencies/ ./
COPY --from=builder app/application/ ./

EXPOSE 8080

CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "org.springframework.boot.loader.JarLauncher"]