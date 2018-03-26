<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <div  ng-controller="usermessage">
<div class="user-bar"style="height:30px; background:#f5f6f7;border-radius:4px;">
				<div class="col-md-2">
				<a href="#/user/shoucang"><h5 class="text-center" style="margin-top:8px;">收 藏</h5></a>
				</div>
				<div class="col-md-2">
				<a href="#/user/dingyue"><h5 class="text-center" style="margin-top:8px;">订 阅</h5></a>
				</div>
				<div class="col-md-2">
				<a href="#/user/usermessage"><h5 class="text-center" style="margin-top:8px;">个人信息</h5></a>
				</div>
			</div>
			<div class="content">
			<div class="col-sm-6" style="margin-left:-590px;">
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
									<td>注册时间：</td>
									<td ng-bind="usermsg.userCreatetime|date:'yyyy-MM-dd'">2016-03-07</td>
								</tr>
								<tr>
									<td></td>
									<td>
										<button data-toggle="modal" data-target="#modal-password" type="button" class="btn" style="margin-top:7px;background-color:#ed4040;color:#FFF;width:150px;float:right;">修改密码</button>  
										</td>
								</tr>
							</tbody>
						</table></div>
						<div class="col-sm-2" style=""><img ng-src="{{usermsg.userImgUrl}}" style="width:170px;height:120px;margin-left:70px;margin-top:10px;margin-bottom:0px;"class="img-thumbnail">
						<button data-toggle="modal" data-target="#modal-img"  type="button" class="btn" style="width:160px;margin-left:70px;margin-top:7px;background-color:#ed4040;color:#FFF;">更换头像</button>
			
						</div>
						</div>
			<!-- 注册框 开始-->
<div class="modal " id="modal-img" tabindex="-1" role="dialog">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="modal-register-dialog">修改头像</h4>
      </div>
      <form  class="form-horizonal"   name="imgform" >
      <div class="modal-body">
        <!-- 注册主体 -->		
			<div class="form-group  row">
				<label for="userimg" class="text-right col-sm-2"  style="margin-top:1%;">用户头像</label>
				<div class="col-sm-5">
					<input type="file" required style="box-shadow:none;border:0px;" nv-file-select uploader="uploader"/><br/>
				</div>
				<br><br>
			</div>
			<div class="form-group  row">
				<ul style="list-style:none;margin-right:102px;margin-left:78px;">
		            <li ng-repeat="item in uploader.queue">
		           	    <label  class="text-right col-sm-2"  style="margin-top:1%;width:110px;margin-left:-130px;">头像预览</label>
		                <div  ng-show="uploader.isHTML5" ng-thumb="{ file: item._file, height: 100 }" style="margin-left:10px;"></div>
		            </li>
		        </ul>
		     </div>
		
        <!-- 注册主体结束-->
      </div>
      <div class="modal-footer">
        <button type="submit" ng-disabled="imgform.$invalid" class="btn" style=" background: #ed4040;color:#fff;" ng-click="submitpic()">提交</button>
      </div>
      </form>
    </div>
  </div>
</div>
<!-- 注册框 结束-->
			
			<!-- 登录框 开始 -->
<div class="modal " id="modal-password" tabindex="-1" role="dialog" aria-labelledby="modal-password-dialog">
  <div class="modal-dialog" role="document" style="width:550px">
  	<form ng-submit="updatepassword(password)" method="post" name="passwordform">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="modal-login-dialog">修改密码</h4>
      </div>
      <div class="modal-body">
        <!-- 主体 -->
		<div class="form-group row">
				<label for="register-password" class="text-right col-sm-3" style="margin-top:1%;" >新密码</label>
				<div class="col-sm-4">
					<input type="password" required id="register-password" ng-pattern="/^[^\s]{6,16}$/" ng-minlength="6" ng-maxlength="16" name="registerpassword"  ng-model="password" class="form-control  input-sm">
				</div>
				<div class="col-sm-4 font-red input-tip"ng-show="passwordform.registerpassword.$dirty&&passwordform.registerpassword.$invalid"><label class="control-label"><label  class="control-label"  style="margin-top:5px;">*至少6位并不包含空格</label></div>
			</div>
		<div class="form-group  row">
				<label for="check-password" class="text-right col-sm-3"  style="margin-top:1%;">确认密码</label>
				<div class="col-sm-4">
					<input type="password" ng-pattern="/^[^\s]{6,16}$/" required class="form-control  input-sm" name="checkpassword" id="check-password" ng-model="checkpwd">
				</div>
				<div class="col-sm-4 font-red input-tip" ng-show="passwordform.checkpassword.$dirty&&checkpassword()"><label  class="control-label" style="margin-top:5px;">*与第一次密码输入一致</label></div>
		</div>
        <!-- 主体结束-->
      </div>      
      <div class="modal-footer" style="text-align: center;">
    	<button type="submit" class="btn " style="width:150px; background: #ed4040;color:#fff;" ng-disabled="passwordform.$invalid">提交</button>
      </div>
    </div></form>
  </div>
</div>
</div>
<!-- 登录框 结束 -->