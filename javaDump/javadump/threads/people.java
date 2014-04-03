import java.util.ArrayList;
import java.util.Random;


public class people {
	Random rnd= new Random();
	boolean licens=rnd.nextBoolean();
	int num;
	
	public people(int num) {
		// TODO Auto-generated constructor stub
		this.num=num;
		
	}

	public long frac(int i){
		if (i<=1) return i;
	    return frac(i-1) + frac(i-2);
	}
	
	//@Override
	public void run() {
		System.out.println(this.frac(num));
		
	}

}
