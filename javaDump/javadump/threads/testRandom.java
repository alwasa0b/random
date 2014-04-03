import java.util.Random;


public class testRandom {
	Random rnd;
	int num;
	public testRandom() {
		// TODO Auto-generated constructor stub
		rnd=new Random();
	
		for (int i = 20;i>0;i--){
			num = rnd.nextInt(5);
			System.out.println(num);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new testRandom();

	}

}
