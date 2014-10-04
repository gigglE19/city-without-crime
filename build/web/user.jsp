<%-- 
    Document   : header
    Created on : Jun 11, 2014, 4:04:30 AM
    Author     : sony
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <title>LOGIN PAGE</title>
        <link rel="stylesheet" href="sitestyle/inbox.css"/>
        
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            </head>
    <body bgcolor="#ccc">
         
        <%String r=request.getParameter("name");
        ServletConfig cfg=getServletConfig();
        String c;
        c =cfg.getInitParameter("phn");
        String e=cfg.getInitParameter("emailid");
        try {
            
            HttpSession sess=request.getSession(false);
            
            if(sess!=null)
            {
      %>
        
    <CENTER>
<h1 style="background-image: url(sitestyle/headerbg.jpg);background-repeat: repeat-x;height: 40px;text-align: center;padding-top: 10px">POLICE STATION ${param.name} MENU</h1>
<hr />
    </center>
<ul class="vert-one">
  <li><a href="complaintu.jsp?name=${param.name}" >COMPLAINT RECEIVED</a></li>
  <li><a href="complaintua.jsp?name=${param.name}" >ALL COMPLAINTS</a></li>
  <li><a href="psidu.jsp?name=${param.name}">POLICE STATIONS</a></li>
  <li><a href="tasksu.jsp?name=${param.name}">TASKS</a></li>
  <li><a href="criminalu.jsp?name=${param.name}">CRIMINAL RECORDS</a></li>
  <li><a href="emergencyu.jsp?name=${param.name}">EMERGENCY NEWS</a></li>
  <li><a href="crimenewsu.jsp?name=${param.name}">CRIME NEWS</a></li>
  <li><a href="off">LOGOUT</a></li>
 
</ul>

 <%   }
            else
            {
                %>
                
                <h1 style="background-image: url(sitestyle/headerbg.jpg);background-repeat: repeat-x;height: 40px;text-align: center;padding-top: 10px">SORRY!! not logged in</h1>
            <a href=loginpage.html>TO login click here</a>
         <%   }
        }
        catch(Exception ex)
        {
            out.print("exception caught"+ex.getMessage());
        
        }

  %>        
    </body>
</html>
