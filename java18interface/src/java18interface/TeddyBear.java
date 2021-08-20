package java18interface;

public class TeddyBear implements Move{

	public TeddyBear() {
		System.out.println("곰입니다");
		canMove();
	}
	
	@Override
	public void canMove() {
		System.out.println("움직입니다");
		
	}

}
