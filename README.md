# Comparitive Judgement API
Description

## Getting Started

```
Clone/Fork the repo
```

### Prerequisites

The following must be installed to run the program successfully.

```
Download IntelliJ if you don't already have it
https://www.jetbrains.com/idea/download/#section=mac
```

```
Make sure you have JDK and JER installed on your local machine

http://www.oracle.com/technetwork/java/javase/downloads/index.html
```

## Built With

* [Spring Boot](https://projects.spring.io/spring-boot/)
* [Gradle](https://gradle.org/docs/)


## Testing

* Junit

## Running with Docker
-- In Progress --

Currently, we have the ability to build a container that will run the API with some hard-coded values. To do this:

- Install Docker
- In the root of the repository, run the command `docker build . -t comparative-judgement-api`
- Once it has built, run the command `docker run -p 8080:8080 -t comparative-judgement-api`
- Visit http://localhost:8080/compare to validate that your API is up and running

####
