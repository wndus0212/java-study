package randomAPI_Ex;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
	
		double d=Math.random(); //double타입의 임의의 수를 발생시킴
		System.out.println(d);
		
		int di= (int)(d*10);
		System.out.println(di);
		
		Random random= new Random();
		int i= random.nextInt(100); //100 이하의 정수형 난수를 만듬
		System.out.println(i);
		

	}

}
