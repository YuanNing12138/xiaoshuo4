<%--
  Created by IntelliJ IDEA.
  User: yuannning
  Date: 2020/8/11
  Time: 13:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<html>
<head>
    <title>Title</title>

    <style type="text/css">
        table
        {
            border-collapse: collapse;
            margin: 0 auto;
            text-align: center;
        }
        table td, table th
        {
            border: 1px solid #cad9ea;
            color: #666;
            height: 30px;
        }
        table thead th
        {
            background-color: #CCE8EB;
            width: 100px;
        }
        table tr:nth-child(odd)
        {
            background: #fff;
        }
        table tr:nth-child(even)
        {
            background: #F5FAFA;
        }
    </style>

    <script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript">


        $(function () {
            var id = getUrlParam("id");

            /*根据id查询一个的请求*/
            $.ajax({
                url:"/getOneTypes",
                data:{"id":id},
                type:"post",
                success:function (result) {
                    /* console.log(result);*/
                    /*result.XX   获取到值，我们需要将获取到的值放到对应的框中*/

                    $("#title1").val(result.typename);

                }
            })


            /*给修改中提交的按钮绑定单击函数*/
            $("#tijiao").click(function () {

                $.ajax({
                    url:"/updateTypes",
                    data:$("form").serialize()+"&id="+id,
                    type:"post",
                    success:function (result) {
                        if(result){
                            alert("修改成功");
                            window.location.href="TypesList.jsp";
                        }else{
                            alert("修改失败");
                        }
                    }
                })
            })




        })




        //获取地址栏参数,可以是中文参数
        function getUrlParam(key) {
            // 获取参数
            var url = window.location.search;
            //localhost:8080/doc?name=zhangsan&password=abc123
            // 正则筛选地址栏
            var reg = new RegExp("(^|&)" + key + "=([^&]*)(&|$)");
            // 匹配目标参数
            var result = url.substr(1).match(reg);
            //返回参数值
            return result ? decodeURIComponent(result[2]) : null;
        }



    </script>
</head>
<body>

<form>
    <%--<input type="hidden" name="id" value="${param.id}"/>--%>
    <table  width="95%" border="1" cellpadding="2" cellspacing="1" style="table-layout:fixed;">
        <tr>
            <td colspan="2" style="background-color: peru;text-align: center;">
                <h3>修改用户信息</h3>
            </td>
        </tr>

        <tr>
            <td>用户名</td>
            <td><input type="text" name="typename" id="title1"/></td>
        </tr>

        <tr>
            <td colspan="2">
                <input type="button" value="提交" id="tijiao"/>
                <input type="button" value="返回" onclick="javascript:window.history.back()"/>

            </td>
        </tr>
    </table>


</body>
</html>
