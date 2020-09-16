# spring-profiles-showcase

This small application shows the usage of spring profiles to embed multiple implementations of a workflow. According to the profile a workflow implementation is created and executed.

According to the profile, different properties are loaded and the implementation called by an integrated trigger.a

To start the basic workflow use
```java
java -Dspring.profiles.active=business2 -jar service-1.0.0.jar
```
for an extended workflow which loads more properties in another implementation use
```java
java -Dspring.profiles.active=business2 -jar service-1.0.0.jar
```
