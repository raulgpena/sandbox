FROM       openjdk:17
MAINTAINER Raul Peña (raul.pena@gmail.com)
VOLUME     /tmp
ADD        target/*.jar /opt/applications/app.jar
RUN        sh -c 'touch /opt/applications/app.jar'
ENTRYPOINT [ "sh", "-c", "java -jar /opt/applications/app.jar" ]
WORKDIR    /opt/workspace