/**
*Java���˼����İ�
*P83��ϰ��
*
**/
class Contructor1{
	Contructor1(){//��ϰ3���޲ι�����
		System.out.println("This is Constructor1");
	}
	Contructor1(String s){//��ϰ4�����ܲ���String�Ĺ�����
		System.out.println("This is Constructor1" + "  " + s );
	}
}

class Dog {
	 void bark(int i) {//��ϰ5
		System.out.println("barking");
	}
	 void bark(double m)//��ϰ5
	{
		System.out.println("howling");
	}
	 void bark(int i, double m)//��ϰ6
	 {
		 System.out.println("The dog is barking");
	 }
	 void bark(double m, int i)//��ϰ6
	 {
		 System.out.println("The dog is howling");
	 }
}

class Test {} //��ϰ7

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
