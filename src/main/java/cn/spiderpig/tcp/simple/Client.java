package cn.spiderpig.tcp.simple;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {

		Socket socket = new Socket("127.0.0.1", 8888);

		OutputStream os = socket.getOutputStream();
		PrintWriter pw = new PrintWriter(os);
		pw.write("hello server");
		pw.flush();
		socket.shutdownOutput();

		InputStream is = socket.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String data = br.readLine();
		while (data != null) {
			System.out.println("我是客户端，服务器说：" + data);
			data = br.readLine();
		}
		br.close();
		is.close();

		pw.close();
		os.close();
		socket.close();

	}

}
