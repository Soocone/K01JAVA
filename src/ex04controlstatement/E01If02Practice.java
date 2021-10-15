package ex04controlstatement;

public class E01If02Practice {

	public static void main(String[] args) {
		
		int num = 101;
		
		if(num%2 == 0) 
			System.out.println("짝수입니다.");
		else 
			System.out.println("홀수입니다.");
		
		
		// 홀짝 판단 후 100이상인지를 판단하는 프로그램을 if else로 작성
		int num2 = 120;
		if(num2%2 == 0) {
			if(num>=100) {
				System.out.println("짝수 100이상임");
			}
			else {
				System.out.println("짝수 100미만임");
			}
		}
		else {
			if(num2>=100) {
				System.out.println("홀수 100이상임");
			}
			else {
				System.out.println("홀수 100미만임");
			}
		}
	}
}
