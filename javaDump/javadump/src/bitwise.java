
public class bitwise {
	
	long bitString=0;
	
	public bitwise(String s) {
		int ones=0;
		// TODO Auto-generated constructor stub
		for(int i=s.length()-1,c=0;i>=0;i--){
		
			if(s.charAt(i)=='f'||s.charAt(i)=='F'){
			
			}
			
			else {
				bitString^=(1<<c);
			}
			c++;
			
			
		
		}
		System.out.println(bitString);
		long a=1001;
		
		//System.out.println(a);
		
		
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "tffffff";
		String s2 = "ftfffff";
		String s3 = "fftffff";
		String s4 = "ffftfff";
		new bitwise(s1);
		new bitwise(s2);
		new bitwise(s3);
		new bitwise(s4);

	}

}
