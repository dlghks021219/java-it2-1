package �����̵�;

import java.io.*;
import java.net.*;
import java.util.*;

public class ClientEx{
	public static void main(String[] args){
		BufferedReader in = null;
		BufferedWriter out = null;
		Scoket socket = null ;
		Scanner scanner = new Scanner(System.in);
		try{
			socket = new Scoket("Iocalhost", 9999);
			in = new BufferedReader(new lnputStreamReader(socket.getlnputStream()));
			out = new BufferedWWruter(new OutputStreamWriter(scoket.getOutputStream()));
			while (true){
				System.out.print("������>>");
				String outputMessage = scanner.nextLine();
				if (outputMessage.equalslgnoreCase("bye")) {
					out.write(outputMessage+"|n");
					out.flush();
					break:
				}
				out.write(outputMessage + "|n");
				out.flush();
				String inputMessage = in.readLine();
				System.out.print("����:"+inputMessage);
			}
		}catch (IOExceptionf e){
			System.out.print(e.getMessage());
		}finally {
			try{
				scanner.close();
				if(socket !=null) socket.close();
			}catch (IOException e){
				System.out.print("������ ä�� �� ������ �߻��߽��ϴ�.");
			}
		} 
    }
}