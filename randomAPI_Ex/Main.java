package randomAPI_Ex;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
	
		double d=Math.random(); //doubleŸ���� ������ ���� �߻���Ŵ
		System.out.println(d);
		
		int di= (int)(d*10);
		System.out.println(di);
		
		Random random= new Random();
		int i= random.nextInt(100); //100 ������ ������ ������ ����
		System.out.println(i);
		

	}

}
