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
        <title>update C.R.</title>
    </head>
    <body bgcolor="#ccc">


        <h1>UPDATE CRIMINAL RECORDS HERE</h1>
       
                
      <form action="editcrudata.jsp">
            <pre>
<input type="hidden" value="${param.id}" name="id"/>
                CRIMINAL ID:     <input type="text" name="cid" value="${param.cid}"/>

                CRIMINAL NAME:   <input type="text" name="name" value="${param.name}"/>

                GENDER:          <input type="text" name="gender" value="${param.gender}"/>

                HEIGHT:          <input type="text" name="height" value="${param.height}"/>

                WEIGHT:          <input type="text" name="weight" value="${param.weight}"/>

                P.S. ID:         <input type="text" name="pid" value="${param.pid}"/>

                CRIMINAL LEVEL:  <input type="text" name="clevel" value="${param.clevel}"/>

                STATUS:          <input type="text" name="status" value="${param.status}"/>

                                 <input type="submit" value="update"/>
</PRE>
</form>

    </body>
</html>
