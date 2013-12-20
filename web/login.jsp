<%@ page language="java" contentType="text/html; charset=windows-1256" pageEncoding="windows-1256" %>

<%@ page import="org.jasig.cas.client.authentication.AttributePrincipal" %>


<body >

<jsp:forward page="/home">
    <jsp:param name="username" value=" <%=request.getRemoteUser()%>" />

   </jsp:forward>


</body>
