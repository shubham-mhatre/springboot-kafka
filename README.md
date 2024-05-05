
to run kafka zookeeper:

go to : C:\kafka\kafka_2.13-3.7.0
open powershell there
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

again open another powershell there and run kafka 

.\bin\windows\kafka-server-start.bat .\config\server.properties

create topic : 
go to C:\kafka\kafka_2.13-3.7.0\bin\windows
open cmd here
kafka-topics.bat --create --bootstrap-server localhost:9092 --topic test

start producer : 

kafka-console-producer.bat --broker-list localhost:9092 --topic test

start consumer :
another cmd
go to C:\kafka\kafka_2.13-3.7.0\bin\windows

kafka-console-consumer.bat --topic test --bootstrap-server localhost:9092 --from-beginning

now push some data from producer:
{"name":"shubham","age":"27"}