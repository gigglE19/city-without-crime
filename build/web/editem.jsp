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


        <h1>UPDATE EMERGENCY HERE</h1>

        <form action="editemdata.jsp">
            <pre>
                EMERGENCY ID:    <input type="text" name="pid" value="${param.sno}"/>

                DESCRIPTION:     
<textarea name="pname" id="comment" cols="60%" rows="8">${param.description}</textarea>

               <input type="submit" value="update"/>
</PRE>
</form>

    </body>
</html>
