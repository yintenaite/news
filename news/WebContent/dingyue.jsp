<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
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
			<div class="content" style="width:1000px;" ng-controller="dingyue">
				<ul  style="width:1400px;;display: inline-block;" class="list-inline">
					<!-- <li>
						<img ng-src="aa" width="60px" height="60px;" style="border-radius:15px;">
					</li> -->
					<li ng-repeat="m in dingyuemessage" class="clearfix" style="list-style-type: none; padding-left: 30px;margin-left:16px;border-right: 1px dotted #e5e5e5;border-left: 1px dotted #e5e5e5; margin-right: 42px;display: inline-block;height: 80px;overflow: hidden;padding: 24px 0;position: relative;    width: 340px;   padding-right: 41px;padding-left:10px;">
						<div style=" float: left; height: 70px;  margin-right: 10px;  width: 40px;">
						<a href="#">
						<img ng-src="{{m.userImgUrl}}" width="65px" height="65px;" style="border-radius: 20px;  height: 40px;  width: 40px;">
						</a>
						</div>
						<div style="float: left;  width: 180px;">
						<p style="color: #4f5157;    font-size: 18px;    overflow-x: hidden;    text-overflow: ellipsis;    white-space: nowrap;">
						<a href="#/author/message/{{m.authorId}}" style="color:#000;" ng-bind="m.userName"></a>
						</p>
						<p style="color: #6b6b6b;font-size: 12px;overflow: hidden;text-overflow: ellipsis;white-space: nowrap; width: 140px;" ng-bind="m.authorAbstract">
						</p>
						</div>
						<div style="margin-top:10px;"><a href="javascript:;" ng-click="quxiaodingyue(m.authorId)">取消订阅</a></div>
					</li>
					
				</ul>
			</div>