package Model;

public class FireBet extends Unit{

	public FireBet(String name){
		super(130,10,name);
		this.name=name;
	}

	
	public void state(){
		
		System.out.println("���̾:"+this.name+"�� ü���� "+this.hp+"�Դϴ�."
				+ "");
		System.out.println("���̾�� ���� ��ġ�� ("+ 
				location.getX()+","+location.getY()+") �Դϴ�");
	}
}
