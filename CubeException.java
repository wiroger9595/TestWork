package Cube;

import java.io.IOException;

public class CubeException extends Exception{
	
public CubeException(String msg) {
		// TODO Auto-generated constructor stub
	super(msg);
	}

	//	try {
//		System.out.println("it is right value");
//	} catch(NumberFormatException e) {
//		e.printStackTrace();
//	} 
	public void printStrs(int i) throws Exception {
		System.out.println(" wrong ");
	}
	
	public void triangle() throws IOException{
		System.out.println("sent msg");
	}
}

