package bokang;

public class R02for
{
	public static void main(String[] args)
	{
		/*
		 while문: 반복의 횟수가 명확하지 않을 때 주로 사용하는 반복문
		 형식]
		 	반복을 위한 변수:
		 	while(반복조건){
		 		실행문;
		 		탈출을 위한 증감식;
		 	}
		 */
		//시나리오] 1~10까지의 합을 구하는 while문을 작성하시오
		int a = 1;
		int sum = 0;
		while(a<=10) {
			sum+= a;
			a++;
		}
		System.out.println(sum);
		
		/*
		 do~while문: while문과는 다르게 일단 한번 실행한 후
		 	탈출을 위한 조건을 체크한다.
		 형식]
		 	반복을 위한 초기값;
		 	do{
		 		실행문; <== 해당 실행문은 무조건 1번은 실행된다.
		 		증감식;
		 	}while(조건식);
		 */
		//시나리오] 위에서 만든 수열문제를 do~while문으로 변경하시오
		int i = 1;
		int result = 0;
		do {
			result += i;
			i++;
		}while(i<=10);
		System.out.println("do while "+result);
		
		/*
		 for문: 반복의 횟수가 명확할 때 사용하는 반복문
		 형식]
		 	for(초기값 ; 조건식 ; 증감식){
		 		실행문;
		 	}
		 */
		//시나리오] 수열문제를 for문으로 변경하시오
		int sumfor = 0;
		for(int j=1 ; j<=10 ; j++) {
			sumfor += j;
		}
		System.out.println("for "+sumfor);
		
		/*
		연습문제] 두개의 주사위를 던졌을때 눈의 합이 6이되는 경우를
		모두 출력하는 프로그램을 for문과 if문을 이용하여 작성하시오.
		실행결과]
			1+5=6
			2+4=6
			.......
			5+1=6
		 */
		//주사위1(1~6까지)
		System.out.println("for문");
		for(int b=1 ; b<=6 ; b++) {
			//주사위2(1~6까지)
			for(int c=1 ; c<=6 ; c++) {
				//두 주사위의 합이 6이 될 때만 출력하기
				if(b+c ==6) {
					System.out.printf("%d+%d=%d\n", b, c, b+c);
				}
			}
		}
		
		//do~while
		System.out.println("do~while문");
		int n =1;
		do {
			int m =1;
			do {
				if(n+m==6);
				System.out.printf("%d+%d=%d\n", n, m, n+m);
				m++;
			}while(m<=6);
			
			n++;
		}while(n<=6);
		
		
		//while
		System.out.println("while문");
		int q=1;
		//주사위 1은 q를 통해 반복
		while(q<=6) {
			int z=1;
			//주사위2는 z를 통해 반복
			while(z<=6) {
				if(q+z==6) {
					System.out.printf("%d+%d=%d%n", q, z, q+z);
				}
				z++;
			}
			q++;
		}
		
		
		/*
		시나리오] 방정식 2x+4y=12를 만족하는 모든 x,y값을 구하시오.
		단, x,y의 범위는 0~10사이의 정수이고 while문을 통해
		구현하시오.
		실행결과]
			x=0, y=3
			x=2, y=2
			.......
		 */
		System.out.println("방정식 while문으로 작성");
		//1. x와 y를 통해 각각 0~10까지 반복하는 while문을 중첩해서 만든다.
		int x = 0;
		while(x<=10) {
			int y=0;
			while(y<=10) {
				//2. 문제의 방정식을 아래와 같은 조건식으로 변경한다.
				if((2*x)+(4*y)==12) {
					//3. 조건에 만족하는 x, y를 출력한다.
					System.out.printf("x=%d, y=%d\n", x, y);
				}
				y++;
			}
			x++;
		}
		
		/*
		 연습문제] 앞의 방정식 문제를 for문으로 변경하시오.
		 */
		System.out.println("방정식 for문으로 작성");
		for(int s=0 ; s<=10 ; s++) {
			for(int d=0 ; d<=10 ; d++) {
				if((2*s)+(4*d)==12) {
					System.out.printf("s=%d, d=%d\n", s, d);
				}
			}
		}
	}
}
