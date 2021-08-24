package stringAPI_Ex;

public class Main {//String의 여러 메서드

	public static void main(String[] args) {
		String s1="qwerty";
		String s2= "ASDFGH";
		 
		System.out.println(s1.concat(s2));
		System.out.println(s1.substring(3));
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s1.charAt(3));
		System.out.println(s1.indexOf("q"));


		String s3= "zxcvbn";

		System.out.println(s1.equals(s3));



		String s4= "uio hjk bnm";

		System.out.println(s4.trim());



		System.out.println(s1.replace('q', 'a'));
		System.out.println(s1.replace("qwer", "asdf"));


	}

}
