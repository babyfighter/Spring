
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme()+"://"+
            request.getServerName()+":"+request.getServerPort()+
            request.getContextPath()+"/";
%>
<html>
<head>
    <title>Title</title>
    <base href="<%=basePath%>>"/>
</head>
<body>
        <p>当处理器方法返回ModelandView实现forward</p>

        <form action="doForward.do" method="post">
            姓名：<input type="text" name="name"><br/>
            年龄：<input type="text" name="age"><br/>
            <input type="submit" value="提交参数">
        </form>
        <br/>
        <br/>
        <p>当处理器方法返回ModelandView实现redirect</p>

        <form action="doRedirect.do" method="post">
            姓名：<input type="text" name="name"><br/>
            年龄：<input type="text" name="age"><br/>
            <input type="submit" value="提交参数">
        </form>
</body>
</html>
