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
        <title>criminal record list</title>
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
        <h1><U>CRIMINAL RECORD LIST</U></H1>
                    <s:query var="result">
                        select * from criminal order by cid;

                    </s:query>



                    <table border="1" bgcolor="f4e7bd">
                        <tr>
                            <th>CID</th>
                            <th>NAME</th>
                            <th>GENDER</th>
                            <th>HEIGHT</th>
                            <th>WEIGHT</th>
                            <th>PID</th>
                            <th>CLEVEL</th>
                            <th>STATUS</th>
                            <th>EDIT</TH>
                            <TH>DELETE</TH>
                        </tr>
                        <c:forEach var="data" items="${result.rows}">
                           
                           <c:if test="${data.clevel==minor}">
                               <tr>
                           
                           <td>${data.cid}</td>
                                <td>${data.name}</td>
                                <td>${data.gender}</td>
                                <td>${data.height}</td>
                                <td>${data.weight}</td>
                                <td>${data.pid}</td>
                                <td bgcolor="blue">${data.clevel}</td>
                                <td>${data.status}</td>
                                <td><a href="editcr.jsp?cid=${data.cid}&name=${data.name}&gender=${data.gender}&height=${data.height}&weight=${data.weight}&pid=${data.pid}&clevel=${data.clevel}&status=${data.status}">edit</a></td>
                                <td><a onclick='ts("deletecr.jsp?cid=${data.cid}")' href="#">delete</a></td>
                                
                               
                           </tr>
                           </c:if>
                           
                            <c:if test="${data.clevel ne wanted}">
                                                                                   
                            <tr>
                                <td>${data.cid}</td>
                                <td bgcolor="red">${data.name}</td>
                                <td>${data.gender}</td>
                                <td>${data.height}</td>
                                <td>${data.weight}</td>
                                <td>${data.pid}</td>
                                <td>${data.clevel}</td>
                                <td>${data.status}</td>
                                <td><a href="editcru.jsp?cid=${data.cid}&name=${data.name}&gender=${data.gender}&height=${data.height}&weight=${data.weight}&pid=${data.pid}&clevel=${data.clevel}&status=${data.status}&id=${param.name}">edit</a></td>
                                <td><a onclick='ts("deletecru.jsp?name=${param.name}&cid=${data.cid}")' href="#">delete</a></td>
                            </tr>
                            </c:if>
                        </c:forEach>
                        <tr>
                        <form action="addcru.jsp?name=${param.name}">
                            <td colspan="9" bgcolor="white" align="center">${requestScope.msg}</td>
                              <td bgcolor="white"><input type="submit" value="ADD" align="center" style="padding-left: 4px;padding-right: 2px"></a></td>
                        </form> 
                        </tr>
                        </CENTER>
                    </table>
  <center>
                            
                                <br><br>    
                        <a href="user.jsp?name=${param.name}">HOME</a>
                        </center>
                    </body>
                    </html>
