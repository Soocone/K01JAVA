package ex05method;
/*
연습문제] 사용자로부터 2~9사이의 숫자중 2개를 입력받아
그에 해당하는 구구단을 출력하는 메소드를 작성하시오.
무조건 첫번째 입력받는수가 작아야한다.
입력예]
	첫번째숫자 : 3
	두번째숫자 : 12
	3*1=3 3*2=6........
	........
	...................12*9=108
메소드명 : inputGugudan(int sNum, int eNum)
 */

import java.util.Scanner;

public class E04MethodType03_2Practice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("시작 단을 입력:");
		int startNum = scanner.nextInt();
		System.out.print("마지막 단을 입력:");
		int endNum = scanner.nextInt();
		
		inputGugudan(startNum, endNum);
	}
	
	
	static void inputGugudan(int sNum, int eNum) {
		for(int dan = sNum ; dan <= eNum ; dan++) {
			for(int su=1 ; su <= 9 ; su++) {
				System.out.printf("%d * %d =%2d", dan, su, (dan*su));
			}
			System.out.println();
		}
	}
}
