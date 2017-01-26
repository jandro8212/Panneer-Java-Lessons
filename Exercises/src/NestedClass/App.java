package NestedClass;

public class App {

	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		
		OuterClass.staticMethod();
		oc.instanceMethod();
		
		OuterClass.StaticNestedClass snc = new OuterClass.StaticNestedClass();
		snc.method1();
		
		OuterClass.InnerClass ic = oc.new InnerClass();
		ic.method1();

	}

}
