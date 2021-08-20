package singletone;

public class Singleton {
	//객체는 heap 메모리에, static 변수는 데이터 영역 메모리에 들어감
	private static Singleton SINGLETON_CLASS_INSTANCE= new Singleton(); 
	//SINGLETON_CLASS_INSTANCE 변수에는 singleton 클래스 객체가 만들어진 주소의 값이 저장되어 있음
	
	public int i= 100;
	
	private Singleton() {
		
	}
	
	public static  Singleton getSingleton() {//처음 first 나 second 클래스가 호출되면 실행됨. 처음에는 생성된 객체가 없으므로 객체를 생성함
		// static 이므로 first에서 getsingleton으로 객체가 생성되면 second에도 적용됨
		if(SINGLETON_CLASS_INSTANCE==null) { //객체가 생성되지 않았다면 객체를 생성해서 할당함
			SINGLETON_CLASS_INSTANCE= new Singleton();
		}
		
		return SINGLETON_CLASS_INSTANCE;
	}
	
	public int getI() {
		return i;
	}
	
	public void setI(int i) {
		this.i=i;
	}
}
