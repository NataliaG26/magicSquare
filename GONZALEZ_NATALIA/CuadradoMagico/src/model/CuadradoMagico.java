package model;

import Exceptions.IncorrectInformation;

public class CuadradoMagico {
	
	private int[][] size;
	private char start;
	private String orientation;
	private boolean right;
	
	public final static String NE = "NE";
	public final static String SE = "SE";
	public final static String NO = "NO";
	public final static String SO = "SO";
	
	public final static char A = 'a';
	public final static char B = 'b';
	public final static char C = 'c';
	public final static char D = 'd';
	
	public CuadradoMagico(String size, String start, String orientation) throws IncorrectInformation {
		
		try {
			int sSize = Integer.parseInt(size);
			if(sSize == 1 || sSize == 2 || sSize == 0 || (double)sSize/2 == sSize/2 ) {
				throw new IncorrectInformation("El tamaño no es posible");
			}else {
				this.size = new int[sSize][sSize];
			}
			
			char sStart = start.charAt(0);
			if( !(sStart == A | sStart == B | sStart == C | sStart == D )) {
				throw new IncorrectInformation("El punto de inicio no es valido");
			}else {
				this.start = sStart;
			}
			
			if( !(orientation.equals(NE) | orientation.equals(NO) | orientation.equals(SE) | orientation.equals(SO)) ) {
				throw new IncorrectInformation("La orientacion no es posible");
			}else {
				this.orientation = orientation;
			}
			
			right = true;
		}catch(RuntimeException runtimeException) {
			right = false;
			
		}catch(IncorrectInformation incorrectInformation) {
			right = false;
		}
	}
	
	public boolean getRight() {
		return right;
	}
	
	public int[][] cuadrado(){
		
		int n = 0;
		int m = 0;
		int r = 0;
		switch(orientation) {
			case NE:
				n = -1;
				m = 1;
				r = 1;
				break;
			case SE:
				n = 1;
				m = 1;
				r = -1;
				break;
			case NO:
				n = -1;
				m = -1;
				r = 1;
				break;
			case SO:
				n = 1;
				m = -1;
				r = -1;
				break;
		}
		
		int i = 0;
		int j = 0;
		switch(start) {
			case A:
				i = 0;
				j = size.length/2;
				break;
			case B:
				i = size.length/2;
				j = 0;
				break;
			case C:
				i = size.length/2;
				j = size.length-1;
				break;
			case D:
				i = size.length-1;
				j = size.length/2;
				break;
		}
		size[i][j] = 1;
		int s = size.length*size.length;
		for(int num = 2; num <= s; num++) {
			int a = n+i;
			int b = m+j;
			if(a < 0) {
				a = size.length -1;
			}if(b > size.length -1) {
				b = 0;
			}if(a > size.length -1) {
				a = 0;
			}if(b < 0) {
				b = size.length -1;
			}
			
			if(size[a][b] == 0) {
				size [a][b] = num;
				i = a;
				j = b;
			}else {
				i +=r;
				if(i<0) {
					i = size.length -1;
				}else if(i>size.length-1) {
					i = 0;
				}
				size[i][j] = num;
			}
		}	
		return size;
	}
	

}
