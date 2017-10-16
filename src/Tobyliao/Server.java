package Tobyliao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String args[]) {
		//Define
		ServerSocket MyService = null;
		String line;
		DataInputStream input=null;
		PrintStream output=null;
		Socket clientSocket = null;
		
		//set up a server socket on 1024
		try {
			MyService = new ServerSocket(1024);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			//e.printStackTrace();
		}
	
		
		try {
			clientSocket = MyService.accept();
			input = new DataInputStream(clientSocket.getInputStream());
			output = new PrintStream(clientSocket.getOutputStream());
			while(true) {
				line = input.readLine();
	            output.println(line);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e);
		}

		
		
//		try {
//			output.close();
//			input.close();
//			clientSocket.close();
//			MyService.close();
//			
//			
//		}catch(IOException e) {
//			System.out.println(e);
//		}
		
		
		
		
	}
}
