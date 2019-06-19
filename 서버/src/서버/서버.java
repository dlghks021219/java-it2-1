import java.awt.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class CalculationServerFrame extends JFrame {
		private JTextArea log = new JTextArea();
		public CalculationServerFrame(){
			super("멀티스레드 계산 서버");
			setSize(250, 250);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// (X)을 클릭하면 프로그램 종료
			Container c =getContentPane();
			c.add(new JLaber("계산 서버 입니다"));
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
						log.append("클라이언트 연결됨\n");
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
		
			
				
				
				
				
				
				
				
			
				
				
				
	
		
		
				
