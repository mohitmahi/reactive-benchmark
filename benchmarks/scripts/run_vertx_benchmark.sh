#!/bin/bash

echo "Running Vert.x benchmark..."
mvn clean compile exec:java -Dexec.mainClass="com.example.vertx.VertxHttpServer"
