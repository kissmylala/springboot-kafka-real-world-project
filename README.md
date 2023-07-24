# Spring Boot Application with Apache Kafka Integration


This is a simple Spring Boot application that utilizes Apache Kafka to process a data stream of new articles from Wikimedia. The application consists of a Kafka producer that reads the stream of new articles and sends them to the Kafka broker, and a Kafka consumer that reads the data sent by the producer and saves it to a MySQL database.

## Introduction

This Spring Boot application showcases how to integrate Apache Kafka into a data processing workflow. It reads the data stream of new articles from Wikimedia using a Kafka producer, sends the data to the Kafka broker, and then processes the data using a Kafka consumer to save it into a MySQL database.

## Technologies Used

The following technologies have been used in building this application:

- **Spring Boot**: A powerful framework for creating standalone, production-grade applications with ease.

- **Apache Kafka**: A distributed event streaming platform that allows you to publish and subscribe to streams of records.

- **Lombok**: A Java library that simplifies the code by automatically generating boilerplate code (e.g., getters, setters, constructors).

- **MySQL Database**: A relational database management system used for storing the data received from the Kafka stream.

## Getting Started

To run this Spring Boot application with Apache Kafka integration, follow these steps:

1. Clone the repository to your local machine:

```
git clone https://github.com/kissmylala/springboot-kafka-real-world-project.git

```

2. Open the project in your favorite Java IDE.

3. Configure the Apache Kafka settings in the `application.properties` file, including the broker address, topic name, and consumer group ID.

4. Configure the MySQL database connection in the `application.properties` file.

5. Build the project and run the Spring Boot application.

6. The Kafka producer will start reading the stream of new articles from Wikimedia and sending them to the Kafka broker.

7. The Kafka consumer will process the data sent by the producer and save it to the MySQL database.

## How It Works

The application consists of two services:

### WikimediaChangesProducer

This service acts as the Kafka producer. It reads the stream of new articles from Wikimedia using the `EventSource` from the `javax.ws.rs` package. The `WikimediaChangesHandler` class processes each event received from the stream and sends it to the Kafka broker using the `KafkaTemplate`. The producer will run for 10 minutes before stopping.

### KafkaDatabaseConsumer

This service acts as the Kafka consumer. It listens to the Kafka topic specified in the `application.properties` file and processes each event message received from the Kafka broker. The consumer saves the received data to the MySQL database using the `WikimediaDataRepository` interface.

## Deployment

To deploy this Spring Boot application with Apache Kafka, you will need to have Apache Kafka and ZooKeeper installed and running on your system. Additionally, ensure that the Kafka broker address and other settings in the `application.properties` file are correctly configured. Similarly, make sure the MySQL database is set up and accessible.

