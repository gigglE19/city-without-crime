<html>
    <head>
        <%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql"%>
        <s:setDataSource driver="${initParam.db_driver}" url="${initParam.db_url}" user="${initParam.db_user}" password="${initParam.db_password}"/>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    </head>
    <body bgcolor="#ccc">
        
        
    
        
        <s:update>
            insert into task values('${param.id}','${param.description}','${param.ftid}','${param.ttid}');
       </s:update>
        <%
    request.setAttribute("msg","TASK INSERTED SUCCESSFULLY!!");
    %>
    <jsp:forward page="report.jsp"/>
    </body>
</html>
