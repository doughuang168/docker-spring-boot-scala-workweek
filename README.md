# docker-spring-boot-scala-workweek 
Simple RESTful API implementation using Spring Boot plus Scala in Public cloud
## Welcome to Workweek RESTful API ##

**Workweek API** is a simple RESTful Web Service implemented in Scala with in-memory Hibernate as data store.  And hosted in Public cloud. 

### REST API End point ###
- **http://micro-service.cloudapp.net:8080/workweek**


### Simple REST Interface ###
 
To get the work week of a specific date:



- http://micro-service.cloudapp.net:8080/workweek/wwdate
 

Where **wwdate**  have the format: **yyyy-mm-dd**  



## API usage example  
Request url:

- http://micro-service.cloudapp.net:8080/workweek/2015-02-01
 

Response JSON:

{
  "id": 8, "status": "success", "message" : "", "workweek" : "2015WW06"
}


 
## Angular Directive Demo
To see the dynamic nature of WebService being used. I implement a simple AngularJS directive as the WebService consumer.


You can see the demo at [Azure Cloud](http://micro-service.cloudapp.net:8080) or [AWS](http://ec2-54-213-146-147.us-west-2.compute.amazonaws.com:8080)



## Local Build
Download complete source thru Github:

- git clone https://github.com/doughuang168/docker-spring-boot-scala-workweek
 
- cd docker-spring-boot-scala-workweek


- In command windows type "./gradlew build" in Linux environment or ".\gradlew.bat build" in windows environment


- "java -jar build/libs/spring-boot-scala-microservice-0.1.0.jar" to start the micro-service

- in browser address bar type in url: http://localhost:8080

- Java 8 and gradle are required for build and run



## Using Docker to build and deploy
- Save https://github.com/doughuang168/docker-spring-boot-scala-workweek/blob/master/Dockerfile to local drive as Dockerfile

-  docker build -t spring-boot-scala-microservice .

-  docker run -p 8080:8080 -d -t spring-boot-scala-microservice

- Make sure configure your running host allow inbound traffic for port 8080   
