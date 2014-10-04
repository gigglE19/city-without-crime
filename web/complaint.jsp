<html>
    <head>
        <%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql"%>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <s:setDataSource driver="${initParam.db_driver}" url="${initParam.db_url}" user="${initParam.db_user}" password="${initParam.db_password}"/>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    </head>
    <body bgcolor="#ccc">
        
        <%    
    try
    {

    
%>
         
        
        <s:update>
            insert into complaint(description,criminalname,pid) values('${param.description}','${param.criminalname}','${param.pid}');
        </s:update>
        <%
    }
    catch(Exception e)
    {
    String s=e.getMessage();
   %>
   <jsp:forward page="exceptionc.jsp?msg=s"/>
   <%
       
    
    }
    
  
%>
<s:query var="result">
                        select id from complaint where description="${param.description}";

                    </s:query>


    <CENTER><H1>COMPLAINT FILED SUCCESSFULLY!!</H1>
        
        <c:forEach var="data" items="${result.rows}">
        <h2>YOUR COMPLAINT ID IS:${data.id}</h2>
        </c:forEach>
    </CENTER>
    
    <a href="loginpage1.jsp">click here to see status</a>
           
    </body>
</html>
