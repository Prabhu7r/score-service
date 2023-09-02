
## Score Service
### Spring boot Rest Api + swagger + MongoDB + Docker 

Score service is a sample REST service to enumerate gaming titles that are registered in the system.


## It exposes 3 endpoint as following :

- GET /api/title/{title}   (To fetch a list of highscores (ranked list of users) for a title)
- GET /api/user/{user}     (To fetch of a user's highscore and rank per title in the system)
- POST /api/register       (To  register a score for a title and user)

## To Import the project into your IDE
After successfully imported the project, do the following

```bash
mvn clean
mvn install
```

## How to setup
It is a docker based application. Running below command in project's directory builds 2 running containers, Score-Service and MongoDB containers:

```bash
docker build -t score-service .
docker pull mongo
docker-compose up
```


## How to use
This application is Restful and it follows OpenAPI specification in API documentation. After running the containers, you can access the application links as :

- Application Rest services : http://localhost:9091/api/register
- SwaggerUI : http://localhost:9091/swagger-ui/index.html


## Required softwares
The following software required to run the project

```bash
IDE  --> To setup the project 
docker --> To build image
docker-desktop --> To view the image and container
```