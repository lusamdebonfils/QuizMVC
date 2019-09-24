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
    <script type="text/javascript" src="static/main.js"></script>
</head>
<body>
<div class="container">
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="#">Navbar</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor03" aria-controls="navbarColor03" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarColor03">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Features</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Pricing</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">About</a>
                </li>
            </ul>
            <form class="form-inline my-2 my-lg-0">
                <input class="form-control mr-sm-2" type="text" placeholder="Search">
                <button class="btn btn-secondary my-2 my-sm-0" type="submit">Search</button>
            </form>
        </div>
    </nav>
    <div class="row mt-5">
        <div class="col-4">
            <h3>Side Nav</h3>
            <!-- my Questions will be here -->
            <!-- <div id="loader">
              <img src="loader.gif" alt=""> loading content
            </div> -->
            <form class="form" method="post" id="postForm">

                <div class="">
                    <label for="title">Title</label>
                    <input id="title" type="text" name="title" value="" placeholder="Title comes Here" required>
                </div>
                <div class="">
                    <label for="body">Body</label>
                    <textarea id="body" name="body" rows="5" cols="50" placeholder="Enter Body here" required></textarea>
                    <!-- <textarea name="body" placeholder="Enter Body here"></textarea> -->
                </div>
                <div>
                    <input class="btn btn-outline-info btn-block" type="submit" name="jazz" value="Save">
                </div>
                <!-- <button id="submitBtn" class="btn btn-primary btn-block" type="button" name="button">Post Button</button> -->

            </form>
        </div>
        <div class="col-8">
            <h3>Main content Area</h3>

            <ol id="result">

                <div id="loader">
                    <img src="loader.gif" alt=""> loading content
                </div>
            </ol>
        </div>
    </div>
</div>




</body>
</html>
