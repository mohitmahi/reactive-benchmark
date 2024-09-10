# Web Server Benchmarking Repository

This repository contains benchmarking details and results for comparing the throughput performance of Jetty9 and Vert.x web servers.

## Benchmarking Details

As web applications grow in complexity and user base, the choice of web server technology becomes critical. This section compares the throughput performance of two widely used web server frameworks: Jetty9 and Vert.x.

### Tool Used

**WRK:** A modern HTTP benchmarking tool capable of generating significant load when run on a single multi-core CPU.

### Hardware Specifications

- Processor Name: Quad-Core Intel Core i7
- Processor Speed: 2.3 GHz
- Number of Processors: 1
- Total Number of Cores: 4
- Hyper-Threading Technology:** Enabled
- Memory: 32 GB

### Software Specifications

- **OS:** macOS Ventura 13.0
- **JDK:** OpenJDK 17

### Purpose of Benchmarking

The primary goal of this benchmarking exercise is to evaluate and compare the throughput of two major categories of web servers:

- Jetty9 HTTP Web Server
- Vert.x HTTP Web Server

Throughput is a key metric indicating how many requests a web server can handle per second. Higher throughput implies better performance and the ability to serve more users concurrently.

## Instructions
1. Clone the repository:

``
git clone https://github.com/yourusername/benchmark-repo.git
cd benchmark-repo
``

2. Running Jetty HTTP Server:

``./scripts/run_jetty9_benchmark.sh``

3. Running Vert.x HTTP Server:

``./scripts/run_vertx_benchmark.sh``

4. Benchmarking: Execute the wrk command in another terminal window once the server is running:

``wrk -t10 -c100 -d30s http://127.0.0.1:8080/v1/ -s post.lua``

This setup allows you to easily switch between running the Jetty and Vert.x servers by using simple scripts.


