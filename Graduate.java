package shiyan4;

import java.util.Scanner;

import shiyan4.Student.stuinterface;
import shiyan4.Teacher.teainterface;

public class Graduate {
	public abstract class graduate implements stuinterface,teainterface {

		
		}
    String name,sex;
    int age;
    double fee,pay;
    public void setPay(double pay) {
		this.pay = pay * 12;
		System.out.println("���������Ϊ��" + this.pay);
	}
    public void getPay(double pay) {
		this.pay = pay * 12;
		System.out.println("���������Ϊ��" + this.pay);
	}
    public void setFee(double fee) {
		this.fee = fee;
		System.out.println("���ѧ������Ϊ��" + this.fee);}
    
		public void getFee(double fee) {
			this.fee = fee;
			System.out.println("���ѧ��Ϊ��" + this.fee);}
		public boolean Loan1(){
			if ((this.pay - this.fee) < 2000) {
				System.out.println("���������" + this.pay + ",��ȥѧ��" + this.fee + "����" + (this.pay - this.fee));
				return true;
			}
			System.out.println("���������" + this.pay + ",��ȥѧ��" + this.fee + "����" + (this.pay - this.fee));
			return false;

		}
		public boolean Loan(){
			if ((this.pay - this.fee) < 2000) {
				System.out.println("���������" + this.pay + ",��ȥѧ��" + this.fee + "����" + (this.pay - this.fee));
				return true;
			}
			System.out.println("���������" + this.pay + ",��ȥѧ��" + this.fee + "����" + (this.pay - this.fee));
			return false;
		}
		
	

}
