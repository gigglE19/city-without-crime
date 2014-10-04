<%-- 
    Document   : ps
    Created on : Jun 11, 2014, 3:35:36 PM
    Author     : sony
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <s:setDataSource driver="${initParam.db_driver}" url="${initParam.db_url}" user="${initParam.db_user}" password="${initParam.db_password}"/>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>police station list</title>
    </head>
    <body bgcolor="#ccc">
        <script>
            function ts(u)
            {
            var cnf=confirm("are you sure you want to delete?");
            if(cnf==true)
                location.href=u;
        }
        </script>
    
            
           


    <CENTER>
        <h1><font style="color: red"/><U>EMERGENCY LIST</U></H1>
                    <s:query var="result">
                        select * from emergency order by sno;

                    </s:query>



                    <table border="1" bgcolor="f4e7bd">
                        <tr style="color: black">
                            <th>SNO</th>
                            <th>DESCRIPTION</th>
                            <th>EDIT</th>
                            <th>DELETE</th>
                        </tr>
                        <c:forEach var="data" items="${result.rows}">
                            <tr>
                                <td style="color: black">${data.sno}</td>
                                <td>${data.description}</td>
                                <td><a href="editem.jsp?sno=${data.sno}&description=${data.description}">edit</a></td>
                                <td ><a onclick='ts("deleteem.jsp?sno=${data.sno}")' href="#">delete</a></td>
                            </tr>
                        </c:forEach>
                        <tr>
                        <form action="addem.jsp">
                            <td colspan="3" bgcolor="white" align="center">${requestScope.msg}</td>
                            <td bgcolor="white"><input type="submit" value="ADD"></a></td>
                        </form> 
                        </tr>
                        </CENTER>
                    </table>
                   
                            <center>
                            
                                <br><br>    
                        <a href="user.jsp?name=${param.name}">HOME</a>
                        </center>
                    </body>
                    </html>
