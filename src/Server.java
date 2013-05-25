import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
	
	static Socket socket = null;
	static ServerSocket serverSocket = null; 

	public static void main(String argv[]){

		try{

			serverSocket = new ServerSocket(9999);
		}
		catch(IOException e){
			e.printStackTrace();
			return;
		}
			              

//		while(true){
//			socket = serverSocket.accept();
//			(new Thread (ServerAgent(socket))).start();
//
//		}	
	}

}
