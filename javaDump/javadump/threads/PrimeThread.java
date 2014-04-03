import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;


public class PrimeThread implements Runnable{
	int start;
	int stop;
	String file;
	boolean lead = false;
	
	public PrimeThread(int start, int stop, String fileName,boolean isLead) {
		// TODO Auto-generated constructor stub
		this.start=start;
		this.stop=stop;
		this.file=fileName;
		this.lead=isLead;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean isPrime(int toTest){
		if(toTest==2) return true;
		for (int n =3 ; n < toTest; n+=2){
			if (toTest%n==0) {return false;}
			
		}return true;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for(int i=start;i<=stop;i+=2){
			if(isPrime(i)) {primes.add(i);}
			if(lead && (i+1)%10000==0){ System.out.println(i+"/"+stop);}
		}
		try{
			PrintWriter w = new PrintWriter(new File(file));
			for (int i = 0 ; i <primes.size(); i++){ w.println(primes.get(i));}
			w.close();
		}catch(Exception e){
			
		}
		
	}

}
