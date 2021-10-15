package ex04controlstatement;

import ex01start.E02SystemOutPrintln;

public class E03WhilePractice {

	public static void main(String[] args) {
		
		int i = 1;
		while(i<=10) {
			System.out.println("변수i="+i);
			i++;
		}
		
		int sum = 0;
		int j = 1;
		while(j<=10) {
			sum+=j;
			j++;
		}
		System.out.println(sum);
		
		
		
		/////////////////////////////////////
		int total = 0;
		int k = 1;
		while(k<=100) {
			
			if(k%3==0 || k%4==0) {
				total += k;
				System.out.println("k="+ k);
			}
			k++;
		}
		System.out.println("3또는 4의 배수의 합: "+ total);
		
		
		////////////////////////////////////////
		/*
		 시나리오] 구구단을 출력하는 프로그램을 작성하시오.
		 단 while문을 이용하시오.
		 */ 
		 
		int dan = 2;
		while(dan <= 9) {
			int su = 1;
			while(su <= 9) {
				System.out.printf("%-2d* %-2d=%2d  ", dan, su, (dan*su));
				su++;
			}
			System.out.println();
			dan++;
		}
		
		////////////////////////////////////////////
		/*
		 시나리오] 아래와 같은 모양을 출력하는 while 문을 작성하시오
		 	출력 결과
		 		1 0 0 0
		 		0 1 0 0
		 		0 0 1 0
		 		0 0 0 1
		 */
		
		int a = 1;
		while(a <=4) {
			int b = 1;
			while(b <= 4) {
				if(a == b)
					System.out.print("1 ");
				else
					System.out.print("0 ");
				b++;	
			}
			System.out.println();
			a++;
		}
	}
}
