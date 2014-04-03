import java.util.ArrayList;


public class MainClass {

	public static int threadCount=4;
	public static int stop=800000;
	
	public MainClass() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("spannint thread..");
		int count =stop/threadCount;
		int start=1;
		ArrayList<Thread> t = new ArrayList<Thread>() ;
		for (int i = 0 ; i < threadCount;i++){
			if((i+1)!=count){ t.add(new Thread(new PrimeThread(start, start+count, String.valueOf(i), false))); start+=count;}
			else t.add(new Thread(new PrimeThread(start, start+count, String.valueOf(i), true)));
		}
		for (int i =0; i<t.size();i++) {t.get(i).start();}
		for (int i =0; i<t.size();i++){
			try {
				t.get(i).join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}
	}

}
