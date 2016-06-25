package Model;

public class Unit {

	protected int hp;
	protected int hit;
	protected String name;
	protected Location location;
	
	
	
	public Unit(int hp,int hit, String name){
	
		this.hp=hp;
		this.hit=hit;
		this.name=name;
		this.location = new Location(0,0);
		
		
	}
	
	public void right(){
		this.location.work(0,1);
	}
	
	public void up(){
		this.location.work(1,0);
	}
	
	

	public void state(){
	
		System.out.println(this.name+"의 체력은 "+this.hp+"입니다."
				+ "");
		System.out.println(this.name+"의 공격력은 "+this.hit+"입니다.\n");
		System.out.println(this.location);
	}
	

	
	public void attack(Unit unit){
		if(unit.hp<=0){
			System.out.println("더이상 공격할 수 없습니다.");
		}else{
			
			unit.hp = unit.hp - this.hit;
			System.out.println(this.name +"이(가) " +unit.name+"을(를) 공격했습니다.\n"+unit.name+"의 hp가 "+this.hit+" 닳았습니다.\n");
		
			if(unit.hp <= 0){
				System.out.println(unit.name +"의 hp가 0이 되어 죽었습니다.\n");
				
			}
		}
	}
	
	
	public void portion(){
		System.out.println(this.name +"이(가) 포션을 먹고 hp 10이 올랐습니다.");
		this.hp = this.hp + 10;
		System.out.println(this.name + "의 현재 hp: "+hp+"\n");
	}

	public void upgrade(){
		System.out.println(this.name+"의 공격력이 10 증가하였습니다\n");
		this.hit = this.hit +10;
	}
	
}
