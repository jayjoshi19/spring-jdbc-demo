# Spring Boot features
  1. View resolver
  2. Embedded tomcat server
  3. Auto configuration

# @SpringBootApplication consists of
  1. @EnableAutoConfiguration
  2. @ComponentScan - it scans all the classes with @Component annotation which is inside the base package
  3. @Configuration - it will look for all classes with @Configuration and with @Bean for the methods and will create beans for them.
