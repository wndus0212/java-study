package stringAPI_Ex;

import java.util.Calendar;

public class Main03 {//Calendar 의 메서드

	public static void main(String[] args) {
		Calendar c= Calendar.getInstance();

		int year= c.get(Calendar.YEAR);
		int month= c.get(Calendar.MONTH);// 프로그램에서는 0월에서 11일까지 있음
		int day= c.get(Calendar.DAY_OF_MONTH);
		int hour= c.get(Calendar.HOUR_OF_DAY);
		int minute= c.get(Calendar.MINUTE);
		int second= c.get(Calendar.SECOND);

		System.out.println(year+"년"+ month+"월"+ day+"일" 
				+ hour+"시"+minute+"분"+second+"초");
	

	}

}
