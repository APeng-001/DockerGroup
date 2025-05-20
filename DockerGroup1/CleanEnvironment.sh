#/bin/bash
docker-compose down;
docker system prune -a;
docker rm -f $(docker ps -aq);
docker rmi -f $(docker images -q);
