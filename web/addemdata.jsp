<html>
    <head>
        <%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql"%>
        <s:setDataSource driver="${initParam.db_driver}" url="${initParam.db_url}" user="${initParam.db_user}" password="${initParam.db_password}"/>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    </head>
    <body>
        
        
    
        
        <s:update>
            insert into emergency(description) values('${param.description}');
       </s:update>
        <%
    request.setAttribute("msg","EMERGENCY RECORD INSERTED SUCCESSFULLY!!");
    %>
    <jsp:forward page="emergency.jsp"/>
    </body>
</html>
