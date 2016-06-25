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
	
		System.out.println(this.name+"�� ü���� "+this.hp+"�Դϴ�."
				+ "");
		System.out.println(this.name+"�� ���ݷ��� "+this.hit+"�Դϴ�.\n");
		System.out.println(this.location);
	}
	

	
	public void attack(Unit unit){
		if(unit.hp<=0){
			System.out.println("���̻� ������ �� �����ϴ�.");
		}else{
			
			unit.hp = unit.hp - this.hit;
			System.out.println(this.name +"��(��) " +unit.name+"��(��) �����߽��ϴ�.\n"+unit.name+"�� hp�� "+this.hit+" ��ҽ��ϴ�.\n");
		
			if(unit.hp <= 0){
				System.out.println(unit.name +"�� hp�� 0�� �Ǿ� �׾����ϴ�.\n");
				
			}
		}
	}
	
	
	public void portion(){
		System.out.println(this.name +"��(��) ������ �԰� hp 10�� �ö����ϴ�.");
		this.hp = this.hp + 10;
		System.out.println(this.name + "�� ���� hp: "+hp+"\n");
	}

	public void upgrade(){
		System.out.println(this.name+"�� ���ݷ��� 10 �����Ͽ����ϴ�\n");
		this.hit = this.hit +10;
	}
	
}
