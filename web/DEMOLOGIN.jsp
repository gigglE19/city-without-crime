
<html>
    <head>
        
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    
        <s:setDataSource driver="${initParam.db_driver}" url="${initParam.db_url}" user="${initParam.db_user}" password="${initParam.db_password}"/>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    
        <title>LOGIN PAGE</title>
        <link rel="stylesheet" href="sitestyle/democss.css"/>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
    </head>
    <body>
   
  <div id="headerbg">
               <div align="right" valign="top">
	<form action="Auth" method="post">
            
           P.S. ID : <input type="text" name="userid" placeholder="enter your ID"/>
           
            Password : <input type="password" name="pass"placeholder="password" />
             
                 <input type="submit" value="LOGIN" />
            
        </form>
        </div>
  <div id="headerblank">
      <div id="header">
      
     <div id="menu">
        
        <ul>
          <li><a href="#" class="menu">Home</a></li>
          <li><a href="#" class="menu">About Us</a></li>
          <li><a href="#" class="menu">News</a></li>
          <li><a href="#" class="menu">Complain<a></li>
          <li><a href="#" class="menu">Contact us<a></li>
        </ul>
      </div>
  </DIV>
    </div>
    </div>
    
    <s:query var="result1">
                        select pid from policestation;

                    </s:query>

    <s:query var="result">
                        select * from complaint order by id;

                    </s:query>
                        <s:query var="result2">
                        select id from complaint;

                    </s:query>
    
                        <%!int c=1;%>
                        <BR>
                        <br><BR>
                        <DIV style="COLOR:#b22d00;font-size: 22PX;font-family:Georgia;align:left"><u>Complaint Status</u></DIV>
                        <br>
                        <form action="compstatus.jsp" method="post" style="ALIGN:LEFT">
        COMPLAIN ID:<select name="id">
            <option value="id">--SELECT ID--</option>
          
                  <c:forEach var="data" items="${result.rows}">
                      <option value="${data.id}">${data.id}</option>
            </c:forEach>
        </select>        
                  
        <br>      
        <input type="submit" value="submit">
    </form>
                        
                        <TABLE>
                            <TR>    
                        
                                <TD>
                                    
                                         

    <div id="content">
      <div id="contentleft" STYLE="OVERFLOW:SCROLL; WIDTH:225PX; HEIGHT:250PX">
        <div id="leftheading">
            <h4><u>CRIME NEWS</u></h4>
        </div>
          <c:forEach var="data" items="${result.rows}">
        <div class="lefttxtblank" >
          <div class="lefticon"><%=c++%></div>
          <div class="leftboldtxtblank">
            <div class="leftboldtxt">${data.pid}</div>
            <div class="lefttxt">By DSP  | 11:55 AM</div>
          </div>
          <div class="leftnormaltxt">${data.description}</div>
          
                 
          </c:forEach>
        </div>
      </div>
    </div>
      </TD>
  
         <TD>
        
             
             
             
                   <div id="respond">
                       <DIV style="COLOR:#7e8901;font-size: 22PX;font-family:Georgia;"><u>LODGE A COMPLAINT</u></DIV>
        <form action="complaint.jsp" method="post">
          
          
             <p>
                <label for="email"><small>CRIMINAL NAME (optional)</small></label>
            <input type="text" name="criminalname" id="email" value="" size="22" />
          
          </p>
          <p>
          <label for="email"><small>POLICE STATION ID(optional)</small></label><select name="pid">
            <option value="pid">--SELECT P.S. ID--</option>
          
                  <c:forEach var="data" items="${result1.rows}">
                      <option value="${data.pid}">${data.pid}</option>
            </c:forEach>
            
          </select>
          </p>
          
          
          <U>DESCRIPTION:</U>
          <p>
              <label for="comment" style="display:none;"><small>Comment (required)</small></label>
            <textarea name="description" id="comment" cols="30%" rows="8"></textarea>
            
          </p>
          <p>
            <input name="submit" type="submit" id="submit" value="Submit Complaint" />
            &nbsp;
            <input name="reset" type="reset" id="reset" tabindex="5" value="Reset" />
          </p>
        </form>
      </div>
    </div>
                     </TD>
 
                    
      </TR>
          </TABLE>
        

            
            
            
            
    

    
      
        


    
                   

                          
                            
                          
                   

          </div>
          

          
          
          
         


</body>
</html>
