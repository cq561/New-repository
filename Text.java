package shiyan4;

import java.util.Scanner;

public class Text {
	public static void main(String[] args) {
		// 创建一个研究生对象
		Graduate graduate = new Graduate();
		// 研究生对象的初始化
		graduate.name = "张三";
		System.out.println("你好:" + graduate.name);
		
		// 设置月工资
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你的月工资：");
		double pay = scanner.nextDouble();
		graduate.setPay(pay);
		
		// 设置学费
		System.out.println("请输入你的学费：");
		double fee = scanner.nextDouble();
		graduate.setFee(fee);
		
		// 判断是否需要贷款
		boolean flag = graduate.Loan1();
		if (flag) {
			System.out.println("provide a loan(需要贷款)");
		}else {
			System.out.println("自给自足，丰衣足食");
		}
	}
}
