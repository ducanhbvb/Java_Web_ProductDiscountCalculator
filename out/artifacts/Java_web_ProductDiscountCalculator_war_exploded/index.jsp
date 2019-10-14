<%--
  Created by IntelliJ IDEA.
  User: ADMINIS
  Date: 14/10/2019
  Time: 14:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Currency Converter</title>
  <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>

<div id="content">
  <h2>Product Discount Calculator</h2>
  <form method="get"action="/converter">
    <legend>
      <label>Product Description: </label>
      <input type="text" name="description" placeholder="Description" value="0"/><br/>
      <label>List Price:: </label>
      <input type="text" name="price" placeholder="Price" value="0"/><br/>
      <label>Discount Percent (%):</label>
      <input type="text" name="percent" placeholder="Percent" value="0"/><br/>
      <input type = "submit" id = "submit" value = "Converter"/>
    </legend>
</div>


</form>
</body>
</html>
