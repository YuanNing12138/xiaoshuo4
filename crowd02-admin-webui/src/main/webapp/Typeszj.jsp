<<%--
  Created by IntelliJ IDEA.
  User: yuannning
  Date: 2020/8/10
  Time: 14:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>


    <script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>

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

    <script type="text/javascript">

        $(function () {
            /*获取从index.jsp页面中带过来的分类参数*/
            var categoryid= getUrlParam("categoryid");
            /* alert("categoryid:"+categoryid);*/



            $(".tijiao").click(function () {
                //分别获取用户在表单中输入的内容
                var id=$("#username1").val();
                var typename=$("#summary1").val();

                /*  alert(title);*/
                if(id==""){
                    alert("文档标题不能为空");
                }else if(typename==""){
                    alert("上传时间不能为空");
                }else{
                    /*发送ajax请求*/
                    $.ajax({
                        url:"/saveTypes",
                        data:{"categoryid":categoryid,"id":id,"typename":typename,},
                        type:"post",
                        success:function (result) {
                            if(result){
                                alert("增加成功");
                                window.location.href="TypesList.jsp";
                            }else{
                                alert("增加失败");
                            }
                        }



                    })
                }
            })



        })

        /* /!*根据地址栏获取参数*!/
         function  getUrlParam(key) {
             var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
             var r = window.location.search.substr(1).match(reg);
             if (r != null) {
                 return unescape(r[2]);
             }
             return null;
         }*/
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
    <table  width="95%" border="1" cellpadding="2" cellspacing="1" style="table-layout:fixed;" >
        <tr>
            <td colspan="2" style="background-color: peru;text-align: center;">新增电子文档</td>
        </tr>
        <tr>
            <td>编号<span style="color: red;">*</span></td>
            <td>
                <input type="text" name="id" id="title1" />
            </td>
        </tr>
        <tr>
            <td>项目</td>
            <td>
                <input type="text" name="typename" id="summary1"></textarea>
            </td>
        </tr>

        <tr>
            <td colspan="2" style="text-align: center;">
                <input type="button" value="提交" class="tijiao" />
                <input type="button" value="返回" onclick="window.history.back()" />

            </td>

        </tr>


    </table>


</form>

</body>
</html>
