<%--
  Created by IntelliJ IDEA.
  User: yuannning
  Date: 2020/8/11
  Time: 13:45
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
            var typename= $("#name1").val();
            $.ajax({
                url:"/getTypeByName",
                data:{"typename":typename},
                type:"post",
                success:function (result) {
                    var str="";
                    $(result).each(function () {
                        str+="<tr>" +
                            "<td>"+this.id+"</td>" +
                            "<td>"+this.typename+"</td>" +


                            "<td>"+
                            "<span onclick=\"window.location.href='TypeXg.jsp?id="+this.id+"'\">修改</span>"+
                            "<span onclick='del("+this.id+",this)'>删除</span>"
                            +"</td>" +
                            "</tr>"
                    })
                    $("#chaxun").empty().append(str);
                }

            })
            $(".chaxun").click(function () {
                var typename= $("#name1").val();
                alert(typename)
                $.ajax({
                    url:"/getTypeByName",
                    data:{"typename":typename},
                    type:"post",
                    success:function (result) {
                        var str="";
                        $(result).each(function () {
                            str+="<tr>" +
                                "<td>"+this.id+"</td>" +
                                "<td>"+this.typename+"</td>" +


                                "<td>"+
                                "<span onclick=\"window.location.href='UserUpdata.jsp?id="+this.id+"'\">修改</span>"+
                                "<span onclick='del("+this.id+",this)'>删除</span>"
                                +"</td>" +
                                "</tr>"
                        })
                        $("#chaxun").empty().append(str);
                    }
                })

            })
            $("#xinzeng").click(function () {
                window.location.href="TypeXg.jsp"
            })
        })
        function del(id,obj) {
            if(confirm("确实要删除么？")){

                $.ajax({
                    url:"/delTypes",
                    data:{"id":id},
                    success:function (result) {
                        if(result){
                            alert("删除成功");
                            $(obj).parents("tr").remove();
                        }else{
                            alert("删除失败");
                        }
                    }
                })
            }
        }
    </script>

</head>
<body>

<div>
    <input type="text" name="name" id="name1">
    <input type="button" value="查询" class="chaxun">
    <tr>
        <td><button id="xinzeng">新增用户</button></td>
    </tr>
    <table width="95%" border="1" cellpadding="2" cellspacing="1" style="table-layout:fixed;">
        <head>
            <tr>
                <td  colspan="3" style="background-color: #43cd36;text-align: center;">
                    用户管理
                </td>
            </tr>
            <tr>
                <td>类型编号</td>
                <td>类型</td>
<td>操作</td>

            </tr>
        </head>
        <tbody id="chaxun"></tbody>

    </table>

</div>




</body>
</html>
