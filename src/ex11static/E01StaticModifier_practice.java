package ex11static;

class Mystatic_p{
	int instanceVar;
	static int staticVar;
	
	void instanceMethod() {
		System.out.println("instancevar="+ instanceVar);
		System.out.println("staticVar="+ staticVar);
		staticMethod();
	}
	
	static void staticMethod() {
		System.out.println("staticVar="+ staticVar);
	}
}


public class E01StaticModifier_practice
{
	public static void main(String[] args)
	{
		Mystatic_p mystatic = new Mystatic_p();
		mystatic.instanceVar = 100;
		System.out.println("myStatic.instanceVar"+ mystatic.instanceVar);
		
		Mystatic_p.staticVar = 200;
		System.out.println("MyStatic.staticVar="+ Mystatic_p.staticVar);
		
		mystatic.instanceMethod();
		Mystatic_p.staticMethod();
		
	}
}
