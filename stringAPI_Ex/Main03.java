package stringAPI_Ex;

import java.util.Calendar;

public class Main03 {//Calendar �� �޼���

	public static void main(String[] args) {
		Calendar c= Calendar.getInstance();

		int year= c.get(Calendar.YEAR);
		int month= c.get(Calendar.MONTH);// ���α׷������� 0������ 11�ϱ��� ����
		int day= c.get(Calendar.DAY_OF_MONTH);
		int hour= c.get(Calendar.HOUR_OF_DAY);
		int minute= c.get(Calendar.MINUTE);
		int second= c.get(Calendar.SECOND);

		System.out.println(year+"��"+ month+"��"+ day+"��" 
				+ hour+"��"+minute+"��"+second+"��");
	

	}

}
