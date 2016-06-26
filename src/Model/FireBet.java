package Model;

public class FireBet extends Unit{

	public FireBet(String name){
		super(130,10,name);
		this.name=name;
	}

	
	public void state(){
		
		System.out.println(this.name+"(���̾)�� ü���� "+this.hp+"�Դϴ�."
				+ "("+ location.getX()+","+location.getY()+")"+"  [���ݷ�:"+this.hit+"]");
	}
	public void attack(Unit unit){
		double num = this.location.distance(unit.location);
		if(num>=3){
			System.out.println("�Ÿ��� �־� ������ �� �����ϴ�");
		}else{
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
	}
}
