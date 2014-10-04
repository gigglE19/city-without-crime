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
        <title>report list</title>
    </head>
    <body bgcolor="#ccc">
        <script>
            function ts(u)
            {
                var cnf = confirm("are you sure you want to delete?");
                if (cnf == true)
                    location.href = u;
            }
        </script>





    <CENTER>
        <h1><U>TASK LIST</U></H1>
                    <s:query var="result">
                        select * from task order by id;

                    </s:query>



                    <table border="1" bgcolor="f4e7bd">
                        <tr>
                            <th>ID</th>
                            <th>DESCRIPTION</th>
                            <th>FTID</th>
                            <th>TTID</th>
                            <th>EDIT</TH>
                            <TH>DELETE</TH>
                        </tr>
                        <c:forEach var="data" items="${result.rows}">
                           
                           
                               <tr>
                           
                                <td>${data.id}</td>
                                <td>${data.description}</td>
                                <td>${data.ftid}</td>
                                <td>${data.ttid}</td>
                                <td><a href="editr.jsp?id=${data.id}&description=${data.description}&ftid=${data.ftid}&ttid=${data.ttid}">edit</a></td>
                                <td><a onclick='ts("deleter.jsp?id=${data.id}")' href="#">delete</a></td>
                             </tr>
                          </c:forEach>
                        <tr>
                        <form action="addr.jsp">
                            <td colspan="5" bgcolor="white" align="center">${requestScope.msg}</td>
                              <td bgcolor="white"><input type="submit" value="ADD" align="center" style="padding-left: 4px;padding-right: 2px"></a></td>
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
