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
        <title>update p.s.</title>
    </head>
    <body bgcolor="#ccc">


        <h1>UPDATE POLICE STATIONS HERE</h1>

        <form action="editpsdata.jsp">
            <pre>
                P.S. ID:    <input type="text" name="pid" readonly="true" value="${param.pid}"/>

                P.S.NAME:   <input type="text" name="pname" value="${param.pname}"/>

                ADDRESS:    <input type="text" name="address" value="${param.address}"/>

                PHONE NO.:  <input type="text" name="phone" value="${param.phone}"/>

                P.S.HEAD:   <input type="text" name="phead" value="${param.phead}"/>

                <input type="submit" value="update"/>
</PRE>
</form>

    </body>
</html>
