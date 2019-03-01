package model;

public class CuadradosMagicos {
	
	private int[][] size;
	private char start;
	private String orientation;
	
	public final static String NE = "NE";
	public final static String SE = "SE";
	public final static String NO = "NO";
	public final static String SO = "SO";
	
	public final static char A = 'a';
	public final static char B = 'b';
	public final static char C = 'c';
	public final static char D = 'd';
	
	public CuadradosMagicos(int size, char start, String orientation) {
		this.size = new int[size][size];
		this.start = start;
		this.orientation = orientation;
	}
	
	
	
	
	

}
