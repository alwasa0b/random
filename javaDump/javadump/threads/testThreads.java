
public class testThreads implements Runnable{
	Thread []t= new Thread[5];
	people[]p=new people[5];
					
	
	public testThreads() {
		// TODO Auto-generated constructor stub
		
		t[1]=new Thread(this);{
			
			if(t[1]==null) t[1].start();t[1].start();
			p[1]=new people(55);
		};
		
		t[2]=new Thread(this);{
			
			if(t[2]==null) t[1].start();t[2].start();
			p[2]=new people(55);
		};
		
	
		t[3]=new Thread(this);{
			
			if(t[3]==null) t[1].start();t[3].start();
			p[3]=new people(55);
		};
		this.start();
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new testThreads();
	
	
	}
	
	public void start() {
		p[1].run();
		p[2].run();
		p[3].run();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	
		
	
		
	
		
	}

}
