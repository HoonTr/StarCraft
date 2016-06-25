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
		
		Marine m1 = new Marine("마린1");
		Marine m2 = new Marine("마린2");
		FireBet f1 =new FireBet("파이어벳1");
		FireBet f2 =new FireBet("파이어벳2");
	
		
		
		while(true){
			System.out.println("마린 생성 : 1");
			System.out.println("파이어벳 생성 : 2");
			System.out.println("현황 보기 : 3");
			System.out.println("유닛 이동 : 4");
			
			int input= scanner.nextInt();
			
			switch(input){
			case 1:
				
				Marine marine = new Marine("마린");
				list.add(marine);
				break;
				
			case 2:
				FireBet firebet = new FireBet("파이어벳");
				list.add(firebet);
				break;
				
			case 3:
				System.out.println(list.size()+"마리");
				
				for(int i=0; i<list.size(); i++){
					Unit unit = list.get(i);
					System.out.println(i+1 +"번 유닛 :");
					unit.state();
				}
				
				break;
			case 4:
				
				System.out.println("이동할 유닛을 선택하세요.\n선택가능한 유닛:"+list.size()+"\n");
				int unitNum = scanner.nextInt()-1;
				Unit unit = list.get(unitNum);
				
				System.out.println("오른쪽이동:1  위쪽이동:2");
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
//			System.out.println("1.상대방공격  2.체력회복   3.업그레이드  4.상태보기");
//			System.out.println("        (종료하시려면 아무키나 누르세요)       ");
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
