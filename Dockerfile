From centos
RUN yum install -y java-11
VOLUME /tmp
ADD target/udv-ms-products-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:dev/./urandom","-jar", "/app.jar"]
