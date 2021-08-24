package scannerAPI_Ex;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		//int i= scanner.nextInt();
		//System.out.print("i="+i);
		
		String str2= scanner.nextLine();
		System.out.println("str2="+str2);
		
		String str1= scanner.next();
		System.out.println("str="+str1);
		
		//String str2= scanner.nextLine();// 바로 전 출력에서 나온 \n을 인식하고 스캔을 끝내버림
		//System.out.println("str2="+str2);

	}

}
