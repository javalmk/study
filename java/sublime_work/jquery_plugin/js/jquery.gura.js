// jquery 플러그인 만들기

(function($){
	//jquery 추가 동작 정의하기
	$.fn.gura=function(options){
		//기본 설정값 정의
		var settings=$.extend({
			msg:"안녕! 나는 구라야 ~",
			textColor:"#000",
			bgColor:"#cecece"
		}, options);

		// this 는 선택된 jquery object 이다. 
		this
		.text(settings.msg)
		.css("color", settings.textColor)
		.css("background-color", settings.bgColor);

		return this; // chain 형태로 동작 가능하도록 
	};
})(jQuery);
