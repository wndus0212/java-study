package singletone;

public class First {
	public First() {
		
		
		Singleton singleton= Singleton.getSingleton(); 
		// singleton�� private�̶� �ܺο��� ������ �� �����Ƿ� getsingleton���� ������
		
		System.out.println("First class");
		System.out.println("i="+singleton.getI());
		singleton.setI(200);
		System.out.println("i="+singleton.getI());
	}

}
