### scripts/run_jetty9_benchmark.sh

```bash
#!/bin/bash

echo "Running Jetty9 benchmark..."
wrk -t10 -c100 -d30s http://127.0.0.1:8080/v1/ -s post.lua
