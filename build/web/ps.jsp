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
        <title>police station list</title>
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
        <h1><U>POLICE STATIONS RECORD LIST<U></H1>
                    <s:query var="result">
                        select * from policestation order by pid;

                    </s:query>



                    <table border="1" bgcolor="f4e7bd">
                        <tr>
                            <th>PID</th>
                            <th>PNAME</th>
                            <th>ADDRESS</th>
                            <th>PHONE NO</th>
                            <th>P.S. HEAD</th>
                            <th>EDIT</th>
                            <th>DELETE</th>
                        </tr>
                        <c:forEach var="data" items="${result.rows}">
                            <tr>
                                <td>${data.pid}</td>
                                <td>${data.pname}</td>
                                <td>${data.address}</td>
                                <td>${data.phone}</td>
                                <td>${data.phead}</td>
                                <td><a href="editps.jsp?pid=${data.pid}&pname=${data.pname}&address=${data.address}&phone=${data.phone}&phead=${data.phead}">edit</a></td>
                                <td><a onclick='ts("deleteps.jsp?pid=${data.pid}")' href="#">delete</a></td>
                            </tr>
                        </c:forEach>
                        <tr>
                        <form action="register.jsp">
                            <td colspan="6" bgcolor="white" align="center">${requestScope.msg}</td>
                            <td bgcolor="white"><input type="submit" value="ADD"></a></td>
                        </form> 
                        </tr>
                        </CENTER>
                    </table>
                   
                            <center>
                            
                                <br><br>    
                        <a href="inboxcp.jsp">HOME</a>
                        </center>
                    </body>
                    </html>
