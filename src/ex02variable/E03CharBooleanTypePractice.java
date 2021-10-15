package ex02variable;

public class E03CharBooleanTypePractice {

	public static void main(String[] args) {
		
		char ch1 = '가';
		String chStr = "가나다라";
		
		char ch2 = 'A';
		int num1 = 2;
		int num2 = ch2 + num1;
		System.out.println(num2);
		System.out.println((char)num2);
		
		char ch3 = (char)(ch2+num1);
		System.out.println(ch3);
		System.out.println((int)ch3);
		
		char ch4 = '1';
		char ch4_1 = '1' + 1;
		System.out.println(ch4 + ch4_1 + (int)ch4_1);
		
		boolean bn1 = true;
		boolean bn2 = false;
		
		boolean bn3 = bn1 && bn2;
		bn3 = bn1 || bn2;
		bn3 = '가' > 3000;
		
		
		

	}

}
