package java18interface;

public class AirPlane implements Light, Missile {

	public AirPlane() {
		System.out.println("뱅기입니다");
		canLight();
		canMissile();
	}

	@Override
	public void canMissile() {
		System.out.println("미사일을 발사합니다");
		
	}

	@Override
	public void canLight() {
		System.out.println("불빛을 발사합니다");
		
	}

}
