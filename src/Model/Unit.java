package Model;

public class Unit {

	protected int hp;
	protected int hit;
	String name;
	
	
	public Unit(int hp,int hit, String name){
	
		this.hp=hp;
		this.hit=hit;
		this.name=name;
		
	}
	
	public void state(){
	
		System.out.println(name+"의 체력은 "+hp+"입니다.\n");
		
	}

}
