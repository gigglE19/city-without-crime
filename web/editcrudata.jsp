<html>
    <head>
        <%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql"%>
        <s:setDataSource driver="${initParam.db_driver}" url="${initParam.db_url}" user="${initParam.db_user}" password="${initParam.db_password}"/>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    </head>
    <body>
        
        
    
        
        <s:update>
            update criminal set name='${param.name}',gender='${param.gender}',height='${param.height}',weight='${param.weight}',pid='${param.pid}',clevel='${param.clevel}',status='${param.status}' where cid="${param.cid}";
       </s:update>
        <%
    request.setAttribute("msg","CRIMINAL RECORD UPDATED SUCCESSFULLY!!");
    %>
    <jsp:forward page="criminalu.jsp?name=${param.id}"/>
    </body>
</html>
