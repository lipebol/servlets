### run container
docker run -it --name tomcat --restart=always -v ~/DIR_HOST:/usr/local/tomcat/webapps -p 80:8080 -d tomcat:latest


