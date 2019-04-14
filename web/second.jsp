<%@ page import="java.util.Date, logic.TessClass,logic.Cart" %><%--
  Created by IntelliJ IDEA.
  User: macuser
  Date: 2019-04-13
  Time: 12:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SecondWebApplication</title>

</head>
<body>
<h1>Testing JSP</h1>

<%
    Cart cart=(Cart) session.getAttribute("cart");
    String str=cart.getName() + " " + cart.getQuantity();
%>

<%=str %>


</p>
</body>
</html>
