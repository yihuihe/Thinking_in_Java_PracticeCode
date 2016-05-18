/*
 * 题目：
 * 练习八：创建一个基类，它仅有一个非默认构造器；在创建一个导出类，它带有默认构造器和非默认构造器。
 * 在导出类的构造器中调用基类的构造器。
 */
class  Basic {
	public Basic (String s){
		System.out.println("This is the Basic Construction");
		System.out.println("s= " + s);
	}
}

class BasicTwo extends Basic {
	public BasicTwo () {//BasicTwo的默认构造器
		super("nihao");
		System.out.println("This is the first Construction");	
	};
	
	public BasicTwo(String s1, int i){//BasicTwo的非默认构造器
		super(s1);
		System.out.println("s1= " + s1 + ", i= " + i);
		System.out.println("This is the second Construction");
	}
}
public class Practice8_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicTwo basic1 = new BasicTwo();
		System.out.println();
		BasicTwo basic2 = new BasicTwo("example two",520);
		
	}
}
