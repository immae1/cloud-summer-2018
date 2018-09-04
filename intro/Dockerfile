
VOLUME /tmp

WORKDIR /code

# Prepare by downloading dependencies
ADD pom.xml /code/pom.xml
#RUN ["mvn", "dependency:resolve"]
#RUN ["mvn", "verify"]

# Adding source, compile and package into a fat jar
ADD src /code/src
RUN ["mvn", "clean", "install"]

#we need to know how to projectname
RUN ["ls", "/code/target"]
RUN ["pwd"]
RUN ["ls", "-ltrh", "/code/target/intro-0.0.1-SNAPSHOT.jar"]

EXPOSE 8081

ENTRYPOINT [ "java", "-jar", "/code/target/intro-0.0.1-SNAPSHOT.jar" ]
