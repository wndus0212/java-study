package stratege;


import strategeEx.IFly;
import strategeEx.IMissile;
import strategeEx.ISword;

public abstract class Robot {


	//��� Ŭ������ �ִ� �����̹Ƿ� ���� Ŭ������ �ø�
	//� ����� ���� �𸣱� ������ �ä����� �س���
	IFly fly;
	IMissile missile;
	ISword sword;
	
	
	public void setFly(IFly fly) {
		this.fly = fly;
	}

	public void setMissile(IMissile missile) {
		this.missile = missile;
	}

	public void setSword(ISword sword) {
		this.sword = sword;
	}

	
	public Robot() {
		// TODO Auto-generated constructor stub
	}
	
	//set���� ��ü�� �Ҵ�� �޼��带 ������
	public void actionSword() {
		this.sword.sword();
		
	}
	
	public void actionMissile() {
		this.missile.missile();

	}
	
	public void actionfly() {
		this.fly.fly();

	}
	
	public void actionWalk(){
		System.out.println("���� �� �ֽ��ϴ�");
	}
	
	public void actionRun() {
		System.out.println("�޸� �� �ֽ��ϴ�");
	}
	
	
	public abstract void shape();
	
}
