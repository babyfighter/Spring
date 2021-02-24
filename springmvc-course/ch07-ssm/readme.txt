SSM整合开发

spring MVC：视图层，界面层，负责接收请求，显示处理结果的
spring；业务层，管理service，dao，工具类对象
Mybatis：持久层，访问数据库

用户发起的请求--springMVC接收--Spring中的Service对象--Mybatis处理数据

1.第一个容器SpringMVC容器，管理Controller控制器对象
2.第二个容器Spring容器，管理service，dao工具类对象
    把Controller和web开发相关对象交给springMVC，哦这些web用的对象
    写在springMVC配置文件中
service，dao对象定义在spring的配置文件中，让spring管理这些对象

实现步骤：
0.使用springdnb的mysql库，表使用student
1.新建mave web项目
2.加入依赖：
    springmvc,spring,mybatis依赖,jackson,mysql驱动，druid连接池，jsp，servlet依赖
3.写web.xml
    1.注册DispatcherServlet：
        创建springmvc容器对象，才能创建Controller类对象
        创建的是Servlet，才能接受用户的请求
    2.注册spring的监听器：ContextLoaderListener：创建spring容器对象，才能创建service，dao对象
    3.注册字符集过滤器：解决post请求乱码问题
4.创建包，Controller包，service，dao，实体类包名
5.写SSM的配置文件：
    1.springmvc配置文件
    2.spring配置文件
    3.mybatis主配置文件
    4.数据库的属性配置我呢见
6.写代码，dao接口和mapper文件，service和实现类，controller，实体类
7.写jsp页面

