package java18interface;

public class Robot implements Move, Missile{
	
	

	public Robot() {
		System.out.println("로봇입니다");
		canMove();
		canMissile();
	}
	
	@Override
	public void canMissile() {
		System.out.println("미사일을 발사합니다");
	}

	@Override
	public void canMove() {
		System.out.println("움직입니다");
		
	}

}
