package Cube;

import java.io.IOException;
import java.util.Scanner;

public class Cube {

	
	private double length;
	private double width;
	
	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setLength(double length) throws CubeException{
		if(length <= 0) {
			throw new CubeException("length no 0 or negative");
		} else {
		this.length = length;
	
		}
	}
	public Cube() {
		
	}
	
	public Cube(double length, double width) throws CubeException{
		if(length < 0) {
			throw new CubeException(" no 0 or negative");
		} else {
			this.length = length;
			
			this.width=width;
		}
	}
	
	public double Volume() {
		double v = 0;
		v = length * width;
		return v;
	}
	
	

}
