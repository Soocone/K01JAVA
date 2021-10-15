package ex05method;

public class E01MethodType01Practice {

	public static void main(String[] args) {
		noParamNoReturn();
	}

	static void noParamNoReturn() {
		int returnValue = 90;
		
		if(returnValue%2==0) {
			System.out.println(returnValue+"은(는) 짝수");
			return;
		}
		System.out.println(returnValue+"은(는) 홀수");
	}
}
