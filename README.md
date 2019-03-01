# cloud
SpringCloudTestDemo

参照windmt博客系列文章搭建的SpringCloud练习示例

https://windmt.com/tags/Spring-Cloud/

# cloud-config 配置文件
cloud-config的配置文件application.yml中包含账户密码信息，故未上传，其内容如下
<pre>
spring:
  application:
    name: cloud-config
  cloud:
    config:
      server:
        git:
          uri: #repositories 地址
          search-paths: #该repositories 下存储配置文件的路径
          username: #GitHub 用户名
          password: #GitHub 密码
server:
  port: 12000
eureka:
  client:
    service-url:
      defaultZone: http://localhost:7000/eureka/
</pre>

# cloud-producer 配置文件
cloud-producer的配置文件application.yml通过配置中心cloud-config获取，存放于私人repositories中，其内容如下
<pre>
spring:
  application:
    name: cloud-producer
  sleuth:
    web:
      client:
        enabled: true
    sampler:
      probability: 1.0
  zipkin:
    base-url: http://localhost:9411/
eureka:
  client:
    service-url:
      defaultZone: http://localhost:7000/eureka/
server:
  port: 8000
producer:
  instance: 1
  profile: prod
</pre>
