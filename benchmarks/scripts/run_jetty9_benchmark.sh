#!/bin/bash

echo "Running Jetty9 benchmark..."
mvn clean compile exec:java -Dexec.mainClass="com.example.jetty.JettyHttpServer"
