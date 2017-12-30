<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Custom login page</title>
</head>
<body>
<h3>Custom login page</h3>
<form:form action="${pageContext.request.contextPath}/authenticateUser" method="post">
    <c:if test="${param.error !=null}">
        <i>Invalid credentials</i>
    </c:if>
    <p>
        User name: <input type="text" name="username" />
    </p>

    <p>
        Password: <input type="password" name="password" />
    </p>

    <input type="submit" value="Login" />

</form:form>

</body>
</html>
