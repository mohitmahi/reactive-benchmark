#!/bin/bash

echo "Running Vert.x benchmark..."
wrk -t10 -c100 -d30s http://127.0.0.1:8080/v1/ -s post.lua
