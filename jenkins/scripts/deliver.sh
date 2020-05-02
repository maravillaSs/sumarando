#/bin/bash!
sudo docker stop $(sudo docker ps -a | grep "java -jar" | awk '{print $1}')
sudo docker rm $(sudo docker ps -a | grep "java -jar" | awk '{print $1}')
sudo docker build -t custom-spring .
