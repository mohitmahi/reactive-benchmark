
### benchmarks/vertx_benchmark.md

```markdown
# Vert.x Benchmark Results

## System Information

- Processor Name: Quad-Core Intel Core i7
- Processor Speed: 2.3 GHz
- Number of Processors: 1
- Total Number of Cores: 4
- Hyper-Threading Technology: Enabled
- Memory: 32 GB
- OS: macOS Ventura 13.0
- JDK: OpenJDK 17

## Benchmark Results

| Metric                 | Value          |
|------------------------|----------------|
| Requests per second    | 6056.50           |
| Transfer per seconf    | 638.77        |

## Notes

- The benchmarks were run using the `wrk` tool with the command:

|--------------------------------------------------------------|
 wrk -t10 -c100 -d30s http://127.0.0.1:8080/v1/ -s post.lua
|--------------------------------------------------------------|
