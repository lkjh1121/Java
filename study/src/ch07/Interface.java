package ch07;
/*
 * ��¥ : 2022/01/06
 * �̸� : ������
 * ���� : �ڹ� �������̽� �ǽ��ϱ� ���� p228
 */
public class InterfaceTest {
	
	public static void main(String[] args) {
	
		// �������̽��� ���� Ŭ���� ���� ����
		RemoteControl 1g 		= new RemoteLG();
		RemoteControl sumsung 	= new RemoteSamsung();
		
		lg.powerOn();
		lg.chDown();
		lg.soundDown();
		lg.powerOff();
		
		
		samsung.powerOn();
		samsung.chDow();
		samsung.SoundDown();
		samsung.powerOff();
		
	// �������̽��� �̿��� ���յ� ��ȭ	
	Bulb bulb = new Bulb();
	Socket socker = new Cable(bulb);
	
	socket.switchOn();
	socket.switchOff();

		}
	}
