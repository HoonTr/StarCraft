package Controller;

import java.util.Scanner;

import Model.Marine;
import Model.FireBet;

public class Controller {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Marine m1 = new Marine("����1");
		Marine m2 = new Marine("����2");
		
	
		m1.attack(m2);
		
		m1.state();
		m2.state();
		
		
		
		
		
		
		
//		
//		int i= 0;
//		while(i==0){
//			System.out.println("-------------------------------------");
//			System.out.println("1.�������  2.ü��ȸ��   3.���׷��̵�  4.���º���");
//			System.out.println("        (�����Ͻ÷��� �ƹ�Ű�� ��������)       ");
//			System.out.println("-------------------------------------");
//			int num = scanner.nextInt();
//			
//			switch(num){
//			case 1: 
//				marine1.attack(marine2);
//				break;
//			case 2:
//				marine1.portion();
//				break;
//			case 3:
//				marine1.upgrade();
//				break;
//			case 4:
//				marine1.state();
//				break;
//			default : 
//				i=1;
//				break;
//			
//					
//				
//			}
//			
//		}

	
		
		
	}
}
