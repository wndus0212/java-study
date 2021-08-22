package singletone;

public class First {
	public First() {
		
		
		Singleton singleton= Singleton.getSingleton(); 
		// singleton은 private이라 외부에서 접근할 수 없으므로 getsingleton으로 갸져옴
		
		System.out.println("First class");
		System.out.println("i="+singleton.getI());
		singleton.setI(200);
		System.out.println("i="+singleton.getI());
	}

}
