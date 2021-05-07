function onSubmit(){
	var uName = $('#username').val();
	var encPass = window.btoa($('#pass').val());
	var req = {
			"username": uName,
			"encPassword": encPass
	}
	var loginCall = $.ajax({
		type: 'post',
		url: '/user/login',
		data: JSON.stringify(req),
		contentType: 'application/json'
	});
	loginCall.success(function(data, status){
		console.log(data);
		console.log(status);
		if(data == 'Admin'){
			
		} else if(data == 'Non-Admin') {
			
		} else {
			$('#error').text(data+" Try with different user");
		}
	});
}