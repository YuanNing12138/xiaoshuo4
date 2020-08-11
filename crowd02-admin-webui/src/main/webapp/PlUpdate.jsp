<%--
  Created by IntelliJ IDEA.
  User: yuannning
  Date: 2020/8/11
  Time: 14:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <script type="text/javascript" src="WEB-INF/js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript">
        $(function () {

            var id =getUrlParam("id");
            $.ajax({
                url:"/getone",
                data:{"id":id},
                type:"post",
                success:function (retule) {
                    $("#content1").val(retule.content);
                }


            })

            $(".xiugai").click(function () {

                $.ajax({
                    url:"/updataPl",
                    data:$("form").serialize()+"&id="+id,
                    type:"post",
                    success:function (retule) {
                        if (retule){
                            alert("修改成功")
                            window.location.href="pl.jsp";

                        }else {
                            alert("修改失败")
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
    <table border="1">
        <tr>
            <td colspan="2" style="background-color: peru;text-align: center;">修改评论</td>
        </tr>
        <tr>
            <td>评论<span style="color: red;">*</span></td>
            <td>
                <input type="text" name="content" id="content1" />
            </td>
        </tr>

        <tr>
            <td colspan="2" style="text-align: center;">
                <input type="button" value="修改" class="xiugai" />
                <input type="button" value="返回" onclick="window.location.href='PiList.jsp'" />
            </td>
        </tr>
    </table>
</form>
</body>
</html>
