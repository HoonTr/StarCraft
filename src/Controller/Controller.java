package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.FireBet;
import Model.Marine;
import Model.Unit;

public class Controller {
	public static void main(String[] args) {
		
		List<Unit> list =new ArrayList<Unit>();
		
		
		Scanner scanner = new Scanner(System.in);
		
		Marine m1 = new Marine("����1");
		Marine m2 = new Marine("����2");
		FireBet f1 =new FireBet("���̾1");
		FireBet f2 =new FireBet("���̾2");
	
		
		
		while(true){
			System.out.println("���� ���� : 1");
			System.out.println("���̾ ���� : 2");
			System.out.println("��Ȳ ���� : 3");
			System.out.println("���� �̵� : 4");
			
			int input= scanner.nextInt();
			
			switch(input){
			case 1:
				
				Marine marine = new Marine("����");
				list.add(marine);
				break;
				
			case 2:
				FireBet firebet = new FireBet("���̾");
				list.add(firebet);
				break;
				
			case 3:
				System.out.println(list.size()+"����");
				
				for(int i=0; i<list.size(); i++){
					Unit unit = list.get(i);
					System.out.println(i+1 +"�� ���� :");
					unit.state();
				}
				
				break;
			case 4:
				
				System.out.println("�̵��� ������ �����ϼ���.\n���ð����� ����:"+list.size()+"\n");
				int unitNum = scanner.nextInt()-1;
				Unit unit = list.get(unitNum);
				
				System.out.println("�������̵�:1  �����̵�:2");
				int input2=scanner.nextInt();
				switch(input2){
				case 1:
					unit.right();
					
					break;
					
				case 2:
					unit.up();
					break;
				}
			
			}
			
		
		}
		
		
		
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
//				m1.attack(m2);
//				break;
//			case 2:
//				m1.portion();
//				break;
//			case 3:
//				m1.upgrade();
//				break;
//			case 4:
//				m1.state();
//				break;
//			default : 
//				i=1;
//				break;
//				
//			}
//		}

	
		
		
	}
}
