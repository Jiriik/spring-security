<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Welcome page</title>
</head>
<body>
    <h2>Welcome</h2>
<hr />
<p>
    Hello world!

    <form:form action="${pageContext.request.contextPath}/logout" method="post">
        <input type="submit" value="Logout">
    </form:form>
</p>
</body>
</html>