package ex04controlstatement;

import java.io.IOException;

public class E01IF01Practice {

	public static void main(String[] args) throws IOException{
		
		int num = 10;
		
		if(num%2==0) {
			System.out.printf("%d는 짝수입니다.\n", num);
		}
		if(num%2==0 && num>=10) {
			System.out.printf("%d는 짝수이고 10보다 크거나 같습니다.", num);
		}
		
		if(num%2 != 0) {
			System.out.printf("%d는 홀수입니다.", num);
		}
		
		if(num%2 ==0)
			System.out.println("\n"+num+"은 짝수이다.");
		
		
		//시나리오. 문자/숫자 판단 프로그램 if 사용하여 작성
		System.out.println("문자 하나만 입력하세요.");
		int asciiCode = System.in.read();
		System.out.println("입력한 코드는"+asciiCode);
		
		if(asciiCode>='0' && asciiCode<='9') {
			System.out.println("입력한 문자는 숫자입니다.");
		}
		else {
			System.out.println("입력한 문자는 숫자가 아닙니다.");
		}
		
		
	}
}
