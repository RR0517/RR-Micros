Software’s

1. JDK 11

2. Chrome browser

3. MongoDB : https://drive.google.com/file/d/1HDOC-sxbjr8I2k7qR9sE3vpPgZNTgPKu/view?usp=sharing

4. maven

5. winrar

6. https://drive.google.com/file/d/1mKfOsXI1nZ_9a_cVDguZiB1XTyI8WvcC/view?usp=sharing

7. https://drive.google.com/file/d/1V64qppj8YwlmYEhZps84YX02bXgt_icG/view?usp=sharing

8. https://drive.google.com/file/d/1miSR-kFY4D6a_MW4XXh4bGgxexf7BsTz/view?usp=sharing

9.  https://drive.google.com/file/d/1zj4H3mBBzLYKHLpuwlHdI5K44ZRGALhT/view?usp=sharing

10. VSCode

11. MySql 8 with workbench

12. git client

13. Postman

Minimum Projects: Eureka, Hystrix, Config, ELK, Feign, OAuth,

Day-4
---------

https://github.com/micro-services-sp/spring-cloud-api-gateway

https://github.com/ibmpariwesh/SpringBoot_JMS_ActiveMQ


Day-3
-------
https://github.com/citiuspg/config-server-demo
1. Create a properties file <service-name>-<profile>.properties in git properties repository.
java -jar target/user-service-0.0.1-SNAPSHOT.jar --spring.cloud.config.profile=dev


Day-2
add to app.properties of email-service

spring.application.name=email-service
servet.port=8081
eureka.client.serviceUrl.defaultZone=http://localhost:8761/eureka
eureka.client.healthcheck.enabled=true



<dependency>
	<groupId>io.springfox</groupId>
	<artifactId>springfox-swagger2</artifactId>
	<version>2.4.0</version>
</dependency>
<dependency>
	<groupId>io.springfox</groupId>
	<artifactId>springfox-swagger-ui</artifactId>
	<version>2.4.0</version>
</dependency>

@EnableSwagger2   add in main class

http://localhost:8080/swagger-ui.html
