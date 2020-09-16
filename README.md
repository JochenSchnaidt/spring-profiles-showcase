# spring-profiles-showcase

This small application shows the usage of spring profiles to embed multiple implementations of a workflow. According to the profile different properties are loaded and a workflow implementation is created and executed.

An integrated trigger will start the showcase every 4 seconds.

To start the basic workflow use
```java
java -Dspring.profiles.active=business1 -jar service-1.0.0.jar
```
for an extended workflow which loads more properties in another implementation use
```java
java -Dspring.profiles.active=business2 -jar service-1.0.0.jar
```
