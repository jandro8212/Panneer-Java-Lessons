package exercise11b;

import exercise11.Class1;

public class Class2 {
	Class1 c;
	
	//Constructor injection
	public Class2(Class1 c){
		this.c = c;
	}
	public void method1() {
		//Class1 a = new Class1();
		c.method1();
	}
	
	public void setClass1(Class1 c) {
		this.c = c;
	}
}
