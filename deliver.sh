#!/bin/bash
#docker stop $(docker ps -a | grep "java -jar" | awk '{print $1}')
#docker rm $(docker ps -a | grep "java -jar" | awk '{print $1}')
#docker build -t custom-spring .
#docker run -p 8081:8080 --link=some-mysql -t custom-spring
docker -v
