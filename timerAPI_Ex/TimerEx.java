package timerAPI_Ex;

import java.util.Timer;
import java.util.TimerTask;

public class TimerEx {

	public TimerEx() throws InterruptedException{
		System.out.println("@=^0^@>");
		
		Timer timer= new Timer(true);	//true= ���α׷��� �� �����ϰ� ���� �����϶�
		TimerTask t1= new TimerTask1();
		TimerTask t2= new TimerTask2();
		
		timer.schedule(t1, 2000);	//2���� ����
		timer.schedule(t2, 5000);	//5���� ����
		
		Thread.sleep(10000);
		System.out.println("^^");
	}
}
