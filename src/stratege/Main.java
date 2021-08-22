package stratege;

import strategeEx.FlyYes;
import strategeEx.LazerSword;
import strategeEx.MissileYes;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("super 로봇을 만들어 주세요");
		
		Robot sup= new Super();
		sup.shape();
		sup.actionWalk();
		sup.actionRun();
		
		//set으로 객체를 생성해서 할당해줘서 기능 지정해줌
		sup.setFly(new FlyYes());// 이 경우에 FlyYes클래스에서 만들어진 객체가 setFly 메서드에 할당되었으므로 sup 객체의 actonFly는 FlyYes 클래스의 fly메서드가 실행됨
		sup.actionfly();
		
		sup.setMissile(new MissileYes());
		sup.actionMissile();
		
		sup.setSword(new LazerSword());
		sup.actionSword();

		//후에 기능을 바꾸려면 새로 set함수로 객체 할당해주면 됨
	}

}
