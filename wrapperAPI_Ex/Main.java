package wrapperAPI_Ex;

public class Main {

	public static void main(String[] args) {
		Integer integer= new Integer(10);
		int i= integer.intValue();
		System.out.println("i="+i);
		
		String str= "123";
		int j= integer.parseInt(str);
		System.out.println(j+1);

	}

}
