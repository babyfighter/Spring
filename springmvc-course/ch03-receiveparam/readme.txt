需求：接收请求的参数
使用的处理器方法的形参：
   1.HttpServletReq
   2.HttpServletResponse
   3.HttpSession
   4.用户提交的数据

接受用户提交的参数：
1.逐个接受
2.对象接收

注意：
    提交请求参数时，get请求方式中文没有乱码；
    使用post方式提交有乱码，需要使用过滤器处理乱码的问题
    或使用框架中提供的过滤器CharacterEncodingFilter




实现步骤：
1.新建web maven工程
2，加入依赖
    spring-webmvc依赖，简介吧spring的依赖都加入到项目
    jsp，servlet依赖
3.在web.xml中注册springmvc框架的核心对象DispatcherServlet
    1）DispatcherServlet叫做中央调度器，是一个servlet，父类是继承HttpServlet
    2）DispatcherServlet也叫做前端控制器（front controller）
    3）DispatcherServlet负责接收用户提交的请求，调用其他的控制器对象，并把请求的处理结果显示给用户
4.创建一个发起请求的页面 index.jsp
5.创建控制器(处理器)类：
    1）再累的上面加入@Controller注解，创建对象，并放到springmvc容器中
    2）在类中的方法上面加入@RequestMapping注解
6.创建一个作为结果的jsp，显示请求的处理结果
7.创建springmvc的配置文件
    1）声明组件扫描器，指定@Controller注解所在的包名
    2）声明视图解析器，帮助处理视图的

