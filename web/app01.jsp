<%--
  Created by IntelliJ IDEA.
  User: qy
  Date: 2018/3/26
  Time: 19:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>SpringMVC注册员工信息</title>
    <link rel="stylesheet" href="../themes/icon.css" type="text/css"></link>
    <link rel="stylesheet" href="../themes/default/easyui.css" type="text/css"></link>

    <!-- 引入外部JS文件 -->
    <script type="text/javascript" src="../js/jquery.min.js"></script>
    <script type="text/javascript" src="../js/jquery.easyui.min.js"></script>

  </head>
  <body>
    <form action="${pageContext.request.contextPath}/add.action" method="post">
      <table border="4" align="center">
      <tr>
        <th>员工姓名</th>
        <td>
          <input type="text" name="name"/>
        </td>
      </tr>
      <tr>
        <th>员工薪水</th>
        <td>
          <select  name="salary" style="width: 100px">
            <option>100</option>
            <option>200</option>
            <option>300</option>
            <option>400</option>
          </select>
        </td>
      </tr>
      <tr>
        <td align="center">
          <input type="submit" value="提交">
        </td>
      </tr>
      </table>
    </form>


  </body>
</html>
