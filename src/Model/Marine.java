package Model;

public class Marine extends Unit{

	public Marine(String name){
		super(100,10,name);
		this.name=name;
		
	}
	
	public void state(){
	
		System.out.println("마린:" + this.name+"의 체력은 "+this.hp+"입니다."
				+ "");
		System.out.println("마린의 현재 위치는 ("+ 
				location.getX()+","+location.getY()+") 입니다");
		
		
		
	}
}
