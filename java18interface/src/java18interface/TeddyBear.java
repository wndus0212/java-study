package java18interface;

public class TeddyBear implements Move{

	public TeddyBear() {
		System.out.println("���Դϴ�");
		canMove();
	}
	
	@Override
	public void canMove() {
		System.out.println("�����Դϴ�");
		
	}

}
