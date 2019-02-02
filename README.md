## Springboot 2.0 概览
![](https://github.com/geekerstar/dive-in-springboot/blob/master/img/1.jpg)

## Question?
- Springboot是如何基于Spring Framwork逐步走向自动装配的？
- SpringApplication是怎样掌控Spring应用声明周期的？
- Springboot外部化配置与Spring Environment抽象之间是什么关系？
- Spring Web MVC向Spring Reactive WebFlux过渡的真实价值和意义？

## Springboot
- 组件自动装配：规约大于配置，专注核心业务
- 外部化配置：一次构建，按需调配，到处运行
- 嵌入式容器：内置容器，无需部署，独立运行
- Springboot Starter：简化依赖，按需装配，自我包含
- Production-Ready：一站式运维，生态无缝整合

## 核心
- 组件自动装配：模式注解、@Enable模块、条件装配、加载机制
- 外部化配置：Environment抽象、生命周期、破坏性变更
- 嵌入式容器：Servlet Web容器、Reactive Web容器
- Springboot Starter：依赖管理、装配条件、装配顺序
- Production-Ready：健康检查、数据指标、@Endpoint管控

## Springboot与Java EE规范
- Web：Servlet(JSR-315、JSR-340)
- SQL：JDBC（JSR-221)
- 数据校验：Bean Validation（JSR 303、JSR-349）
- 缓存：Java Caching API(JSR-107)
- WebSockets：Java API for WebSocket(JSR-365)
- Web Service：JAX-WS（JSR-224）
- Java管理：JMX（JSR 3）
- 消息：JMS（JSR-914）

## 目录
- 核心特性
- Web应用
- 功能扩展
- 数据相关
- 运维管理

## 核心特性
Springboot三大特性
- 组件自动装配：Web MVC、Web Flux、JDBC等
- 嵌入式Web容器：Tomcat、Jetty以及Undertow
- 生产准备特性：指标、健康检查、外部化配置等

### 组件自动装配
- 激活：@EnableAutoConfiguration
- 配置：/META-INF/spring.factories
- 实现：XXXAutoConfiguration

### 嵌入式Web容器
- Web Servlet：Tomcat、Jetty和Undertow
- Web Reactive：Netty Web Server

### 生产准备特性
- 指标：/actuator/metrics
- 健康检查：/actuator/health
- 外部化配置：/actuator/configprops

## Web应用
### 传统Servlet应用
- Servlet组件：Servlet、Filter、Listener
- Servlet注册：Servelet注解、Spring Bean、RegistrationBean
- 异步非阻塞：异步Servlet、非阻塞Servlet

### Spring Web MVC 应用
- Web MVC视图：模板引擎、内容协商、异常处理等
- Web MVC REST：资源服务、资源跨域、服务发现等
- Web MVC核心：核心架构、处理流程、核心组件

### Spring Web Flux 应用
- Reactor基础：Java Lambda、Mono、Flux
- Web Flux核心：Web MVC注解、函数式声明、异步非阻塞
- 使用场景：Web Flux的优势和限制

#### 性能测试 
http://blog.ippon.tech/spring-5-webflux-performance-tests/

### Web Server 应用
- 切换Web Server
- 自定义Servlet Web Server
- 自定义 Reactive Web Server

![](https://github.com/geekerstar/dive-in-springboot/blob/master/img/2.jpg)

## 数据相关
### 关系型数据
- JDBC：数据源、JdbcTemplate、自动装配
- JPA：实体映射关系、实体操作、自动装配
- 事务：Spring事务抽象、JDBC事务处理、自动装配

## 功能扩展
### Springboot 应用
- SprigApplication：失败分析、应用特性、事件监听等
- Springboot配置：外部化配置、Profile、配置属性
- Spring boot Starter：Starter开发、最佳实践

## 运维管理
### Spring Boot Actuator
- 端点：各类Web和JMX Endpoints
- 健康检查：Health、HealthIndicator
- 指标：内建Metrics、自定义Metrics




