<%--
  Created by IntelliJ IDEA.
  User: Baconm145
  Date: 31.10.2018
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello from Spring!</title>
</head>
<body>
    <form>
        <h3>add user</h3>
        <input type="text" name="adduser_id" value="id">
        <br>
        <input type="text" name="adduser_password" value="new password">
        <br>
        <button>add user</button>
    </form>

    <form>
        <h3>delete user</h3>
        <input type="text" name="deluser_id" value="id">
        <br>
        <button>delete user</button>
    </form>

    <form>
        <h3>show user</h3>
        <input type="text" name="showuser_id" value="id">
        <br>
        <button>show user</button>
    </form>

    <form>
        <h3>add order</h3>
        <input type="text" name="addorder_id" value="id">
        <br>
        <button>add order</button>
    </form>

    <form>
        <h3>delete user</h3>
        <input type="text" name="delorder_id" value="id">
        <br>
        <button>delete order</button>
    </form>

    <form>
        <h3>show user</h3>
        <input type="text" name="showorder_id" value="id">
        <br>
        <button>show order</button>
    </form>

    <form>
        <h3>update password</h3>
        <input type="text" name="updpassword_id" value="id">
        <br>
        <input type="text" name="updpassword_password" value="new password">
        <br>
        <button>update password</button>
    </form>

</body>
</html>
