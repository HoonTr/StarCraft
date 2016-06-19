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
	
	public boolean attack(Marine marine){
		if(marine.getHp()<=0){
			System.out.println("���̻� ������ �� �����ϴ�.");
		}else{
			marine.setHp(marine.getHp()-hit);
			System.out.println(this.name +"��(��) " +marine.name+"��(��) �����߽��ϴ�.\n"+marine.name+"�� hp�� "+hit+" ��ҽ��ϴ�.\n");
		
			if(marine.getHp() <= 0){
				System.out.println(marine.name +"�� hp�� 0�� �Ǿ� �׾����ϴ�.\n");
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
