package java18interface;

public class Robot implements Move, Missile{
	
	

	public Robot() {
		System.out.println("�κ��Դϴ�");
		canMove();
		canMissile();
	}
	
	@Override
	public void canMissile() {
		System.out.println("�̻����� �߻��մϴ�");
	}

	@Override
	public void canMove() {
		System.out.println("�����Դϴ�");
		
	}

}
