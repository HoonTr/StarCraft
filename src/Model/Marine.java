package Model;

public class Marine extends Unit{

	public String name;
	protected int hp;
	private int hit=0;
	
	public boolean isAlive = true;
	
	
//	public Marine(String name){
//		this.name=name;
//	}
	
	public Marine(String name){
		super(100,10,name);
		this.name=name;
		
		
	}
	
	
	public int getHp(){
		return this.hp;
	}

	public void setHp(int hp){
		this.hp=hp;
	}
	
	
	public boolean attack(Marine marine){
		if(marine.hp<=0){
			System.out.println("더이상 공격할 수 없습니다.");
		}else{
			marine.hp = marine.hp-hit;
			System.out.println(this.name +"이(가) " +marine.name+"을(를) 공격했습니다.\n"+marine.name+"의 hp가 "+hit+" 닳았습니다.\n");
		
			if(marine.hp <= 0){
				System.out.println(marine.name +"의 hp가 0이 되어 죽었습니다.\n");
				return true;
			}
		}
		return false;
	}
	
	public boolean attack(FireBet firebet){
		if(firebet.hp<=0){
			System.out.println("더이상 공격할 수 없습니다.");
		}else{
			firebet.hp = firebet.hp-hit;
			System.out.println(this.name +"이(가) " +firebet.name+"을(를) 공격했습니다.\n"+firebet.name+"의 hp가 "+hit+" 닳았습니다.\n");
		
			if(firebet.hp <= 0){
				System.out.println(firebet.name +"의 hp가 0이 되어 죽었습니다.\n");
				return true;
			}
		}
		return false;
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
