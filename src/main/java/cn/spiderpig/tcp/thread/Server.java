package cn.spiderpig.tcp.thread;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket=new ServerSocket(8888);
			Socket socket=null;
			int count=0;
			System.out.println("服务器启动，开始监听");
			while(true){
				socket=serverSocket.accept();
				ServerThread serverThread=new ServerThread(socket);
				serverThread.setPriority(4);
				serverThread.start();
				
				count++;
				System.out.println(count);
				InetAddress address=socket.getInetAddress();
				System.out.println(address.getHostAddress());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
