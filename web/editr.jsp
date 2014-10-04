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
<center> 

    <h1><u>UPDATE TASKS HERE</u></h1>
       
              
      <form action="editrdata.jsp">
          <font style="font-family:Verdana, Arial, Helvetica, sans-serif" >
          TASK ID: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;      <input type="text" name="id" readonly="true" value="${param.id}"/><br>

                DESCRIPTION:   <input type="text" name="description" value="${param.description}"/><br>

                FTID: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;          <input type="text" name="ftid" value="${param.ftid}"/><br>

                TTID: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;          <input type="text" name="ttid" value="${param.ttid}"/><br>

                <br>  <input type="submit" value="update"/>
</font>
</form>
    </center>
    </body>
</html>
