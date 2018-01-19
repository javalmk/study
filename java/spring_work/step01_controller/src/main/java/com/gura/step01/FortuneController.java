package com.gura.step01;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//1. 컨트롤러 만들기 
@Controller
public class FortuneController {
	
	//2. 요청 맵핑
	@RequestMapping("/fortune")
	public String fortune(HttpServletRequest request){
		// 모델(데이터) 를 request 에 담기
		String fortuneToday="동쪽으로 가면 귀인을 만나요!";
		request.setAttribute("fortuneToday", fortuneToday);
		
		//3. view 페이지 정보 리턴하기 
		return "fortune"; //forward 이동
	}
}








