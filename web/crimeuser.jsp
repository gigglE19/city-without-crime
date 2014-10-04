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
      
        


    <CENTER>
        <h1><font color="red"><U>CRIME NEWS</U></font></H1>
                    <s:query var="result">
                        select * from complaint order by id;

                    </s:query>

<div id="news_scroll">
        <marquee behavior="scroll" scrollamount="3" height="300" direction="up" onmouseover="this.stop()" onmouseout="this.start()" >
          
                      
            
            
                        <c:forEach var="data" items="${result.rows}">
                            
                            <ul>     * ${data.description}</ul>
                                                          
                        </c:forEach>
                            <br><br>
                            
        </marquee>
                            
                             
                            
                             </CENTER>
                    
                              <center>
                            
                                <br><br>    
                        <a href="loginpage1.jsp">HOME</a>
                        </center>
                    </body>
                    </html>
