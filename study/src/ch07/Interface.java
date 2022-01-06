package ch07;
/*
 * 날짜 : 2022/01/06
 * 이름 : 김재현
 * 내용 : 자바 인터페이스 실습하기 교재 p228
 */
public class InterfaceTest {
	
	public static void main(String[] args) {
	
		// 인터페이스로 공통 클래스 구조 설계
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
		
	// 인터페이스를 이용한 결합도 완화	
	Bulb bulb = new Bulb();
	Socket socker = new Cable(bulb);
	
	socket.switchOn();
	socket.switchOff();

		}
	}
