<%-- 
    Document   : ps
    Created on : Jun 11, 2014, 3:35:36 PM
    Author     : sony
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <s:setDataSource driver="${initParam.db_driver}" url="${initParam.db_url}" user="${initParam.db_user}" password="${initParam.db_password}"/>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>complain list</title>
    </head>
    <body bgcolor="#ccc">
        <script>
            function ts(u)
            {
            var cnf=confirm("are you sure you want to delete?");
            if(cnf==true)
                location.href=u;
        }
        </script>
    
            
           


    <CENTER>
        <h1><U>COMPLAINT LIST<U></H1>
                    <s:query var="result">
                        select * from complaint;

                    </s:query>

                        <c:if test="${result.rows} eq null">
                            <h2>NO COMPLAINTS RECEIVED!!</h2>
                        </c:if>

                    <table border="1" bgcolor="f4e7bd">
                        <tr>
                            <th>ID</th>
                            <th>DESCRIPTION</th>
                            <th>CRIMINAL NAME</th>
                            <th>PID</th>
                            <TH>STATUS</TH>
                            <th>EDIT</th>
                            <th>DELETE</th>
                        </tr>
                        <c:forEach var="data" items="${result.rows}">
                            <tr>
                                
                                <td>${data.id}</td>
                                <td >${data.description}</td>
                                <td>${data.criminalname}</td>
                                <TD>${data.pid}
                                <td>${data.status}</td>
                                <td><a href="editcomu.jsp?id=${data.id}&description=${data.description}&criminalname=${data.criminalname}&name=${param.name}&status=${data.status}">edit</a></td>
                                <td><a onclick='ts("deletecomu.jsp?id=${data.id}&name=${param.name}")' href="#">delete</a></td>
                            </tr>
                        </c:forEach>
                            <tr>
                             <td colspan="7" bgcolor="white" align="center">${requestScope.msg}</td>
                            </tr>
                             </CENTER>
                    </table>
                              <center>
                            
                                <br><br>    
                        <a href="user.jsp?name=${param.name}">HOME</a>
                        </center>
                    </body>
                    </html>
