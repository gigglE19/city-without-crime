<html>
    <head>
        <%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql"%>
        <s:setDataSource driver="${initParam.db_driver}" url="${initParam.db_url}" user="${initParam.db_user}" password="${initParam.db_password}"/>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    </head>
    <body bgcolor="#ccc">
        
        <%
            try
            {
                %>
               
        
        <s:update>
            insert into policestation values('${param.pid}','${param.pname}','${param.address}',${param.phone},'${param.phead}','${param.password}');
       </s:update>
        <%}
            catch(Exception e)
                    {
                        %>
                        <jsp:forward page="errorps.jsp"/>;
                   <% }
    request.setAttribute("msg","POLICE STATION INSERTED SUCCESSFULLY!!");
    %>
    <jsp:forward page="ps.jsp"/>
    </body>
</html>
