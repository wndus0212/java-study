package java18interface;

public class AirPlane implements Light, Missile {

	public AirPlane() {
		System.out.println("����Դϴ�");
		canLight();
		canMissile();
	}

	@Override
	public void canMissile() {
		System.out.println("�̻����� �߻��մϴ�");
		
	}

	@Override
	public void canLight() {
		System.out.println("�Һ��� �߻��մϴ�");
		
	}

}
