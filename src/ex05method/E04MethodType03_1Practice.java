package ex05method;

import java.util.Scanner;

/*
 시나리오] 사용자가 입력한 2개의 시작값과 끝값 사이에 있는
 수를 모두 더하여 출력하는 프로그램을 작성하시오.
 	출력 결과:
 		시작값: 5
 		종료값: 9
 		결과: 5+6+7+8+9=????
*/
public class E04MethodType03_1Practice {
	
	static void yesParamNoReturn(int startNum, int endNum) {
		int sum = 0;
		for(int i = startNum ; i <= endNum ; i++) {
			sum += i;
		}
		System.out.printf("시작값: %d\n종료값: %d\n결과:%d", 
				startNum, endNum, sum);
	}
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("시작값:");
		int a = scanner.nextInt();
		System.out.print("끝값:");
		int b = scanner.nextInt();
		
		yesParamNoReturn(a, b);
	}
}
