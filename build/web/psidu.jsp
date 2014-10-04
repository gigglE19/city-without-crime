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
       
    
            
           


    <CENTER>
        <h1><U>POLICE STATIONS LIST<U></H1>
                    <s:query var="result">
                        select pid,pname,address,phone,phead from policestation order by pid;

                    </s:query>



                    <table border="1" bgcolor="f4e7bd">
                        <tr>
                            <th>PID</th>
                            <th>PNAME</th>
                            <th>ADDRESS</th>
                            <th>PHONE NO</th>
                            <th>P.S. HEAD</th>
                            
                        </tr>
                        <c:forEach var="data" items="${result.rows}">
                            <tr>
                                <td>${data.pid}</td>
                                <td>${data.pname}</td>
                                <td>${data.address}</td>
                                <td>${data.phone}</td>
                                <td>${data.phead}</td>
                               
                            </tr>
                        </c:forEach>
                        <tr>
                       
                        </CENTER>
                    </table>
                   <center>
                            
                         
                       
                       <br><br>
                        <a href="user.jsp?name=${param.name}">HOME</a>
                        </center>
                    </body>
                    </html>
