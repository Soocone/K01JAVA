package ex05method;

public class E02MethodType02_1Practice {

	static int noParamYesReturn() {
		int sum = 0;
		for(int i=1 ; i <=10 ; i++) {
			sum += i;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		System.out.println("1~10까지의 합:"+noParamYesReturn());
		
		int sum10 = noParamYesReturn();
		System.out.printf("1에서 10까지의 합은 %d입니다", sum10);
		
	}

}
