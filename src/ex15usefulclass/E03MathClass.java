package ex15usefulclass;

import java.lang.*; //선언할 필요 없음. 자동 상속
/*
 Math클래스
 -java.lang 패키지에 포함된 클래스
 -수학과 관련된 일련의 작업들을 처리함
 -메서드는 static으로 선언되어 객체생성 없이 사용 가능
 */
public class E03MathClass extends Object  //Object 클래스도 안써도 자동 상속
{
	public static void main(String[] args) 
	{
		System.out.println("원주율:"+ Math.PI);
		
		float f = -3.14f;
		double d = -100.9;
		int num = -10;
		
		//절대값 -> 항상 양의 정수값 출력
		System.out.println("### 절대값 ###");
		System.out.println("Math.abs:"+ Math.abs(f));
		System.out.println("Math.abs:"+ Math.abs(d));
		System.out.println("Math.abs:"+ Math.abs(num));
		
		System.out.println("### 올림 ###");
		System.out.println("Math.ceil:"+ Math.ceil(3.4)); //4
		System.out.println("Math.ceil:"+ Math.ceil(-3.4)); //-3
		System.out.println("Math.ceil:"+ Math.ceil(3.9)); //4
		
		System.out.println("### 내림 ###");
		System.out.println("Math.floor:"+ Math.floor(3.4)); //3
		System.out.println("Math.floor:"+ Math.floor(-3.4)); //-4
		System.out.println("Math.floor:"+ Math.floor(3.9)); //3
		
		System.out.println("### 반올림 ###"); //첫재짜리에서 반올림
		System.out.println("Math.round:"+ Math.round(3.499999)); //버림처리
		System.out.println("Math.round:"+ Math.round(3.544444)); //올림처리
		System.out.println("Math.round:"+ Math.round(-1.4)); 
		System.out.println("Math.round:"+ Math.round(-1.5));
		System.out.println("Math.round:"+ Math.round(-3.51));
		
		System.out.println("### 최대/최소 ###");
		System.out.println("Math.max:"+ Math.max(100, 99));
		System.out.println("Math.min:"+ Math.min(100, 99));
		
		System.out.println("### 난수 ###");
		System.out.println((int)(Math.random()*45)+1); //1~45 사이의 난수
		
		System.out.println("### 거듭제곱 ###");
		System.out.println("2의 10승은?"+ Math.pow(2, 10)); //1024
	}
}
