<%-- 
    Document   : recregistration
    Created on : Jun 11, 2014, 7:33:45 AM
    Author     : sony
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="s"%>

<s:setDataSource driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/stpnoida" user="root" password="ankur123"/>
<jsp:useBean id="s" class="hp.util.javabean"/>
<jsp:setProperty name="s" property="*"/>
<s:update var="result">
    insert into policestation values('<jsp:getProperty name="s" property="pid"/>','<jsp:getProperty name="s" property="name"/>','<jsp:getProperty name="s" property="address"/>','<jsp:getProperty name="s" property="phnno"/>','<jsp:getProperty name="s" property="pshead"/>','<jsp:getProperty name="s" property="password"/>');
</s:update>
    <h1>REGISTRATION SUCCESSFUL!!</h1>
    
    