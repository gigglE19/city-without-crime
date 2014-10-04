<%-- 
    Document   : editps
    Created on : Jun 11, 2014, 6:17:24 PM
    Author     : sony
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>update complaints</title>
    </head>
    <body bgcolor="#ccc">


        <h1>EDIT COMPLAINTS HERE</h1>

        <form action="editcomdata.jsp">
            <pre>
                COMPLAINT ID:    <input type="text" name="id" readonly="true" value="${param.id}"/>

                DESCRIPTION:  <input type="text" name="description" value="${param.description}"/>

                CRIMINAL NAME:    <input type="text" name="criminalname" value="${param.criminalname}"/>

                P.S. ID:  <input type="text" name="pid" value="${param.pid}"/>

                STATUS:   <input type="text" name="status" value="${param.status}"/>

                <input type="submit" value="update"/>
</PRE>
</form>

    </body>
</html>
