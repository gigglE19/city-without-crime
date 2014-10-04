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
       




    <CENTER>
        <h1><U>TASK LIST</U></H1>
                    <s:query var="result">
                        select * from task where ftid="${param.name}";

                    </s:query>



                    <table border="1" bgcolor="f4e7bd">
                        <tr>
                            <th>ID</th>
                            <th>DESCRIPTION</th>
                            <th>FTID</th>
                            <th>TTID</th>
                            
                        </tr>
                        <c:forEach var="data" items="${result.rows}">
                           
                           
                               <tr>
                           
                                <td>${data.id}</td>
                                <td>${data.description}</td>
                                <td>${data.ftid}</td>
                                <td>${data.ttid}</td>
                               </tr>
                          </c:forEach>
                       
                        
                    </table>
  <center>
                            
                                <br><br>    
                        <a href="user.jsp?name=${param.name}">HOME</a>
                        </center>
                    </body>
                    </html>
