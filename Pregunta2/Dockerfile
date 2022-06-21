from rrojano/jdk8
workdir /app
#expose 8080
#cmd ["/app/script.sh"]
add microservicio/app/pregunta-2-0.0.1-SNAPSHOT.jar /app/pregunta-2-0.0.1-SNAPSHOT.jar
#add microservicio/script.sh /app/script.sh
#run chmod 755 /app/script.sh
cmd java -jar -Dserver.port=$PORT pregunta-2-0.0.1-SNAPSHOT.jar
