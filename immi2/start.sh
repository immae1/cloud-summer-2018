#!/bin/bash
echo "start mysql"
docker run --name my-mysql -p 3316:3306 -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=mydb -e MYSQL_USER=immi -e MYSQL_PASSWORD=immipw -d mysql:5.7

docker build --no-cache -t testspring . && docker run -it -p 8081:8081 testspring
