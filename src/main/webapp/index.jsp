<%@ page import="com.example.demo.HelloServlet" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Quest Servlet</title>
</head>
<body>

<%
    String noname;

%>
<h1><%= "Let's try our simple test ! " %>
</h1>
<br/>
<h1><%= "              " %>


<button type="button"  onclick="window.location.href='hello-servlet';">Try</button>
<button type="button" onclick="window.location.href='reject-result';">Reject!</button>




</body>


</html>