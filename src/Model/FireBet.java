package Model;

public class FireBet {
	
	public String name;
	public int hp=100;
	public int hit=10;
	
	
	public FireBet(String name){
		this.name=name;
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
	
	public boolean attack(Marine marine){
		if(marine.getHp()<=0){
			System.out.println("더이상 공격할 수 없습니다.");
		}else{
			marine.setHp(marine.getHp()-hit);
			System.out.println(this.name +"이(가) " +marine.name+"을(를) 공격했습니다.\n"+marine.name+"의 hp가 "+hit+" 닳았습니다.\n");
		
			if(marine.getHp() <= 0){
				System.out.println(marine.name +"의 hp가 0이 되어 죽었습니다.\n");
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
