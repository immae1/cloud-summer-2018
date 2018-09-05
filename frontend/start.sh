#!/bin/bash

docker build --no-cache -t springfrontend . && docker run -it -p 8081:8081 springfrontend
