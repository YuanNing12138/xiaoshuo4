<%--
  Created by IntelliJ IDEA.
  User: yuannning
  Date: 2020/8/11
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
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
                var content = $("#content1").val();

                if(content==""){
                    alert("pl称不能为空");
                }else{
                    $.ajax({
                        url:"/addPl",
                        data:$("form").serialize(),
                        type:"post",
                        success:function (result) {
                            if(result){
                                alert("增加成功");
                                window.location.href="PiList.jsp";
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
<body>
<form>
    <table border="1">
        <tr>
            <td colspan="2" style="background-color: peru;text-align: center;">增加pl</td>
        </tr>
        <tr>
            <td>评论<span style="color: red;">*</span></td>
            <td>
                <input type="text" name="content" id="content1" />
            </td>
        </tr>

        <tr>
            <td colspan="2" style="text-align: center;">
                <input type="button" value="提交" class="tijiao" />
                <input type="button" value="返回" onclick="window.location.href='PiList.jsp'" />
            </td>
        </tr>
    </table>
</form>
</body>
</html>
