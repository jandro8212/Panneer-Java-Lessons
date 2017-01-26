package NestedClass;

public class OuterClass {
	public static void staticMethod (){ //Static
		System.out.println("From static method");
	}
	
	public void instanceMethod(){  //Instance
		System.out.println("From instance method");
	}
	
	// Static Nested Class
	static class StaticNestedClass {
		public void method1() {
			System.out.println("Within Static Nested Class");
		}
	}
	
	//Inner Class
	
	class InnerClass {
		public void method1(){
			System.out.println("Within Inner Class");
		}
	}
}
