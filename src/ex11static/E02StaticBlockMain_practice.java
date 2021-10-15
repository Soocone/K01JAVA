package ex11static;

public class E02StaticBlockMain_practice
{
	int instanceVar;
	void instanceMethod() {}
	
	static int staticVar;
	static void staticMethod() {
		int localVar;
		System.out.println("정적메소드");
	}
	
	static {
		staticVar = 1000;
		
		int localVar;
		localVar = 1000;
		System.out.println(localVar);
		
		System.out.println(staticVar);
		staticMethod();
	}
	
	
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
