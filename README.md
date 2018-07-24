Simple example of a Spring Cloud / Spring Boot app using Netflix Eureka discovery service.

Example consists of 3 Spring Boot apps:

SpringCloudEureka: registers the Eureka server

SpringBootService1 with endpoint POST /service1/singleService1/

SpringBootService1 with endpoint POST /service1/multiService1/

registers with Eureka server with @EnableDiscoveryClient

uses Ribbon load balancer aware RestTemplate to call Service2 
SpringBootService2 provides endpoint GET /service2/singleService2 which is called by /service1/multiService1/

also registers with Eureka server with @EnableDiscoveryClient so it can be looked up by Service1
