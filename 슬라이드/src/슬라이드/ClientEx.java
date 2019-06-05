package 슬라이드;

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
				System.out.print("보내기>>");
				String outputMessage = scanner.nextLine();
				if (outputMessage.equalslgnoreCase("bye")) {
					out.write(outputMessage+"|n");
					out.flush();
					break:
				}
				out.write(outputMessage + "|n");
				out.flush();
				String inputMessage = in.readLine();
				System.out.print("서버:"+inputMessage);
			}
		}catch (IOExceptionf e){
			System.out.print(e.getMessage());
		}finally {
			try{
				scanner.close();
				if(socket !=null) socket.close();
			}catch (IOException e){
				System.out.print("서버와 채팅 중 오류가 발생했습니다.");
			}
		} 
    }
}