package Model;

public class FireBet extends Unit{

	public FireBet(String name){
		super(130,10,name);
		this.name=name;
	}

	
	public void state(){
		
		System.out.println("파이어벳:"+this.name+"의 체력은 "+this.hp+"입니다."
				+ "");
		System.out.println("파이어벳의 현재 위치는 ("+ 
				location.getX()+","+location.getY()+") 입니다");
	}
}
