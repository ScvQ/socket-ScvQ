package cn.spiderpig.tcp.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	public static void main(String[] args) throws IOException{
		
		ServerSocket serverSocket = new ServerSocket(8888);
		Socket socket = serverSocket.accept();
		
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String data = br.readLine();
		while(data!=null){
			System.out.println("我是服务器，客户端说："+data);
			data = br.readLine();
		}
		socket.shutdownInput();
		
		OutputStream os = socket.getOutputStream();
		PrintWriter pw = new PrintWriter(os);
		pw.write("hello client");
		pw.flush();
		socket.shutdownOutput();
		pw.close();
		os.close();
		
		br.close();
		isr.close();
		is.close();
		socket.close();
		serverSocket.close();
		
	}

}
