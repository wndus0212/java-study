package singletone;

public class Singleton {
	//��ü�� heap �޸𸮿�, static ������ ������ ���� �޸𸮿� ��
	private static Singleton SINGLETON_CLASS_INSTANCE= new Singleton(); 
	//SINGLETON_CLASS_INSTANCE �������� singleton Ŭ���� ��ü�� ������� �ּ��� ���� ����Ǿ� ����
	
	public int i= 100;
	
	private Singleton() {
		
	}
	
	public static  Singleton getSingleton() {//ó�� first �� second Ŭ������ ȣ��Ǹ� �����. ó������ ������ ��ü�� �����Ƿ� ��ü�� ������
		// static �̹Ƿ� first���� getsingleton���� ��ü�� �����Ǹ� second���� �����
		if(SINGLETON_CLASS_INSTANCE==null) { //��ü�� �������� �ʾҴٸ� ��ü�� �����ؼ� �Ҵ���
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
