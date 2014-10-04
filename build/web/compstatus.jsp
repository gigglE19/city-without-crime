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
        <title>complain status</title>
    </head>
    <body bgcolor="#ccc">
        





    <CENTER>
        <h1><U>COMPLAINT STATUS</U></H1>
                    <s:query var="result">
                        select id,status from complaint where id=<%=request.getParameter("id")%>;

                    </s:query>



                    <table border="1" bgcolor="red">
                        <tr>
                            <th>COMPLAIN ID</th>
                            
                            <th>STATUS</th>
                            
                        </tr>
                        <c:forEach var="data" items="${result.rows}">
                           
                           
                               <tr>
                           
                           <td>${data.id}</td>
                                
                                <td bgcolor="f4e7bd">${data.status}</td>
                                
                   
                                
                               
                           </tr>
                           
                           
                            
                        </c:forEach>
                        <tr>
                        
                    </table>
    </CENTER>
    
    
                        <HR>
                        <MARQUEE>
                            FOR FURTHER DETAILS CONTACT YOUR NEAREST POLICE STATION!!
                        </marquee>
                        <HR>
                        <center>
                            
                              
                        <a href="loginpage1.jsp">HOME</a>
                        </center>
                        </body>
                    </html>
