<%--
  Created by IntelliJ IDEA.
  User: 12784
  Date: 2020/8/10
  Time: 14:42
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

    <script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $(".tijiao").click(function (){
                var name = $("#name1").val();
                var createtime = $("#createtime1").val();
                if(name==""){
                    alert("图书名称不能为空");
                }else if(createtime==""){
                    alert("上传时间不能为空");
                }else{
                    $.ajax({
                        url:"/addBook",
                        data:$("form").serialize(),
                        type:"post",
                        success:function (result) {
                            if(result){
                                alert("增加成功");
                                window.location.href="XiaoshuoGuanLi.jsp";
                            }else{
                                alert("增加失败");
                            }
                        }

                    })
                }
            })

        })


    </script>
</head>
</head>
<body>
<form>
    <table border="1">
        <tr>
            <td colspan="2" style="background-color: #c53ecd;text-align: center;">增加小说</td>
        </tr>
        <tr>
            <td>书名<span style="color: red;">*</span></td>
            <td>
                <input type="text" name="name" id="name1" />
            </td>
        </tr>
        <tr>
            <td>作者<span style="color: red;">*</span></td>
            <td>
                <input type="text" name="auther" id="auther1">
            </td>
        </tr>
        <tr>
            <td>类型<span style="color: red;">*</span></td>
            <td>
                <input type="text" name="typeid"  id="typeid1"/>
            </td>
        </tr>
        <tr>
            <td>上传时间<span style="color: red;">*</span></td>
            <td>
                <input type="date" name="createtime" id="createtime1" />(yyyy-MM-dd)
            </td>
        </tr>
        <tr>
            <td>图片</td>
            <td>
                <input type="file" name="image" id="image1">
            </td>
        </tr>
        <tr>
            <td>vip</td>
            <td>
                <input type="text" name="vip" id="vip1">
            </td>
        </tr>
        <tr>
            <td colspan="2" style="text-align: center;">
                <input type="button" value="提交" class="tijiao" />
                <input type="button" value="返回" onclick="window.location.href='XiaoshuoGuanLi.jsp'" />
            </td>
        </tr>
    </table>
</form>
</body>
</body>
</html>
