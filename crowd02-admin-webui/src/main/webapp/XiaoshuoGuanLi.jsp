
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <link rel="stylesheet" href="bootstrap.min.css" type="text/css">
    <script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
            var name= $("#name1").val();
            $.ajax({
                url:"/getBookByname",
                data:{"name":name},
                type:"post",
                success:function (result) {
                    var str="";
                    $(result).each(function () {
                        str+="<tr>" +
                            "<td>"+this.id+"</td>" +
                            "<td>"+this.name+"</td>" +
                            "<td>"+this.auther+"</td>" +
                            "<td>"+this.typeid+"</td>" +
                            "<td>"+this.createtime+"</td>" +
                            "<td>"+  "<img src="+this.image+"> + </td>" +
                            "<td>"+this.vip+"</td>" +
                            "<td>"+
                            "<span onclick=\"window.location.href='updata.jsp?id="+this.id+"'\">修改</span>"+
                            "<span onclick='del("+this.id+",this)'>删除</span>"
                            +"</td>" +
                            "</tr>"
                    })
                    $("#chaxun").empty().append(str);
                }
            })
            $(".chaxun").click(function () {
                var name= $("#name1").val();
                alert(name)
                $.ajax({
                    url:"/getBookByname",
                    data:{"name":name},
                    type:"post",
                    success:function (result) {
                        var str="";
                        $(result).each(function () {
                            str+="<tr>" +
                                "<td>"+this.id+"</td>" +
                                "<td>"+this.name+"</td>" +
                                "<td>"+this.auther+"</td>" +
                                "<td>"+this.typeid+"</td>" +
                                "<td>"+this.createtime+"</td>" +
                                "<td>"+this.image+"</td>" +
                                "<td>"+this.vip+"</td>" +
                                "<td>"+
                                "<span onclick=\"window.location.href='updata.jsp?id="+this.id+"'\">修改</span>"+
                                "<span onclick='del("+this.id+",this)'>删除</span>"
                                +"</td>" +
                                "</tr>"
                        })
                        $("#chaxun").empty().append(str);
                    }
                })

            })
            $("#xinzeng").click(function () {
                window.location.href="Xiaoshuoadd.jsp"
            })
        })
        function del(id,obj) {
            if(confirm("确实要删除么？")){
                $.ajax({
                    url:"/deleteB",
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
        <td><button id="xinzeng">新增小说</button></td>
    </tr>
    <table border="1">
        <head>
            <tr>
                <td  colspan="8" style="background-color: #43cd36;text-align: center;">
                    小说详细信息列表
                </td>
            </tr>
            <tr>
                <td>作者id</td>
                <td>书名</td>
                <td>作者</td>
                <td>类型</td>
                <td>时间</td>
                <td>图片</td>
                <td>vip</td>
                <td>操作</td>
            </tr>
        </head>
        <tbody id="chaxun"></tbody>

    </table>

</div>




</body>
</html>
