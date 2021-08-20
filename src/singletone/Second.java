package singletone;

public class Second {

	public Second(){
		
		Singleton singleton= Singleton.getSingleton();
		System.out.println("Second class");
		System.out.println("i="+singleton.getI());
	}
}
