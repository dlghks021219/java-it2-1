import java.io.*;
import java.net.*;
import java.util.*;

public class CalcServerEx {
	public static String calc(String exp){
		StringTokenizer st = new StringTokenizer(exp, "");
		if (st.countTokens() != 3)return "error";
		String res="";
		int op1 = lnteger.parselnt(st.nextToken());
		String opcode = st.nextToken();
		int op2 = lnteger.parselnt(st.nextToken());
		switch (opcode){
		case "+": res = lnteger.toString(op1 + op2);
			break;
		case "-": res = lnteger.toString(op1 - op2);
			break;
		case "*": res = lnteger.toString(op1 * op2);
			break;
		default : res = "error";
	}
	return res;
}

public static void main(String[] args) {
	BufferedReader in = null;
	BufferedWriter out = null;
	ServerSocket listener = null;
	Socket socket = null;

	try {
		listener = new ServerSocket(9999);
		System.out.println("������ ��ٸ��� �ֽ��ϴ�.......");
		socket = listener.accept();
		System.out.println("����Ǿ����ϴ�.");
		in = new BufferedReader(
		   new lnputStreamReader(socket.getlnputStream());
		out = new BufferedWriter(
		   new OutputStreamWriter(socket.getOutputStream()));
		while (true){
			String inputMessage = in.readLine();
			if (inputMessage.equalslgnoreCase("bye")) {
				System.out.print("Ŭ���̾�Ʈ���� ������ �����Ͽ���");
				break:
			}
			System.out.println(inputMessage);
			String res = calc(inputMessage);
			out.flush();
		}
	} catch (IOException e) {
		System.out.Println(e.getMessage());
	} finally {
		try {
			if(socket != null) socket.close();
			if(listener != null)listener.close();
		} catch (IOException e) {
			System.out.print("Ŭ���̾�Ʈ�� ä�� �� ������ �߻��߽��ϴ�.");
		}
	}
}
				
	
	
	
	
	
	
	
	
	
	
	}
	
	}