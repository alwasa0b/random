import java.util.Arrays;


public class arrayClass extends Arrays{
	int [][] s;
	
	public arrayClass() {
	
		// TODO Auto-generated constructor stub
		s = new int[10][];
		for (int i= 0;i<s.length;i++){
			s[i]=new int[i];
			
		}
		
		
		System.out.println(s[6][4]);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new arrayClass();
	}

}
