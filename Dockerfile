FROM openjdk:8-jdk-alpine

RUN mkdir -p /app
WORKDIR /app

COPY HargaMakanan.java /app

#compile file java
RUN javac HargaMakanan.java

#running java
CMD ["java","HargaMakanan"]