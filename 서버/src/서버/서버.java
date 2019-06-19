import java.awt.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class CalculationServerFrame extends JFrame {
		private JTextArea log = new JTextArea();
		public CalculationServerFrame(){
			super("��Ƽ������ ��� ����");
			setSize(250, 250);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// (X)�� Ŭ���ϸ� ���α׷� ����
			Container c =getContentPane();
			c.add(new JLaber("��� ���� �Դϴ�"));
			c.add(new JScrollPane(log), BorderLayout.CENTER);
			setVisible(true);
			
			new ServerThread().start();
		}
		
		class ServerThread extends Thread{
			@Override
			public void run(){
				ServerSocket listener = null;
				Socket socket = null;
				try{
						listener = new ServerSocket();
						log.append("Ŭ���̾�Ʈ �����\n");
						new ServiceThread(socket).start();
				}
				
			}catch (IOException e) {
				e.printStackTrace();
			}
			
			try{
					if(listener != null)
				 	listener.close();
					if(socket != null)
						socket.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
}
		
			
				
				
				
				
				
				
				
			
				
				
				
	
		
		
				
