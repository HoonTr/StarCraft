package Model;

public class Marine extends Unit{

	public Marine(String name){
		super(100,10,name);
		this.name=name;
		
	}
	
	public void state(){
	
		System.out.println("����:" + this.name+"�� ü���� "+this.hp+"�Դϴ�."
				+ "");
		System.out.println("������ ���� ��ġ�� ("+ 
				location.getX()+","+location.getY()+") �Դϴ�");
		
		
		
	}
}
