# Spring Boot Kickstart

A barebone spring-boot project to start building restful APIs

# Features

## Lombok + MapStruct

- Support [Lombok](https://projectlombok.org/): avoid writing boilerplate code

> Never write another getter or equals method again, with one annotation your class has a fully featured builder, Automate your logging variables, and much more.

- For example, you can add getters / setters / toString by using annotations

- Support [MapStruct](https://mapstruct.org/) allow easy mapping between data models

> MapStruct is a code generator that greatly simplifies the implementation of mappings between Java bean types based on a convention over configuration approach.

- For example, you can use MapStruct to convert an Entity to a DTO or vice versa

## Swagger

- Integrated with Swagger by [Springfox](https://springfox.github.io/springfox/docs/current/)
    - REST API document generation
    - REST API test UI
- API document endpoint: http://localhost:8080/swagger-ui/

## Common Error Handling

TBD

- Define a common error handling logic and error message format

## OAuth2

TBD

- Integrated with OAuth2 to allow login via 3rd party services
- https://spring.io/guides/tutorials/spring-boot-oauth2/

# Quick Start

## No Docker
### Clean Build

- under `{PROJECT-ROOT}`
- `$ ./mvnw clean package`

The jar will be generated to `{PROJECT-ROOT}/target`

### Start the Server

- under `{PROJECT-ROOT}`
- `$ ./mvnw spring-boot:run`

Start server with spring boot maven plugin

### Run Tests

- under `{PROJECT-ROOT}`
- `$ ./mvnw clean test`

## With Docker

### Build Docker Image Manually

- under `{PROJECT-ROOT}`
- `$ docker build -t com.example/spring-boot-kickstart -f ./docker/Dockerfile .`

Build the local Docker image manually.

### Start the Server

- under `{PROJECT-ROOT}`
- `$ docker run com.example/spring-boot-kickstart`

### Run Tests

- under `{PROJECT-ROOT}`
- Build for running tests: `$ docker build -t com.example/spring-boot-kickstart -f ./docker/Dockerfile --target test .`
- Run tests: `$ docker run com.example/spring-boot-kickstart`

## With Docker Compose

### Start the Server

- under `{PROJECT-ROOT}`
- `$ docker-compose up -d`

Start the services with docker compose. If the images does not exist, Docker build will be automatically triggered.

### Stop the Server

- `$ docker-compose down`

Stop the services with docker compose
