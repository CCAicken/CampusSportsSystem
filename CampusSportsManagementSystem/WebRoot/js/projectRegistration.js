$(this).ready(function(){
	$("#table").delegate(".sure", "click", function () {
		 var proid = $(this).prev().val().trim();
		$.ajax({
			url : "projectregistrantionservlet.do",
			type : "POST",
			dataType : "text",
			data : {
				proid:proid,
				op : "add"
			},
			success: function (succ) {
	        	if(succ == "报名成功"){
	        		window.wxc.xcConfirm(succ, window.wxc.xcConfirm.typeEnum.success, {
		                onOk: function (v) {
		                	window.location.reload();
		                }
		            });
	        	}else{
		            window.wxc.xcConfirm(succ, window.wxc.xcConfirm.typeEnum.error);
	        	}
	        }
		})
	});
})