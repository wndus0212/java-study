package stringAPI_Ex;

public class Main02 {//StringBuilder�� ���� �޼���

	public static void main(String[] args) {
		StringBuilder string= new StringBuilder("abcdefg");

		string.append("hijklmn");
		System.out.println(string);

		string.insert(3,"AAA");
		System.out.println(string);

		string.delete(3, 5);
		System.out.println(string);

		string.deleteCharAt(10);
		System.out.println(string);

	}

}
