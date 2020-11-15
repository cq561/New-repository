#### 计G202 2020322100  陈庆
# 接口程序实验
## 一，实验目的
掌握Java中抽象类和抽象方法的定义；   
掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法  
了解异常的使用方法，并在程序中根据输入情况做异常处理  
## 二 实验内容
设计两个管理接口：学生管理接口和教师管理接口。学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。  
设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。（其他属性及方法，可自行发挥）  
编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额（国家最新工资纳税标准，请自行检索）。  
## 实验要求
在 博士研究生类中实现各个接口定义的抽象方法;  
对年学费和年收入进行统计，用收入减去学费，求得纳税额；  
国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static  final修饰定义。  
实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入。  
根据输入情况，要在程序中做异常处理。  
## 实验过程
先设计个接口

在做处理
## 核心代码
public static void main(String[] args) {  
			try {  
				//创建研究生对象  
				Graduate graduate = new Graduate();  
				Scanner scanner = new Scanner(System.in);  	
				System.out.println("请输入要查询人的个数");  
				
				int j = scanner.nextInt();  
				for(int i=1;i<=j;i++){  
				//初始化研究生对象  
				System.out.println("请输入姓名");  
				graduate.name = scanner.next();		//姓名  
				System.out.println("请输入年龄");  
				graduate.age = scanner.nextInt();	//年龄  
				System.out.println("请输入性别");  
				graduate.sex = scanner.next();		//性别  
				//设置工资  
				System.out.println("请输入月工资");  
				double pay = scanner.nextDouble();	//月工资  
				graduate.setPay(pay);  
				System.out.println("请输入学费");  
				double fee = scanner.nextDouble();	//学费  
				graduate.setFee(fee);  
				ratepaying();  
				}  
			}  
			catch(Exception e) {  
				System.out.println("错误");  
				
			}  
## 实验结果

## 实验感想
知识不足 参考了其他同学和网上的知识 才完成了此次的实验 
