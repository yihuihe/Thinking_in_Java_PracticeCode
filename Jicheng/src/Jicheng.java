/*
 * 题目：
 * 创建类A和类B，使A和B有带参数的构造器，从A中继承产生一个名为C的新类，并在C内创建一个B类的成员。
 * 为C写一个构造器，并在其中执行所有的初始化。
 */
class A {
	public A (int i, double y) {//是C的基类，有带参构造器
		System.out.println("Constrcution A");
		System.out.println("i= " + i);
		System.out.println("y= " + y);
	}
}
class B {
	public B (int j) {
		System.out.println("Construction B");
		System.out.println("j= " + j);
	}
}
class C extends A {
	public C(int i, double y) {
		super(2, 3.9);//需要用super显式地调用基类构造器
		B b = new B(2);
		System.out.println("Construction C");
	}	
}

public class Jicheng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C(2,3.9);
	}

}
