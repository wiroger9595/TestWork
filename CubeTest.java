package Cube;

import java.util.Scanner;

public class CubeTest {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		
		
		 
		try {
				Cube cu = new Cube(-50.00, -15.00);
				cu.setLength(2);
				System.out.println(cu.Volume());
		} catch (CubeException ee) {
			ee.printStackTrace();
		}
		
	}

}
