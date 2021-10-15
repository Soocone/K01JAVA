package ex03operator;

public class E04LogicOperatorPractice {

	public static void main(String[] args) {
		
		int a = 10, b = 20;
		
		boolean result1 = (a == 100 && b == 20);
		boolean result2 = (a<12 || b >= 30);
		
		System.out.println(result1);
		System.out.println(result2);
		
		
		if(!(a==b)) {
			System.out.println("a와 b는 다르다");
		}
		else {
			System.out.println("a와 b는 같다.");
		}
		
	}

}
