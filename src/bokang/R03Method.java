package bokang;

import java.util.Scanner;

public class R03Method
{
	//메서드 타입1: 구구단 출력
	public static void guguPrint() {
		//2단에서 9단까지 출력하는 구구단
		for(int dan=2 ; dan<=9 ; dan++) {
			for(int su=1 ; su<=9 ; su++) {
				//dan이 2로 고정된 상태에서 su는 1~9까지 증가된다.
				System.out.printf("%2d*%2d=%2d ", dan, su, dan*su);
			}
			//2단이 출력되면 줄을 바꿔주고 dan이 1 증가한다.
			System.out.println();
		}
	}
	
	//메서드 타입2: 주어진 범위를 출력하는 구구단
	public static void guguRangeShow(int n1, int n2) {
		//n1단에서 n2단까지 출력하는 형태
		for(int dan=n1 ; dan<=n2 ; dan++) {
			for(int su=1 ; su<=9 ; su++) {
				System.out.print(dan+"*"+su+"="+(dan*su)+" ");
			}
			System.out.println();
		}
	}
	
	
	
	public static void main(String[] args)
	{
		/*
		시나리오] 구구단을 출력하는 메소드를 작성하시오.
			메소드명 : guguPrint()
			주의] main메소드에서 호출하므로 정의하는 메소드는 
			반드시 static으로 선언해야 한다.
			※매개변수도 없고, 반환타입도 없는 경우
		 */
		System.out.println("매개변수X, 반환값X");
		guguPrint();
		
		/*
		시나리오]매개변수로 2개의 정수를 전달하여 해당 범위의 
			구구단을 출력하는 메소드를 작성하시오.
			만약 2, 5가 전달된다면 2단, 3단, 4단, 5단만 출력된다.
			메소드명 : guguRangeShow(int n1, int n2)
			※매개변수는 있고, 반환타입은 없는 메소드
		 */
		System.out.println("매개변수O, 반환값X");
		guguRangeShow(2, 5);
		
		/*
		시나리오] sungjukResult() 메소드를 호출하면 국어,영어,수학
		점수를 입력받은후 평균값을 반환하도록 구현하시오.
		※매개변수X, 반환값O
		 */
		System.out.println("매개변수X, 반환값O");
//		변수 = sungjukResult();
//		System.out.println(sungjukResult());
		System.out.println("평균 값은? "+sungjukResult());
		
	}
	
	
	public static double sungjukResult(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("국어성적 입력: ");
		int kor = scanner.nextInt();
		System.out.print("영어성적 입력: ");
		int eng = scanner.nextInt();
		System.out.print("수학성적 입력: ");
		int math = scanner.nextInt();
		
		double avg = (kor+eng+math)/3.0;
		return avg;
	}
}
