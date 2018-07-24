docker stop $(docker ps -aq)
docker rm $(docker ps -aq)
docker rmi  myjdk:v1
docker rmi  datamysql:v1

mvn clean package

cp Exam1/target/Exam1.jar docker/java/
cp Exam2/target/Exam2.jar docker/java/
cd docker/mysql/
sh build.sh
cd ..
cd ..

cd docker/java/
sh build.sh
cd ..
cd ..

docker-compose up -d

echo "等待mysql数据库导入，并运行.......15s"
sleep 15
docker logs javatest3_jdk8_1