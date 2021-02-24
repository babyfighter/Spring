需求：异常处理

forward
redirect


实现步骤：
1.新建web maven工程
2，加入依赖
3.新建字定义异常类 MyUserException，在定义它的子类NameException，AgeException
4.在controller中抛出NameException，AgeException
5.创建一个普通类，作为全局异常处理类：
    1）类的上面加入@ControllerAdvice
    2）类中定义方法，方法的上面加入@ExceptionHandler
6.创建处理异常的视图页面
7.创建springmvc的配置文件
    1）组件扫描器，扫描@Controller注解
    2）组件扫描器，扫描@ControllerAdvice所在的包名
    3）声明注解驱动



