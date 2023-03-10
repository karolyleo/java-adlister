<%--
  Created by IntelliJ IDEA.
  User: jarvis
  Date: 3/9/23
  Time: 3:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    if(username != null && password != null){
        if ("admin".equals(username) && "password".equals(password)) {
            // if the username and password are correct, redirect to the profile page
            response.sendRedirect("/profile.jsp");
        } else {
            // if the username and/or password are incorrect, display an error message and stay on the login page
            out.println("<p>Invalid username and/or password. Please try again.</p>");
        }
    }
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <style>
        .gradient-custom {
            /* fallback for old browsers */
            background: #6a11cb;

            /* Chrome 10-25, Safari 5.1-6 */
            background: -webkit-linear-gradient(to right, rgba(106, 17, 203, 1), rgba(37, 117, 252, 1));

            /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
            background: linear-gradient(to right, rgba(106, 17, 203, 1), rgba(37, 117, 252, 1))
        }
    </style>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</head>
<body>
<jsp:include page="partials/navbar.jsp"/>
<section class="vh-100 gradient-custom">
    <div class="container py-5 h-100">
        <div class="row d-flex justify-content-center align-items-center h-100">
            <div class="col-12 col-md-8 col-lg-6 col-xl-5">
                <div class="card bg-dark text-white" style="border-radius: 1rem;">
                    <div class="card-body p-5 text-center">

                        <form class="mb-md-5 mt-md-4 pb-5" id="loginForm" method="Post">

                            <h2 class="fw-bold mb-2 text-uppercase">Login</h2>
                            <p class="text-white-50 mb-5">Please enter your login and password!</p>

                            <div class="form-outline form-white mb-4">
                                <input type="text" id="username" name="username" class="form-control form-control-lg" placeholder="HereIsJohnnyWithA1911"/>
                                <label class="form-label" for="username">Username</label>
                            </div>

                            <div class="form-outline form-white mb-4">
                                <input type="password" id="password" name="password" class="form-control form-control-lg" />
                                <label class="form-label" for="password">Password</label>
                            </div>

                            <p class="small mb-5 pb-lg-2"><a class="text-white-50" href="/profile.jsp">Forgot password?</a></p>

                            <button class="btn btn-outline-light btn-lg px-5" form="loginForm" type="submit">Login</button>

                            <div class="d-flex justify-content-center text-center mt-4 pt-1">
                                <a href="#!" class="text-white"><i class="fab fa-facebook-f fa-lg"></i></a>
                                <a href="#!" class="text-white"><i class="fab fa-twitter fa-lg mx-4 px-2"></i></a>
                                <a href="#!" class="text-white"><i class="fab fa-google fa-lg"></i></a>
                            </div>

                        </form>

                        <div>
                            <p class="mb-0">Request type: <%=request.getMethod()%>
                                <%= username != null ? username : "" %> <%= password != null ? password : "" %>
                            </p>
                        </div>

                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<jsp:include page="partials/footer.jsp"/>
</body>
</html>
