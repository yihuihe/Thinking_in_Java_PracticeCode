/*
 * ��Ŀ��
 * ������A����B��ʹA��B�д������Ĺ���������A�м̳в���һ����ΪC�����࣬����C�ڴ���һ��B��ĳ�Ա��
 * ΪCдһ������������������ִ�����еĳ�ʼ����
 */
class A {
	public A (int i, double y) {//��C�Ļ��࣬�д��ι�����
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
		super(2, 3.9);//��Ҫ��super��ʽ�ص��û��๹����
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
