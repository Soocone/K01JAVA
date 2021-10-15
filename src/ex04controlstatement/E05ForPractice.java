package ex04controlstatement;

public class E05ForPractice {

	public static void main(String[] args) {
		
		/*
		 시나리오] 1~100까지의 합을 구하는 프로그램을 for문을
		 	이용하여 작성하시오.
		 */
		
		int sum = 0;
		for(int i=1 ; i <=100 ; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		/*
		 시나리오] for문을 이용하여 1~10사이의 정수중 2의 배수의 합을
		 구하는 프로그램을 작성하시오.
		 */
		
		int total = 0;
		for(int a = 1 ; a <=10 ; a++) {
			if(a % 2 == 0)
				total +=a;
		}
		System.out.println(total);
		
		total = 0;
		for(int a = 0 ; a <= 10 ; a += 2) {
			total += a;
		}
		System.out.println(total);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
