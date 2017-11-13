#SpringCloud Demo 项目
**项目创建时间为**：2017年11月13日

- **测试工具**：
  - IDEA 2017.2.5
  - maven 3.5
> 使用Maven 子模块的方式，整合SpringCloud 的基础功能模块，以下为各个模块的详细功能。

-----------
##sz-service
SpringCloud 注册中心模块，需首先启动此项目。
- **主要参数**：
  - port: 8000

-----------
##sz-core
此模块为主项目，使用Feign 进行各个子模块API 的调用，可使用swagger ui 查询各个集成接口信息。
- **主要参数**：
  - port: 9000
  - application-name: sz-core
  
-----------
##sz-scheduled
此模块为定时任务，集成spring-scheduled ，没有暴露的API 接口，仅供功能测试。
- **主要参数**：
  - port: 9001
  - application-name: sz-sheduled

-----------
##sz-mybatis
此模块整合了mybatis - druid 数据源。
- **主要参数**：
  - port: 9002
  - application-name: sz-mybatis
  - api:
    - /userList
      - method: get
      - 获取所有用户信息
    - /user?id=${1}
      - method: get
      - 获取指定id 的用户信息
    - /addUser?username=${1}&password=${2}
      - method: get
      - 添加用户信息，无需id，自增主键，返回新添加用户的id 值
      