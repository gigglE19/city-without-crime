<html>
    <head>
        <%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql"%>
        <s:setDataSource driver="${initParam.db_driver}" url="${initParam.db_url}" user="${initParam.db_user}" password="${initParam.db_password}"/>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    </head>
    <body>
        
        
    
        
        <s:update>
            delete from criminal where cid='${param.cid}';
       </s:update>
        <%
    request.setAttribute("msg","CRIMINAL RECORD DELETED SUCCESSFULLY!!");
    %>
    <jsp:forward page="criminals.jsp"/>
    </body>
</html>
