enum money {
	WuMao, YiKuai, WuKuai, ShiKuai, ErShiKuai,WuShiKuai
}
public class EnumPractice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//P107��ϰ��21������һ��enum,������ֽ������С��ֵ��6�����͡�ͨ��values()ѭ������ӡÿһ��ֵ����ordinal()��
	for( money s : money.values())
		System.out.println(s + " " + s.ordinal() );
	
	//P107��ϰ��22��Ϊenumдһ��switch��䣬����ÿһ��case,������ض����ҵ�������
	money sq = money.WuKuai ;
		switch (sq)
		{
		case WuMao: {
			System.out.println("This is the money:WuMao");
			break;
		}
		case YiKuai: {
			System.out.println("This is the money:YiKuai");
			break;
		}
		case WuKuai: {
			System.out.println("This is the money:WuKuai");
			break;
		}
		case ShiKuai: {
			System.out.println("This is the money:ShiKuai");
			break;
		}
		
		case ErShiKuai: {
			System.out.println("This is the money:ErShiKuai");
			break;
		}
		case WuShiKuai: {
			System.out.println("This is the money:WuShiKuai");
			break;
		}
		
		}
	}

}
