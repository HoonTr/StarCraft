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
			System.out.println("���̻� ������ �� �����ϴ�.");
		}else{
			marine.hp = marine.hp-hit;
			System.out.println(this.name +"��(��) " +marine.name+"��(��) �����߽��ϴ�.\n"+marine.name+"�� hp�� "+hit+" ��ҽ��ϴ�.\n");
		
			if(marine.hp <= 0){
				System.out.println(marine.name +"�� hp�� 0�� �Ǿ� �׾����ϴ�.\n");
				return true;
			}
		}
		return false;
	}
	
	public boolean attack(FireBet firebet){
		if(firebet.hp<=0){
			System.out.println("���̻� ������ �� �����ϴ�.");
		}else{
			firebet.hp = firebet.hp-hit;
			System.out.println(this.name +"��(��) " +firebet.name+"��(��) �����߽��ϴ�.\n"+firebet.name+"�� hp�� "+hit+" ��ҽ��ϴ�.\n");
		
			if(firebet.hp <= 0){
				System.out.println(firebet.name +"�� hp�� 0�� �Ǿ� �׾����ϴ�.\n");
				return true;
			}
		}
		return false;
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
