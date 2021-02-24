拦截器Interceptor


实现步骤：
1.新建web maven工程
2，加入依赖
3.创建Controller类
4.创建普通类，作为拦截器使用
    1）实现HandlerInterceptor接口
    2）实现接口中的三个方法
5.创建show.jsp
6.创建springmvc配置文件
    1）组件扫描器，扫描@Controller注解
    2）生命拦截器，指定拦截的请求uri地址
