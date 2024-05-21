<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Session | User</title>
        <link rel="stylesheet" href="css/session.css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,100;1,300;1,400;1,500;1,700;1,900&display=swap" rel="stylesheet">
    </head>
    <body>
        <header>
            <div class="left_area">
                <h3>Tom<span>Panel</span></h3>
            </div>
            <div class="text-container">
                <h4>Bem vindo(a), <%= session.getAttribute("username") %>!</h4>
            </div>
            <div class="right_area">
                <a href="logout" class="logout_btn">Logout</a>
            </div>
        </header>
        <div class="loader-container">
            <div class="loader"></div>
        </div>
    </body>
</html>