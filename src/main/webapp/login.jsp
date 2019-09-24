<%--
  Created by IntelliJ IDEA.
  User: Samuel Luswata
  Date: 9/18/2019
  Time: 11:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Quiz Guy!!!!!</title>
    <link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/sketchy/bootstrap.min.css" rel="stylesheet" integrity="sha384-N8DsABZCqc1XWbg/bAlIDk7AS/yNzT5fcKzg/TwfmTuUqZhGquVmpb5VvfmLcMzp" crossorigin="anonymous">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script type="text/javascript" src="main.js"></script>

</head>
<body>
    <div class="container">
        <h3>Login Page</h3>
        <div id="loader">
            <img src="loader.gif" alt="loader"> loading content
        </div>
        <form>
            Name <input type="text" id="fullname">
            <input type="button" value="Hello" id="btnHello">
        </form>
        <div id="result1"></div>
    </div>

</body>
</html>
