<%@ page language="java" contentType="text/html; charset=utf-8"    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>登录</title>
        <script type="text/javascript" src="assets/js/p.js"></script>
        <link href="//cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
        <script type="text/javascript" src="//cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
        <script type="text/javascript" src="//cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="//cdn.bootcss.com/layer/2.3/layer.js"></script>
        
        <style type="text/css">
            .main{
                position:absolute;
                top:50%;
                left:50%;
                width:330px;
                height:200px;
                margin-top:-102px;/* 自身高度/2+2 */
                margin-left:-167px;/* 自身宽带/2+2 */
            
                /* border:1px solid #e6e6e6;*/
                line-height:30px;
                font-size:16px;
                text-align:center;
                z-index: 99999;
                background-color: rgba(255,255,255,0.4);
                border-radius: 4px;
            }
        </style>
    </head>
    <body>
        <div class="main">
            <form class="form-horizontal" method="post" action="/index" autocomplete="off" style="margin-top: 54px;" role="form">
                <div class="form-group">
                    <label for="inputID" class="col-sm-3 control-label">帐号：</label>
                    <div class="col-sm-8">
                        <input type="text" id="inputID" name="J_user" class="form-control" placeholder="帐号">
                    </div>
                </div>
                <div class="form-group">
                    <label for="inputPassword" class="col-sm-3 control-label">密码：</label>
                    <div class="col-sm-8">
                        <input type="password" id="inputPassword" class="form-control" name="J_pwd" placeholder="密码">
                    </div>
                </div>
               <div class="form-group">
                    <label class="col-sm-2 control-label"></label>
                    <div class="col-sm-8">
                        <button class="btn btn-primary">登录</button>
                        <!--<a href="javascript:void(0)" style="margin-left: 36px;" name="register">注册</a> -->
                    </div>
                </div>
            </form>
        </div>
        <div style="width:100%; position:fixed; left:0; bottom:0;text-align: center;color: #fff;">
            您的IP:{{index}}　来自于:{{region['city']}}<br>
            当前时间是<span id="dateTime">{{date('Y-m-d H:i:s')}}</span>         
        </div>

        <script type="text/javascript" src="//cdn.bootcss.com/jquery-backstretch/2.0.4/jquery.backstretch.min.js"></script>
        <script src="assets/js/jsencrypt.min.js"></script>
        <script src="assets/js/module/login.js?v=1491544524943"></script>
        <script type="text/javascript">    
            window.onload=function(){        
                $("#form").css("margin-top",function(){
                    return $(this).height()/2;
                });
                //setInterval(function(){
                //    document.getElementById("dateTime").innerText=(new Date()).format();
                //},1000);        
            }
        </script>
    </body>
</html>