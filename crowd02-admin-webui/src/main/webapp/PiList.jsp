<%--
  Created by IntelliJ IDEA.
  User: yuannning
  Date: 2020/8/11
  Time: 14:52
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
            var xiaoshuoid= $("#name1").val();
            $.ajax({
                url:"/selectByxiaoshuoid",
                data:{"xiaoshuoid":xiaoshuoid},
                type:"post",
                success:function (result) {
                    var str="";
                    $(result).each(function () {
                        str+="<tr>" +
                            "<td>"+this.id+"</td>"+
                            "<td>"+this.xiaoshuoid+"</td>" +
                            "<td>"+this.userid+"</td>" +
                            "<td>"+this.content+"</td>" +
                            "<td>"+this.cteatetime+"</td>" +
                            "<td>"+

                            "<span onclick='del("+this.id+",this)'>删除</span>"
                            +"</td>" +
                            "</tr>"
                    })
                    $("#chaxun").empty().append(str);
                }
            })
            $(".chaxun").click(function () {
                var xiaoshuoid= $("#name1").val();
                alert(xiaoshuoid)
                $.ajax({
                    url:"/selectByxiaoshuoid",
                    data:{"xiaoshuoid":xiaoshuoid},
                    type:"post",
                    success:function (result) {
                        var str="";
                        $(result).each(function () {
                            str+="<tr>" +
                                "<td>"+this.id+"</td>"+
                                "<td>"+this.xiaoshuoid+"</td>" +
                                "<td>"+this.userid+"</td>" +
                                "<td>"+this.content+"</td>" +
                                "<td>"+this.cteatetime+"</td>" +
                                "<td>"+

                                "<span onclick='del("+this.id+",this)'>删除</span>"
                                +"</td>" +
                                "</tr>"
                        })
                        $("#chaxun").empty().append(str);
                    }
                })

            })
            $("#xinzeng").click(function () {
                window.location.href="PlAdd.jsp"
            })
        })

        $(function () {
            var userid= $("#name2").val();
            $.ajax({
                url:"/selectByuserid",
                data:{"userid":userid},
                type:"post",
                success:function (result) {
                    var str="";
                    $(result).each(function () {
                        str+="<tr>" +
                            "<td>"+this.id+"</td>"+
                            "<td>"+this.xiaoshuoid+"</td>" +
                            "<td>"+this.userid+"</td>" +
                            "<td>"+this.content+"</td>" +
                            "<td>"+this.cteatetime+"</td>" +
                            "<td>"+
                            "<span onclick=\"window.location.href='PlUpdate.jsp?id="+this.id+"'\">修改</span>"+
                            "<span onclick='del("+this.id+",this)'>删除</span>"
                            +"</td>" +
                            "</tr>"
                    })
                    $("#chaxun").empty().append(str);
                }
            })
            $(".chaxun2").click(function () {
                var userid= $("#name2").val();
                alert(userid)
                $.ajax({
                    url:"/selectByuserid",
                    data:{"userid":userid},
                    type:"post",
                    success:function (result) {
                        var str="";
                        $(result).each(function () {
                            str+="<tr>" +
                                "<td>"+this.id+"</td>"+
                                "<td>"+this.xiaoshuoid+"</td>" +
                                "<td>"+this.userid+"</td>" +
                                "<td>"+this.content+"</td>" +
                                "<td>"+this.cteatetime+"</td>" +
                                "<td>"+
                                "<span onclick=\"window.location.href='PlUpdate.jsp?id="+this.id+"'\">修改</span>"+
                                "<span onclick='del("+this.id+",this)'>删除</span>"
                                +"</td>" +
                                "</tr>"
                        })
                        $("#chaxun").empty().append(str);
                    }
                })

            })
            $("#xinzeng").click(function () {
                window.location.href="PlAdd.jsp"
            })
        })



        function del(id,obj) {
            if(confirm("确实要删除么？")){

                $.ajax({
                    url:"/delete",
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
            $("#xinzeng").click(function () {
                window.location.href="PlAdd.jsp"
            })

        }

    </script>

</head>
<body>

<div>
    <input type="text" id="name1" name="name"><input type="button" value="书id" class="chaxun"> <br>
    <input type="text" id="name2" name="name"> <input type="submit" value="用户id" class="chaxun2">

    <table width="95%" border="1" cellpadding="2" cellspacing="1" style="table-layout:fixed;">
        <head>
            <tr>
                <td align="center" colspan="6">
                    用户评论
                </td>
            </tr>
            <tr>
                <td>id</td>
                <td>小说id</td>
                <td>评论人id</td>
                <td>评论内容</td>
                <td>评论时间</td>
                <td colspan="1">操作

            </tr>
        </head>
        <tbody id="chaxun"></tbody>



    </table>


</div>

</body>
</html>