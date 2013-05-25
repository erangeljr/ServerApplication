import java.net.*;
import java.io.*;


public class Server {
	
	//Output Stream to Client
	private ObjectOutputStream output;
	//Input Stream from Client
	private ObjectInputStream input;
	//ServerSocket
	private ServerSocket server;
	//Connection to Client
	private Socket connection;
	private int counter = 1;

}
