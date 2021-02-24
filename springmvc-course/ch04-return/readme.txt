需求：处理器方法的返回值表示请求的处理结果
1.ModelAndView：有数据和视图，对视图执行forward
2.Sting：表示视图，可以逻辑名称，也可以是完整视图路径
3.void：不能表示数据，也不能表示视图
        在处理ajax时候，可以使用void，通过HTTP ServletResponse输出数据，响应ajax请求
        ajax请求服务器端返回的就是数据
4.object：对象有属性，属性就是数据，所以返回object表示数据，和视图无关
        可以使用对象表示的数据，响应ajax请求
    ajax，主要使用json数据格式
       实现步骤：
       1.加入处理json的工具库的依赖，默认使用jackson
       2.在springmvc配置文件中加入<mvc:annotation-driver>注解驱动
       3.在处理器方法的上面加入@ResponseBody注解

       springmvc处理器方法返回object，可以转为json输出到浏览器，响应ajax的内部原理
       1.注解驱动：实现的功能是完成java对象到json，xml，text，二进制等数据格式的转换
        HttpMessageConverter接口：消息转换器
        功能：定义了java转为json，xml等数据格式的方法。接口有很多实现类，
               这些实现类完成java对象到json，java对象到xml数据等的转换







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

