From openjdk:8
EXPOSE 8080
ADD target/aadharportal-0.0.1-SNAPSHOT.war  aadharportal-0.0.1-SNAPSHOT.war
ENTRYPOINT [ "java","-jar","/aadharportal-0.0.1-SNAPSHOT.war" ]
