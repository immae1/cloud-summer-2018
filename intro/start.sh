#!/bin/bash
docker build --no-cache -t testspring . && docker run -it -p 8081:8081 testspring
