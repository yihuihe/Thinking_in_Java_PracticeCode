import java.util.*;

class Other {
	public static void main(String... args){//String类型的可变参数列表
		for(String s : args)
			System.out.print(s + " ");
	}
}

class StringTest{
	StringTest(String s){
		System.out.print("s:" + s + " ");
	}
}

class NewArray{
	static void printArray(Object... args){//Object类型的可变参数列表
		for(Object hyh : args)
			System.out.print(hyh + " ");
		System.out.println();
	}
}

class A {} 

public class ArraysTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random(47);
		Integer[] a = new Integer[random.nextInt(20)]; //数组初始化的一种方法
		for (int i=0; i<a.length; i++)
		{
			a[i] = random.nextInt(500);
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("the length of a is:" + a.length);
		System.out.println(Arrays.toString(a));
		
		
		Integer[] b = new Integer[] {new Integer(1), new Integer(2),};//数组初始化的第二种方法
		System.out.println(Arrays.toString(b));
		
		Integer[] c = {new Integer(3), new Integer(4), new Integer(5)};//数组初始化的第三种方法
		System.out.println(Arrays.toString(c));
		
		Other.main(new String[] {"hyh", "nihao", "ok"});//在方法调用的内部进行数组的初始化
		System.out.println();
		
		//第五章练习16：创建一个String对象数据，并为每个元素都赋值一个String。用for循环来打印该数组
		String[] string1 = new String[] {"a", "b", "c", "d"};
		for (int j=0; j <string1.length; j++)
		{
			System.out.print(string1[j] + " ");
		}
		System.out.println();
		
		//第五章练习18：创建一个类，它有一个接受一个String参数的构造器。在构造阶段，打印该参数。
		//           创建一个该类的对象引用数组，通过创建对象赋值给引用数组，完成练习。
		StringTest[] str1 = new StringTest[] {new StringTest("e"), new StringTest("f"), new StringTest("g"), };
		System.out.println();
		
		NewArray.printArray(new Integer(47), new Float(3.0), new Double(11.11));
		NewArray.printArray("one", "two", "three");
		NewArray.printArray(new A() , new A(), new A());
		NewArray.printArray((Object[])new Integer[] {11, 12, 13, 14});
		NewArray.printArray(new Integer[] {11, 12, 13, 14});
		NewArray.printArray();
	}

}
