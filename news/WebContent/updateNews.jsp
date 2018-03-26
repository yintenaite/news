<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
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
			<div class="content clearfix" style="margin-top:30px;" ng-controller="updateNewsCtrl">
				<!-- 这里是内容 -->
			<div>
            <form class="form-inline">
                <input type="input" class="form-control" id="productname" style="width:82%;font-size: 18px;font-weight: 700;" placeholder="文章标题" ng-model="title">
              	<div class="form-group">
                <label for="producttittle" style="color: #999;opacity: 1;">&nbsp;&nbsp;文章类型：</label>
               <select ng-options="a.navName  for a in nav" ng-model="categroy" id="producttittle" style="height:32px;;width:80px;border: 1px solid #ccc;border-radius: 4px;box-shadow: 0 1px 1px rgba(0, 0, 0, 0.075) inset;">
               </select>
               </select>
              </div>
              </form>
          </div>

<!--style给定宽度可以影响编辑器的最终宽度-->
<script type="text/plain" id="myEditor" style="width:1000px;height:240px;">
</script>
<div class="clear"></div>
<div id="btns" style="margin-top:5px;margin-bottom:20px;">
	<div style="float:right;">
				<button class="btn" style="width:100px;background-color:#ed4040;color:#FFF;"ng-click="submit()">提交</button>
                <button class="btn" style="background-color:#e0e0e0;color:#FFF;">取消</button>
    </div>          
</div>
<script type="text/javascript">
	var um;
	if(um) {
		um.destroy();
	}
	 um = UM.getEditor('myEditor');
</script>
				<!-- 内容结束 -->
			</div>
		</div>
