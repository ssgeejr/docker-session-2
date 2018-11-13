# docker-session-2
Dockerfile &amp; Networking


docker build -t standalone .

docker-compose up {service-name}

docker-compose up -d {service-name}

docker-compose down {service-name}

docker-compose stop {service-name}

docker-compose log [-f] {service-name}


docker-compose -f docker-compose.yml -f docker-compose.admin.yml

-p 	Specify an alternate project name  (default: directory name)

build              Build or rebuild services
config             Validate and view the Compose file
exec               Execute a command in a running container
logs               View output from containers
ps                 List containers
pull               Pull service images
rm                 Remove stopped containers
scale              Set number of containers for a service
start              Start services
stop               Stop services
top                Display the running processes
unpause            Unpause services
up                 Create and start containers



docker stats

docker cp index.jsp standalone:/.extract/webapps/ROOT/index.jsp


docker inspect standalone

docker inspect mongo

