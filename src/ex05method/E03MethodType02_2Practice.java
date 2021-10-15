package ex05method;

import java.util.Scanner;

public class E03MethodType02_2Practice {
/*
 시나리오] 사용자로부터 국, 영, 수 점수를 입력받아 평균을 구한 후
 학점을 반환하는 메서드를 정의하시오.
 */
	public static void main(String[] args) {
		System.out.println("이번 학기 성적은 "+getHakjum()+"입니다.");

	}
	
	static String getHakjum() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어 점수:");
		int kor = scanner.nextInt();
		System.out.print("영어 점수:");
		int eng = scanner.nextInt();
		System.out.print("수학 점수:");
		int math = scanner.nextInt();
		
		double avg = (kor+eng+math) / 3.0;
		
		String hakjum = "";
		
		int result = (int)avg / 10;
		switch(result) {
		case 10: case 9:
			hakjum = "A학점";break;
		case 8:
			hakjum = "B학점";break;
		case 7:
			hakjum = "C학점";break;
		case 6:
			hakjum = "D학점";break;
		default:
			hakjum = "F학점";
		}
		return hakjum;
	}

}
