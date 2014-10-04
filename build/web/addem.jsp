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
        <title>update p.s.</title>
    </head>
    <body bgcolor="#ccc">


    <center>
        <h1>ADD EMERGENCY RECORDS HERE</h1>

        <form action="addemdata.jsp">
            <pre>
 DESCRIPTION:     
<textarea name="description" cols="60%" rows="8"></textarea>

 <input type="submit" value="update"/>
</PRE>
</form>
    </center>
       
    </body>
</html>
