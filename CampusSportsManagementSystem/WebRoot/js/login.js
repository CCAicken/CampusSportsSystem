$(document).ready(function () {
	$("#btnSubmit").click(function(){
		var userName = $("#").val();
		var pwd = request.getParameter("pwd");
		var captcha = $("#captcha").val();
		var usertype = $('input:radio:checked').val();
		if(userName == ""){
			window.wxc.xcConfirm("用户名不能为空", window.wxc.xcConfirm.typeEnum.error)
		}else if(pwd == ""){
			window.wxc.xcConfirm("密码不能为空", window.wxc.xcConfirm.typeEnum.error)
		}else if(captcha == ""){
			window.wxc.xcConfirm("验证码不能为空", window.wxc.xcConfirm.typeEnum.error)
		}else if(captcha == ""){
			window.wxc.xcConfirm("验证码不正确", window.wxc.xcConfirm.typeEnum.error)
		}else{
			$.ajax({
                type: 'Post',
                url: 'login.do',
                data: {
                	userName: userName,
                	pwd: pwd,
                	usertype: usertype,
                    op: "login"
                },
                dataType: 'text',
                success: function (succ) {
                    if (succ === "登录失败") {
                        window.wxc.xcConfirm(succ, window.wxc.xcConfirm.typeEnum.error, {
                            onOk: function (v) {
                                window.location.reload();
                            }
                        });
                    }
                }
            });
		}
	})
})