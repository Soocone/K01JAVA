package ex03operator;

public class E06PrePostFixOperatorPractice {

	public static void main(String[] args) {
		int num1 = 7;
		int num2, num3;
		
		num2 = ++num1;
		
		num3 = --num1;
		
		System.out.printf("num1=%d, num2=%d, num3=%d %n", num1, num2, num3);
		
		
		num1 = 7;
		
		num2 = num1++;
		
		num3 = num1--;
		
		System.out.printf("num1=%d, num2=%d, num3=%d", num1, num2, num3);
	
	}

}
