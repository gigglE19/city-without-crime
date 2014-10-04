<html>
    <head>
        <%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql"%>
        <s:setDataSource driver="${initParam.db_driver}" url="${initParam.db_url}" user="${initParam.db_user}" password="${initParam.db_password}"/>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    </head>
    <body>
        
        
    
        
        <s:update>
            insert into criminal values('${param.cid}','${param.name}','${param.gender}','${param.height}','${param.weight}','${param.pid}','${param.clevel}','${param.status}');
       </s:update>
        <%
    request.setAttribute("msg","CRIMINAL RECORD INSERTED SUCCESSFULLY!!");
    %>
    <jsp:forward page="criminalu.jsp?name=${param.id}"/>
    </body>
</html>
