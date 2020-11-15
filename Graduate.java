package shiyan4;

import java.util.Scanner;

import shiyan4.Student.stuinterface;
import shiyan4.Teacher.teainterface;

public class Graduate {
	public abstract class graduate implements stuinterface,teainterface {

		public static void setFee(double fee) {
			// TODO Auto-generated method stub
			
		}

		
		}
	
    String name,sex;
    int age;
   static double fee,pay;
    public void setPay(double pay) {
    	
		this.pay = pay * 12;
		System.out.println("你的年收入为：" + this.pay);
	}
    public void getPay(double pay) {
		this.pay = pay * 12;
		System.out.println("你的年收入为：" + this.pay);
	}
    public void setFee(double fee) {
		this.fee = fee;
		System.out.println("你的学费设置为：" + this.fee);}
    
		public void getFee(double fee) {
			this.fee = fee;
			System.out.println("你的学费为：" + this.fee);}
    
   
		public static void ratepaying() {
			try{
			if((pay-fee)<3000) {
				System.out.println("应纳税款"+(pay-fee)*0.03);
				System.out.println("实发工资"+((pay-fee)-((pay-fee)*0.03)));
			}else if((pay-fee)>3000 && (pay-fee)<=12000){
				System.out.println("应纳税款"+(pay-fee)*0.1);
				System.out.println("实发工资"+((pay-fee)-((pay-fee)*0.1)));
			}else if((pay-fee)>12000 && (pay-fee)<=25000) {
				System.out.println("应纳税款"+(pay-fee)*0.2);
				System.out.println("实发工资"+((pay-fee)-((pay-fee)*0.2)));
			}else if((pay-fee)>25000 && (pay-fee)<=35000) {
				System.out.println("应纳税款"+(pay-fee)*0.25);
				System.out.println("实发工资"+((pay-fee)-((pay-fee)*0.25)));
			}else if((pay-fee)>35000 && (pay-fee)<=55000) {
				System.out.println("应纳税款"+(pay-fee)*0.3);
				System.out.println("实发工资"+((pay-fee)-((pay-fee)*0.3)));
			}else if((pay-fee)>55000 && (pay-fee)<=80000) {
				System.out.println("应纳税款"+(pay-fee)*0.35);
				System.out.println("实发工资"+((pay-fee)-((pay-fee)*0.35)));
			}else if((pay-fee)>80000) {
				System.out.println("应纳税款"+(pay-fee)*0.45);
				System.out.println("实发工资"+((pay-fee)-((pay-fee)*0.45)));
			}	
			}catch(Exception e){
				System.out.println("错误");
			}
		}			
	
		public static void main(String[] args) {
			try {
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
			
			
			
			
			// 设置学费t
			System.out.println("请输入你的学费：");
			
			double fee = scanner.nextDouble();
			graduate.setFee(fee);
			ratepaying();
			}
			catch(Exception e) {
				System.out.println("错误");
				
			}
		}}
		
				

