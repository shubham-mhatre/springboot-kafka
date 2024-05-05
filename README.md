

kafka producer : ticket booking server:

![image](https://github.com/shubham-mhatre/springboot-kafka/assets/55918816/f32a487f-4acb-4126-950e-72047a302ab2)


kafka consumer : ticket booking user : notification consumer

![image](https://github.com/shubham-mhatre/springboot-kafka/assets/55918816/68c76d0c-e41a-4f15-beb4-497599d368c8)


to run kafka zookeeper:

go to : C:\kafka\kafka_2.13-3.7.0
open powershell there
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

![image](https://github.com/shubham-mhatre/springboot-kafka/assets/55918816/b9eea910-2eb1-4a3b-865f-195e80d1691f)


again open another powershell there and run kafka 

.\bin\windows\kafka-server-start.bat .\config\server.properties

![image](https://github.com/shubham-mhatre/springboot-kafka/assets/55918816/1f023cb2-73ea-40fd-8c44-4d8eed4b4c79)


create topic : 
go to C:\kafka\kafka_2.13-3.7.0\bin\windows
open cmd here
kafka-topics.bat --create --bootstrap-server localhost:9092 --topic test

![image](https://github.com/shubham-mhatre/springboot-kafka/assets/55918816/15685f14-9bae-4d2e-95f5-76dc28822573)


start producer : 

kafka-console-producer.bat --broker-list localhost:9092 --topic test
now push some data from producer:
{"name":"shubham","age":"27"}
![image](https://github.com/shubham-mhatre/springboot-kafka/assets/55918816/7813f019-82bf-49ef-b1e4-e967bd8a730b)



start consumer :
another cmd
go to C:\kafka\kafka_2.13-3.7.0\bin\windows

kafka-console-consumer.bat --topic test --bootstrap-server localhost:9092 --from-beginning

![image](https://github.com/shubham-mhatre/springboot-kafka/assets/55918816/0e7e226e-5bbd-4ac3-a50b-b6261d7bdf5d)

