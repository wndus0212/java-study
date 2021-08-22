package stratege;


import strategeEx.IFly;
import strategeEx.IMissile;
import strategeEx.ISword;

public abstract class Robot {


	//모든 클래스에 있는 내용이므로 상위 클래스로 올림
	//어떤 기능이 올지 모르기 때문에 ㅓㅅㄴ언만 해놓음
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
	
	//set으로 객체에 할당된 메서드를 실행함
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
		System.out.println("걸을 수 있습니다");
	}
	
	public void actionRun() {
		System.out.println("달릴 수 있습니다");
	}
	
	
	public abstract void shape();
	
}
