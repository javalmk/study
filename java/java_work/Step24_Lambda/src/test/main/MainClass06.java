package test.main;

import java.util.ArrayList;
import java.util.List;

public class MainClass06 {
	public static void main(String[] args) {
		
		List<String> names=new ArrayList<>();
		names.add("±è±¸¶ó");
		names.add("ÇØ°ñ");
		names.add("¿ø¼þÀÌ");
		names.add("ÁÖµ­ÀÌ");
		names.add("µ¢¾î¸®");
		
		for(String tmp:names) {
			System.out.println(tmp);
		}
		System.out.println("--------");
		
		names.forEach((tmp)->{
			System.out.println(tmp);
		});
	}
}












