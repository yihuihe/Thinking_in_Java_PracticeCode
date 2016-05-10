/**
*Java编程思想第四版
*P83练习题
*
**/
class Contructor1{
	Contructor1(){//练习3：无参构造器
		System.out.println("This is Constructor1");
	}
	Contructor1(String s){//练习4：接受参数String的构造器
		System.out.println("This is Constructor1" + "  " + s );
	}
}

class Dog {
	 void bark(int i) {//练习5
		System.out.println("barking");
	}
	 void bark(double m)//练习5
	{
		System.out.println("howling");
	}
	 void bark(int i, double m)//练习6
	 {
		 System.out.println("The dog is barking");
	 }
	 void bark(double m, int i)//练习6
	 {
		 System.out.println("The dog is howling");
	 }
}

class Test {} //练习7

public class DefaultConstructor {
		public static void main (String[] args){
			Contructor1 contructor = new Contructor1();
			Contructor1 contructor1 = new Contructor1("nihao");
			
			Dog dog1 = new Dog();
			dog1.bark(1);
			dog1.bark(1.0);
			
			Dog dog2 = new Dog();
			dog2.bark(1,3.0);
			dog2.bark(3.0, 2);
			
			Test test1 = new Test();
		}
}
