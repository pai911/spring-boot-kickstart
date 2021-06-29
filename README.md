# Spring Boot Kickstart
A barebone spring boot project to start building restful APIs 

# Features
## Lombok + MapStruct
- Support [Lombok](https://projectlombok.org/): avoid writing boilerplate code

      Never write another getter or equals method again, with one annotation your class has a fully featured builder, Automate your logging variables, and much more.

  - For example, you can add getters / setters / toString by using annotations
  
- Support [MapStruct](https://mapstruct.org/) allow easy mapping between data models


      MapStruct is a code generator that greatly simplifies the implementation of mappings between Java bean types based on a convention over configuration approach.

  - For example, you can use MapStruct to convert an Entity to a DTO or vice versa
## Swagger 
- Integrated with Swagger by [Springfox](https://springfox.github.io/springfox/docs/current/)
  - REST API document generation
  - REST API test UI
- API document endpoint: http://localhost:8080/swagger-ui/ 

## Common Error Handling
- Define a common error handling logic and error message format

## OAuth2
- Integrated with OAuth2 to allow login via 3rd party services
- https://spring.io/guides/tutorials/spring-boot-oauth2/
