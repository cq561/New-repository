package shiyan4;

import java.util.Scanner;

public class Text {
	public static void main(String[] args) {
		// ����һ���о�������
		Graduate graduate = new Graduate();
		// �о�������ĳ�ʼ��
		graduate.name = "����";
		System.out.println("���:" + graduate.name);
		
		// �����¹���
		Scanner scanner = new Scanner(System.in);
		System.out.println("����������¹��ʣ�");
		double pay = scanner.nextDouble();
		graduate.setPay(pay);
		
		// ����ѧ��
		System.out.println("���������ѧ�ѣ�");
		double fee = scanner.nextDouble();
		graduate.setFee(fee);
		
		// �ж��Ƿ���Ҫ����
		boolean flag = graduate.Loan1();
		if (flag) {
			System.out.println("provide a loan(��Ҫ����)");
		}else {
			System.out.println("�Ը����㣬������ʳ");
		}
	}
}
