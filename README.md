# fregata

> 来自梦想的力量才让我们走在一起。

## 工程

```
┌── docs                                    #  项目文档
├── modules                                 #  项目模块
│    ├── management-common-base              #  基础设计
│    ├── management-common-liquibase         #  数据库管理工程
│    ├── management-launch-single            #  单体应用启动
├── pom.xml                                 
└── readme.md                               
```

### 说明

- api 用于微服务约束设计，它只有接口与实体定义，没有实现
- rest 是针对 api 的 service 与 controller 业务实现
- launch 为启动项目，不应该有具体业务代码

===========================

# 依赖

>  java 1.8

- egova-framework 数字政通开源基础架构
- egova-bunches 数字政通安防研发基于 egova-framework 扩展

## 文档

- [时序数据库使用](./docs/时序数据库使用.md)
