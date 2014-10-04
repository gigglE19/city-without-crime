<%-- 
    Document   : register
    Created on : Jun 11, 2014, 6:30:11 AM
    Author     : sony
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>POLICE STATION REGISTRATION</title>
        <link rel="stylesheet" href="sitestyle/democss.css"/>
    </head>
    
    <body bgcolor="#ccc">
    <CENTER>
        <br><br><h1><U>POLICE STATION REGISTRATION FORM</U></h1>
        <form action="addps.jsp" method="post">
            <br><br><BR> <div style="width:65px;height:14px;margin:0px;padding:7px 0 0 0;font-family:Arial;font-size:10px;color:#95844d;">P.S. ID:  <input type="text" id="textfield" placeholder="id should start with 'ps'" name="pid"/></div>
           <BR> <div style="width:65px;height:14px;margin:0px;padding:7px 0 0 0;font-family:Arial;font-size:10px;color:#95844d;"> P.S. NAME:<input type="text" id="textfield" placeholder="enter ur name" name="pname"/></div>
           <br> <div style="width:65px;height:14px;margin:0px;padding:7px 0 0 0;font-family:Arial;font-size:10px;color:#95844d;">  ADDRESS:  <input type="text" id="textfield" placeholder="enter ur address" name="address"/></div>
           <BR>  <div style="width:65px;height:14px;margin:0px;padding:7px 0 0 0;font-family:Arial;font-size:10px;color:#95844d;"> PHONE NO: <input type="text" id="textfield" placeholder="enter phn no" name="phone"/></div>
           <BR> <div style="width:65px;height:14px;margin:0px;padding:7px 0 0 0;font-family:Arial;font-size:10px;color:#95844d;">  P.S. HEAD:<input type="text" id="textfield" placeholder="enter ps head's name" name="phead"/></div>
           <BR>  <div style="width:65px;height:14px;margin:0px;padding:7px 0 0 0;font-family:Arial;font-size:10px;color:#95844d;">PASSWORD: <input type="text" id="textfield" placeholder="enter password" name="password"/></div>
            <br><br><INPUT TYPE="SUBMIT" VALUE="REGISTER"/>
            <INPUT TYPE="RESET" VALUE="RESET"/>
        </form>
    </center>




</body>
</html>
