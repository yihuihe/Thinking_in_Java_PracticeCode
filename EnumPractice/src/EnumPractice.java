enum money {
	WuMao, YiKuai, WuKuai, ShiKuai, ErShiKuai,WuShiKuai
}
public class EnumPractice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//P107练习题21：创建一个enum,它包含纸币中最小面值的6种类型。通过values()循环并打印每一个值及其ordinal()。
	for( money s : money.values())
		System.out.println(s + " " + s.ordinal() );
	
	//P107练习题22：为enum写一个switch语句，对于每一个case,输出该特定货币的描述。
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
