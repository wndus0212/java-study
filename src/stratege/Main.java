package stratege;

import strategeEx.FlyYes;
import strategeEx.LazerSword;
import strategeEx.MissileYes;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("super �κ��� ����� �ּ���");
		
		Robot sup= new Super();
		sup.shape();
		sup.actionWalk();
		sup.actionRun();
		
		//set���� ��ü�� �����ؼ� �Ҵ����༭ ��� ��������
		sup.setFly(new FlyYes());// �� ��쿡 FlyYesŬ�������� ������� ��ü�� setFly �޼��忡 �Ҵ�Ǿ����Ƿ� sup ��ü�� actonFly�� FlyYes Ŭ������ fly�޼��尡 �����
		sup.actionfly();
		
		sup.setMissile(new MissileYes());
		sup.actionMissile();
		
		sup.setSword(new LazerSword());
		sup.actionSword();

		//�Ŀ� ����� �ٲٷ��� ���� set�Լ��� ��ü �Ҵ����ָ� ��
	}

}
