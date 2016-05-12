import java.util.*;

class Other {
	public static void main(String... args){//String���͵Ŀɱ�����б�
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
	static void printArray(Object... args){//Object���͵Ŀɱ�����б�
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
		Integer[] a = new Integer[random.nextInt(20)]; //�����ʼ����һ�ַ���
		for (int i=0; i<a.length; i++)
		{
			a[i] = random.nextInt(500);
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("the length of a is:" + a.length);
		System.out.println(Arrays.toString(a));
		
		
		Integer[] b = new Integer[] {new Integer(1), new Integer(2),};//�����ʼ���ĵڶ��ַ���
		System.out.println(Arrays.toString(b));
		
		Integer[] c = {new Integer(3), new Integer(4), new Integer(5)};//�����ʼ���ĵ����ַ���
		System.out.println(Arrays.toString(c));
		
		Other.main(new String[] {"hyh", "nihao", "ok"});//�ڷ������õ��ڲ���������ĳ�ʼ��
		System.out.println();
		
		//��������ϰ16������һ��String�������ݣ���Ϊÿ��Ԫ�ض���ֵһ��String����forѭ������ӡ������
		String[] string1 = new String[] {"a", "b", "c", "d"};
		for (int j=0; j <string1.length; j++)
		{
			System.out.print(string1[j] + " ");
		}
		System.out.println();
		
		//��������ϰ18������һ���࣬����һ������һ��String�����Ĺ��������ڹ���׶Σ���ӡ�ò�����
		//           ����һ������Ķ����������飬ͨ����������ֵ���������飬�����ϰ��
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
