<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <div ng-controller="usermessage">
<div style="width:1000px;">
	<div class="user-bar"style="height:30px; background:#f5f6f7;border-radius:4px;">
				<div class="col-xs-2">
				<h5 class="text-center" style="margin-top:8px;color: #fa9700;"><a href="#/user/newsshow">个人主页</a></h5>
				</div>
				<div class="col-xs-2">
				<h5 class="text-center" style="margin-top:8px;color: #fa9700;"><a href="#/user/addnews">发表文章</a></h5>
				</div>
				<div class="col-xs-2">
				<h5 class="text-center" style="margin-top:8px;color: #fa9700;"><a href="#/user/authormessage">账号信息</a></h5>
				</div>
			</div>
			<div class="content clearfix" style="margin-top:30px;">
				<div class="content" >
			<div class="col-sm-6" style="margin-left:-25px;">
				<table class="table" style="margin-top:10px;width:500px;margin-left:80px;">							
							<tbody>
								<tr>
									<td>用户昵称：</td>
									<td ng-bind="usermsg.userName"></td>
								</tr>
								<tr>
									<td>登陆名：</td>
									<td ng-bind="usermsg.userLoginName"></td>
								</tr>
								<tr>
									<td>简介：</td>
									<td ng-bind="jianjie"></td>
								</tr>
								<tr>
									<td>注册时间：</td>
									<td ng-bind="usermsg.userCreatetime|date:'yyyy-MM-dd'">2016-03-07</td>
								</tr>
								<tr>
									<td></td>
									<td>
										<button  data-toggle="modal" data-target="#modal-jianjie" type="button" class="btn" style="margin-top:7px;background-color:#ed4040;color:#FFF;width:150px;float:right;">修改简介</button>
									</td>
								</tr>
							</tbody>
						</table></div>
						<div class="col-sm-2" style=""><img  ng-src="{{usermsg.userImgUrl}}" style="width:170px;height:120px;margin-left:70px;margin-top:10px;"class="img-thumbnail">
						</div>
			</div>
			</div>
		</div>
			<!-- 登录框 开始 -->
<div class="modal " id="modal-jianjie" tabindex="-1" role="dialog" aria-labelledby="modal-jianjie-dialog">
  <div class="modal-dialog" role="document" style="width:550px">
  	<form ng-submit="updatejianjie(content)" method="post" name="jianjieform">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="modal-login-dialog">简介</h4>
      </div>
      <div class="modal-body">
        <!-- 主体 -->
		<div class="form-group row">
				<div class="col-sm-4">
				<textarea ng-model="content" required id="content" class="form-control" style="width: 516px; height: 105px;resize:none;outline:none;"></textarea>
				</div>
			</div>
		
        <!-- 主体结束-->
      </div>      
      <div class="modal-footer" style="text-align: center;">
    	<button type="submit" class="btn " style="width:150px; background: #ed4040;color:#fff;" ng-disabled="jianjieform.$invalid">提交</button>
      </div>
    </div></form>
  </div>
</div>

<!-- 登录框 结束 --></div>
