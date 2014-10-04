<html>
    <head>
        <%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql"%>
        <s:setDataSource driver="${initParam.db_driver}" url="${initParam.db_url}" user="${initParam.db_user}" password="${initParam.db_password}"/>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    </head>
    <body>
        
        
    
        
        <s:update>
            delete from task where id='${param.id}';
       </s:update>
        <%
    request.setAttribute("msg","TASK RECORD DELETED SUCCESSFULLY!!");
    %>
    <jsp:forward page="report.jsp"/>
    </body>
</html>
