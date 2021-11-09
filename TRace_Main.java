import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

//거북이 수에따라 쓰레드로 객체 생성해서 start()후에 결승선에 도착할 경우 stop() 시키기
//거북이 움직이는 알고리즘 만들기(이동,장애물)
//JPannel 이용해서 씬 추가 (1. 시작,거북이수 결정  2.게임 시작)

public class TRace_Main {
	
	public static void main(String[] args) {
		
		//메인프레임 생성
		RaceFrame21 frame = new RaceFrame21();
		frame.setLocation(100,100);
		frame.setSize(800,600);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false); 
		frame.addWindowListener(new WindowAdapter(){
			public void windowClosing (WindowEvent  e) {
				System.exit(1);
			}
		});
		
	}
	
}

@SuppressWarnings("serial")
class RaceFrame21 extends Frame implements ActionListener {
	//버튼
	Button startButton = new Button("시작");
	Button clearButton = new Button("초기화");
	
	//거북이 수 결정
	int Tcount;
	
	TRace_Thread ct = new TRace_Thread();
	Thread t = new Thread(ct,"거북이 움직임 쿨타임");

	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String str = e.getActionCommand();		
		if(str.equals("시작")){
			t.start();
		}
		else if(str.equals("초기화")){
			t.stop();
		}
		
	}

	 public RaceFrame21(){
		  super("거북이 경주 게임");
		  
		  //버튼 만들어 이벤 처리
		  setLayout(new BorderLayout());
		  startButton.addActionListener(this);
		  clearButton.addActionListener(this);
		  
		  Panel p = new Panel();
		  add("North",p);
		  p.add(startButton);
		  p.add(clearButton);
	 }
	 
}


