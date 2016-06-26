package Model;

public class FireBet extends Unit{

	public FireBet(String name){
		super(130,10,name);
		this.name=name;
	}

	
	public void state(){
		
		System.out.println(this.name+"(파이어벳)의 체력은 "+this.hp+"입니다."
				+ "("+ location.getX()+","+location.getY()+")"+"  [공격력:"+this.hit+"]");
	}
	public void attack(Unit unit){
		double num = this.location.distance(unit.location);
		if(num>=3){
			System.out.println("거리가 멀어 공격할 수 없습니다");
		}else{
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
	}
}
