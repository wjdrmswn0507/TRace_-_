import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

//�ź��� �������� ������� ��ü �����ؼ� start()�Ŀ� ��¼��� ������ ��� stop() ��Ű��
//�ź��� �����̴� �˰��� �����(�̵�,��ֹ�)
//JPannel �̿��ؼ� �� �߰� (1. ����,�ź��̼� ����  2.���� ����)

public class TRace_Main {
	
	public static void main(String[] args) {
		
		//���������� ����
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
	//��ư
	Button startButton = new Button("����");
	Button clearButton = new Button("�ʱ�ȭ");
	
	//�ź��� �� ����
	int Tcount;
	
	TRace_Thread ct = new TRace_Thread();
	Thread t = new Thread(ct,"�ź��� ������ ��Ÿ��");

	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String str = e.getActionCommand();		
		if(str.equals("����")){
			t.start();
		}
		else if(str.equals("�ʱ�ȭ")){
			t.stop();
		}
		
	}

	 public RaceFrame21(){
		  super("�ź��� ���� ����");
		  
		  //��ư ����� �̺� ó��
		  setLayout(new BorderLayout());
		  startButton.addActionListener(this);
		  clearButton.addActionListener(this);
		  
		  Panel p = new Panel();
		  add("North",p);
		  p.add(startButton);
		  p.add(clearButton);
	 }
	 
}


