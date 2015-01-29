console.log('-----rightside-----');
var member;

$.getJSON('/withjam6/json/auth/loginUser.do', function(data) {
	if (data.status == 'fail') {
//		$('#loginBtn').css('display', '');

	} else {
		$('#logoutBtn').css('display', '');

		/*
		 * if (data.photo) { $('#userPhoto').attr('src', data.loginUser.photo); }
		 */
		member = data.loginUser;
		console.log(member);

		$.getJSON('../json/friend/list.do?uid=' + member.uid, function(data) {
			var friends = data.firends;

			require([ 'text!templates/friend-list.html' ], function(html) {
				var template = Handlebars.compile(html);
				$('.page1').html(template(data));
			});
		});

	}
});

$(document).on('mouseenter', '.data-row', function() {
	// loadProduct($(this).attr('data-no'));
	console.log($(this).attr('data-uid'));

	$.getJSON('../json/friend/friendDetail.do?uid=' + $(this).attr('data-uid'), function(data) {

		require([ 'text!templates/friend-detail.html' ], function(html) {
			var template = Handlebars.compile(html);
			$('.page2').html(template(data));
		});
	});
});


//$('#selectR4').click(function(){
//	
//	$.getJSON('/withjam6/json/friend/recomendFriendList.do', function(data) {
//		if (data.status == 'fail') {
//			console.log('recomendFriendList to fail..');
//
//		} else {
//			/*
//			 * if (data.photo) { $('#userPhoto').attr('src', data.loginUser.photo); }
//			 */
//			member = data.loginUser;
//			console.log(member);
//
//			$.getJSON('../json/friend/list.do?uid=' + member.uid, function(data) {
//
//				require([ 'text!templates/friend-list.html' ], function(html) {
//					var template = Handlebars.compile(html);
//					$('.page1').html(template(data));
//				});
//			});
//
//		}
//	});
//	
//});


// $('.td-email').click(function(){
// console.log(this.arrt('data-uid'));
// console.log('test');
// });
