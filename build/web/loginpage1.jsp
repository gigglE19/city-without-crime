
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">

<head>
    <%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <s:setDataSource driver="${initParam.db_driver}" url="${initParam.db_url}" user="${initParam.db_user}" password="${initParam.db_password}"/>
  <title>ARaynorDesign Template</title>
  <meta name="description" content="free website template" />
  <meta name="keywords" content="enter your keywords here" />
  <meta http-equiv="content-type" content="text/html; charset=utf-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=9" />
  <link rel="stylesheet" type="text/css" href="res/style1.css" />
  <script type="text/javascript" src="res/jquery.min.js"></script>
  <script type="text/javascript" src="res/image_slide.js"></script>
  <s:query var="result">
                        select * from complaint order by id;

                    </s:query>
                        <s:query var="result1">
                        select pid from policestation;

                    </s:query>
                        <s:query var="result2">
                        select id from complaint;

                    </s:query>
                        <s:query var="result3">
                        select description from emergency;

                    </s:query>
</head>

<body>
  <div id="main">
    <div id="header">
	  <div id="banner">
              
                            <form action="auth" method="post" style="width: 400px;
  float: right;
  height: 10px;
  margin: 0;
  padding-left: 20px;
  background: transparent;">
            
           P.S. ID : <input type="text" name="name" placeholder="enter your ID"/>
           
            Password : <input type="password" name="pass"placeholder="password" />
            &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
               &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
               <input type="submit" value="LOGIN" />
          
        </form>
              
	    <div id="welcome">
	      <h1>City Without Crime</h1>
	    </div><!--close welcome-->
            
     
            
	    <div id="welcome_slogan">
	      <h1>Service Before Self</h1>
	    </div><!--close welcome_slogan-->
          
          
                
       
              
                      
    </div>
    </div><!--close header-->

	<div id="menubar">
      <ul id="menu">
        <li class="current"><a href="#">Home</a></li>
        <li><a href="about.html">About US</a></li>
        <li><a href="psuser.jsp">Police Stations</a></li>
        <li><a href="crimeuser.jsp">Crime News</a></li>
        <li><a href="contactus.html">Contact Us</a></li>
      </ul>
    </div><!--close menubar-->	
    
	<div id="site_content">		

	  <div class="sidebar_container">       
		<div class="sidebar">
          <div class="sidebar_item">
            <h2>Complaint Status</h2>
            
                             <br>
                        <form action="compstatus.jsp" method="post">
        COMPLAIN ID:<select name="id">
            <option value="id">--SELECT ID--</option>
          
                  <c:forEach var="data" items="${result2.rows}">
                      <option value="${data.id}">${data.id}</option>
            </c:forEach>
        </select>        
                 
        <br><br>   
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <input type="submit" value="submit">
    </form>
            
          </div><!--close sidebar_item--> 
        </div><!--close sidebar-->     		
		<div class="sidebar">
          <div class="sidebar_item">
            <h2>Crime News</h2>
            <h3>June 2014</h3>
            <p><U>NEWS CONTAINS THE POLICE STATION ID AND DETAILS</U></p>         
		  </div><!--close sidebar_item--> 
        </div><!--close sidebar-->
        
        <c:forEach var="data" items="${result.rows}">
		<div class="sidebar">
          <div class="sidebar_item">
            <h3>${data.pid}</h3>
            <p>${data.description}</p>         
		  </div><!--close sidebar_item--> 
        </div><!--close sidebar-->  
        </c:forEach>
		  		
        <div class="sidebar">
          <div class="sidebar_item">
            <h2>Contact</h2>
            <p>Phone: +91 (0)11 567891</p>
            <p>Email: delhip@indiaps.co.in</p>
          </div><!--close sidebar_item--> 
        </div><!--close sidebar-->
       </div><!--close sidebar_container-->	
	
      <ul class="slideshow">
          <li class="show"><img width="680" height="250" src="res/home_1.jpg" alt="&quot;Department&quot;" /></li>
        <li><img width="680" height="250" src="res/home_2.jpg" alt="&quot;Headquaters&quot;" /></li>
      </ul>   	 
	 
	  <div id="content">
        <div class="content_item">
		  <h1>Welcome To City Without Crime Website</h1>
                  
                  <div  align="left"><img src="res/emer.gif" width="95" height="32" alt="" /></div>   
                      
       
                  <marquee behavior="scroll" direction="left" onmouseover="this.stop();" onmouseout="this.start();" scrollamount="4">
        <c:forEach var="data" items="${result3.rows}">
            <img src="res/healp-line-bullet.png" width="11" height="13" alt="" /><id style="color:red"><U>${data.description}</u></id>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        </c:forEach>  
                  </marquee>
                  
                  
	      <p>SAFECITY is an information aggregation platform to help identify hotspots in a city where abuse has been reported. This platform only provides information based on voluntary unverified reports.
This should not be taken as a substitute or replacement for the law enforcement process. This will only be successful if people come out and pin the creeps who are harassing us on the roads</p>
		  
		  <div class="content_image">
		    <img src="res/content_image1.jpg" alt="image1"/>
	      </div>
		  <p>SAFECITY is a project that helps to identify locations where women have experienced or witnessed any type of sexual harassment ? verbal comments, graphic behavior, menace? anything. By starting this project we wish to highlight a serious social issue and we believe we are taking a step towards changing the way our society thinks and reacts. In time we hope it will lead to a safe and non-violent environment for all.</p>
   
		  <br style="clear:both"/>
                  
                  <div  align="left"><img src="res/help-line-head.png" width="95" height="32" alt="" /></div>   
                      
                     <marquee behavior="scroll" direction="left" onmouseover="this.stop();" onmouseout="this.start();" scrollamount="4">
        <img src="res/healp-line-bullet.png" width="11" height="13" alt="" />&nbsp;PCR : <span>100 (24X7) (Toll Free)</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="res/healp-line-bullet.png" width="11" height="13" alt="" />&nbsp;Eyes and Ears : <span>1090 (Toll Free)</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="res/healp-line-bullet.png" width="11" height="13" alt="" />&nbsp;Women in distress : <span>1091</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="res/healp-line-bullet.png" width="11" height="13" alt="" />&nbsp;Special Cell (North-Eastern States) : <span>1093</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="res/healp-line-bullet.png" width="11" height="13" alt="" />&nbsp;Missing Persons : <span>1094, 23241210</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="res/healp-line-bullet.png" width="11" height="13" alt="" />&nbsp;Traffic : <span>1095, 25844444</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="res/healp-line-bullet.png" width="11" height="13" alt="" />&nbsp;Senior Citizen : <span>1291</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="res/healp-line-bullet.png" width="11" height="13" alt="" />&nbsp;Vigilance : <span>1064</span>
                     </marquee>
                  
                  <div class="content_container">
		    <p>We propose that we PIN THE CREEPS! aWe all share our little experiences; upload our horrid stories, the photographs or the videos and most importantly the location where it happened.
"We strongly believe that all women have the right to live safely, irrespective of which city they stay in. We also believe that a woman should be able to move around without fear or distress; without having to calculate which road she has to travel on so that she will be safe; without having to worry about the clothes she wears or the people she is with.</p>
		  	<div class="button_small">
		      <a href="about.html">Read more</a>
		    </div><!--close button_small-->
		  </div>
                  
		  
		  <div class="content_container">
                      
                      <DIV style="COLOR:#000000;font-size: 22PX;font-family:Georgia;"><u>LODGE A COMPLAINT</u></DIV>
                      <br>
                      <form action="complaint.jsp" method="post">
          
          
             <p>
                <label for="email">CRIMINAL NAME (optional)</label>
            <input type="text" name="criminalname" id="email" value="" size="22" />
          
          </p>
          <p>
          <label for="email">POLICE STATION ID(required)</label><select name="pid">
            <option value="pid">--SELECT P.S. ID--</option>
          
                  <c:forEach var="data" items="${result1.rows}">
                      <option value="${data.pid}">${data.pid}</option>
            </c:forEach>
            
          </select>
          </p>
          <p>
    
          <A HREF="psid.jsp">--->get details about your police stations<---</a>
          </p> 
          
          <U>DESCRIPTION:</U>
          <p>
              <label for="comment" style="display:none;">res/Comment (required)</label>
            <textarea name="description" id="comment" cols="30%" rows="8"></textarea>
            
          </p>
          <p>
            <input type="submit" id="submit" value="Submit Complaint" />
            &nbsp;
            <input type="reset"  id="reset"  value="Reset" />
          </p>
        </form>
                      
                      
                      
                    
                      
                      
		  	<!--close button_small-->
		  </div><!--close content_container-->
          <!--close content_container-->			  
		</div><!--close content_item-->
      </div><!--close content-->   
	</div><!--close site_content--> 
 
  
</body>
</html>
