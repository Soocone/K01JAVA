package ex04controlstatement;

import ex01start.E02SystemOutPrintln;

/*
 문제2) 1~100까지의 숫자중 3의배수 이거나 7의배수인 숫자의 합을 구하는 
 프로그램을 작성하시오. 단, 3과 7의 공배수인 경우 합에서 제외해야 한다.
 출력의결과는 누적되는 모든 수를 콘솔에 print한다.
 */
public class Qu_04_07 {

	public static void main(String[] args) {
		
		int sum = 0;
		int a = 1;
		
		while(a <= 100) {
			if(a % 3 == 0 || a % 7 == 0) {
				if(a % (3*7) == 0) 
					sum -= a;
				else if(a ==3)
					System.out.print(a);
				else {
					System.out.print("+"+a);
					sum += a;
				}
			}
			a++;
		}
		System.out.println("="+sum);
	}
}
