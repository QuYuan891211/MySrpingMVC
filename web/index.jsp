<%--
  Created by IntelliJ IDEA.
  User: qy
  Date: 2018/4/4
  Time: 19:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>从Oracle数据库中得到员工信息</title>
    <link rel="stylesheet" href="themes/icon.css" type="text/css"></link>
    <link rel="stylesheet" href="themes/default/easyui.css" type="text/css"></link>

    <!-- 引入外部JS文件 -->
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/jquery.easyui.min.js"></script>
</head>
<body>

<table id="dg"></table>


<script type="text/javascript">
    $("#dg").datagrid({
        url:"${pageContext.request.contextPath}/emp/findAll.action",
        columns:[[
            {field:'empno',title:'编号',width:100},
            {field:'ename',title:'姓名',width:100},
            {field:'job',title:'职位',width:100},
            {field:'mgr',title:'上级编号',width:100},

            {field:'hiredate',title:'入职时间',width:100,
                formatter:function(value){
                    var date = new Date(value);
                    var year = date.getFullYear();
                    var month = date.getMonth()+1;
                    var date = date.getDate();
                    return year+"年"+month+"月"+date+"日";
                }
            },

            {field:'sal',title:'薪水',width:100},

            {field:'comm',title:'佣金',width:100,
                formatter:function(value){
                    if(value == null){
                        return 0;
                    }else{
                        return value;
                    }
                }
            },

            {field:'deptno',title:'部门编号',width:100}
        ]],
        singleSelect:true,
        pagination:true
        }

    );
</script>

</body>
</html>
