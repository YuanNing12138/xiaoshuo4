<%--
  Created by IntelliJ IDEA.
  User: 12784
  Date: 2020/8/9
  Time: 18:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>黎桐园后台管理系统</title>
    <link rel="stylesheet" href="layui/css/layui.css">
    <link rel="stylesheet" href="css/home.css">
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <div class="layui-header" style="background-color: #20222A">
        <div class="layui-logo"
             style="background-color: #393D49;color: white;height: 210px;border-bottom: 1px solid white">
            <div style="background-color: #393D49;color: #009E94;font-weight: bolder">黎桐园后台管理系统</div>
            <a href="#" id="tip" onmouseenter="tip()">
                <img id="userImg"  src="img/admin.jpg"
                     style="width: 90px;height: 90px" class="layui-nav-img">
            </a>
            <div style="font-size: 10px;text-align: center;height: 15px;margin-bottom: 8px;padding-right: 6px">
                咸鱼
            </div>
            <div style="font-size: 10px;padding-right: 10px">
                老师您好，欢迎登录
            </div>
        </div>
        <!-- 头部区域（可配合layui已有的水平导航） -->
        <ul class="layui-nav layui-layout-left">

            <li class="layui-nav-item">
                <div id="scrollWrap" style="float: left">
                    <ul id="scrollMsg">
                        <li><a class="scrollText" href="http://www.baidu.com"><i
                                class="layui-icon layui-icon-speaker"></i>让黎桐园信成为企业软件的标杆</a>
                        </li>
                        <li><a class="scrollText" href="http://www.baidu.com"><i
                                class="layui-icon layui-icon-speaker"></i>黎桐园文库</a>
                        </li>
                    </ul>
                </div>
                <div id="time"></div>
            </li>
        </ul>
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item"><a href="" id="refresh">
                <i class="layui-icon layui-icon-refresh"></i></a>
            </li>

            <li class="layui-nav-item">
                <a href="javascript:;">
                    <img src="img/admin.jpg" class="layui-nav-img">
                    <span>黎桐园</span>
                </a>
                <dl class="layui-nav-child">
                    <dd><a href="#" data-id="0" class="site-demo-active"><i class="layui-icon layui-icon-user"></i> 基本资料</a>
                    </dd>
                    <dd><a href="#" data-url="#" data-id="9" data-title="修改密码" class="site-demo-active"><i
                            class="layui-icon layui-icon-set"></i> 修改密码</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item"><a href="login.html" onclick="clearCookie()" id="logout"><i
                    class="layui-icon layui-icon-logout"></i>退出</a></li>
        </ul>
    </div>

    <div class="layui-side layui-bg-black" style="padding-top: 150px">
        <div class="layui-side-scroll">
            <ul class="layui-nav layui-nav-tree" lay-filter="test">
                <li class="layui-nav-item" id="userManage" style="text-align: center">
                    <a href="#"  data-url="UserList.jsp" data-id="1" data-title="用户管理" class="site-demo-active"
                       data-type="tabAdd">
                        <i class="layui-icon layui-icon-username"></i>用户管理
                    </a>
                </li>
                <li class="layui-nav-item" id="class" style="text-align: center">
                    <a href="#" data-url="XiaoshuoGuanLi.jsp"  data-id="2" data-title="小说管理" class="site-demo-active"
                       data-type="tabAdd">
                        <i class="layui-icon layui-icon-read"></i> 小说管理
                    </a>
                </li>
                <li class="layui-nav-item" id="student" style="text-align: center">
                    <a href="#" data-url="TypesList.jsp" data-id="3" data-title="类型管理" class="site-demo-active"
                       data-type="tabAdd">
                        <i class="layui-icon layui-icon-user"></i>类型管理
                    </a>
                </li>
                <li class="layui-nav-item" id="course" style="text-align: center">
                    <a href="#" data-url="PiList.jsp" data-id="4" data-title="评论管理" class="site-demo-active"
                       data-type="tabAdd">
                        <i class="layui-icon layui-icon-read"></i>评论管理
                    </a>
                </li>

            </ul>
        </div>
    </div>

    <div class="layui-body"
         style="background: url(img/bodyBg.jpg) no-repeat ;background-size: 100% 100%    ">
        <!-- 内容主体区域 -->
        <div class="layui-tab layui-tab-card" lay-filter="demo" lay-allowclose="true" style="">
            <ul class="layui-tab-title" style="background-color: rgba(255,255,255,0.1)">
                <li class="layui-this" lay-id="0"><i style="font-size: smaller"
                                                     class="layui-icon layui-icon-circle-dot"></i>首页
                </li>
            </ul>
            <div class="layui-tab-content" style="height:400px">
                <div class="layui-tab-item layui-show">

                </div>
            </div>
        </div>
    </div>

    <div class="layui-footer">
        <!-- 底部固定区域 -->
        <div style="text-align: center">
            © 欢迎交流讨论
        </div>
    </div>
</div>
<script src="js/jquery-3.3.1.js"></script>
<script src="layui/layui.js"></script>
<script src="js/home.js"></script>
</body>
</html>
