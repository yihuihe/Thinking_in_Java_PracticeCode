/*
 * ��Ŀ��
 * ��ϰ�ˣ�����һ�����࣬������һ����Ĭ�Ϲ��������ڴ���һ�������࣬������Ĭ�Ϲ������ͷ�Ĭ�Ϲ�������
 * �ڵ�����Ĺ������е��û���Ĺ�������
 */
class  Basic {
	public Basic (String s){
		System.out.println("This is the Basic Construction");
		System.out.println("s= " + s);
	}
}

class BasicTwo extends Basic {
	public BasicTwo () {//BasicTwo��Ĭ�Ϲ�����
		super("nihao");
		System.out.println("This is the first Construction");	
	};
	
	public BasicTwo(String s1, int i){//BasicTwo�ķ�Ĭ�Ϲ�����
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
