<%-- 
    Document   : editps
    Created on : Jun 11, 2014, 6:17:24 PM
    Author     : sony
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>update TASK</title>
    </head>
    <body bgcolor="#ccc">
         <s:setDataSource driver="${initParam.db_driver}" url="${initParam.db_url}" user="${initParam.db_user}" password="${initParam.db_password}"/>
        <s:query var="result1">
                        select pid from policestation;

                    </s:query>

    <center>
        <h1><U>ADD TASKS HERE</U></h1>

        <form action="addrdata.jsp">
            <pre>
                REPORT ID:     <input type="text" name="id"/>

                DESCRIPTION:   <input type="text" name="description"/>

<label for="email">              FTID :         </label><select name="ftid">
            <option value="pid">--SELECT P.S. ID--</option>
          
                  <c:forEach var="data" items="${result1.rows}">
                      <option value="${data.pid}">${data.pid}</option>
            </c:forEach>
            
          </select>
                  <A HREF="psid.jsp"> get details about your police stations !!!</a>

                TTID:          <input type="text" name="ttid"/>

                                <input type="submit" value="update"/>
</PRE>
</form>
    </center>
       <center>
                        <a href="inboxcp.jsp">HOME</a>
                        </center>
    </body>
</html>
