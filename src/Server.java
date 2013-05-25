import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Server implements Runnable {
	
	//Output Stream to Client
	private ObjectOutputStream output;
	//Input Stream from Client
	private ObjectInputStream input;
	//ServerSocket
	private ServerSocket server;
	//Connection to Client
	private Socket connection;
	private int counter = 1;
	
	//Defautl Constructor
	public Server(Socket socket){
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
