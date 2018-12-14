# docker-test-standalone

Open CMD windows and type "bash"

This repo aims to test interactions with DockerHub and DockerCloud  

docker-machine ip --> 192.168.99.100  
docker images --> 5924aafc7c08  
docker run -dit -p 192.168.99.100:8080:8080 docker 5924aafc7c08  

docker run -dit 5924aafc7c08 /bin/bash  

