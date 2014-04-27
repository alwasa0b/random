package cpu;

import java.util.Random;

public class User implements IUser, Runnable {
	Process newProcess;
	int wait_time;
	int CPU_time;
	int IO_time;
	TaskManger task;
	
	public User() {
		startProcess(CPU_time,IO_time);
	}
	
	public User(TaskManger task) {
		this.task=task;
		startProcess(CPU_time,IO_time);
		
	}

	@Override
	public void startProcess(int CPU_time, int IO_time ) {
		// TODO Auto-generated method stub
		newProcess = new Process();
		CPU_time = new Random().nextInt(50)+1;
		IO_time = new Random().nextInt(50)+1;
		wait_time = new Random().nextInt(1000);
		this.newProcess.setCPU_time(CPU_time);
		this.newProcess.setIO_time(IO_time);
		this.task.addProcess(this.newProcess());
		
	}

	@Override
	public Process newProcess() {
		// TODO Auto-generated method stub
		return newProcess;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =100;i>0;i--)
			
				startProcess(CPU_time,IO_time);
			
				
		
	}
	public static void main(String[] args) {
		
		
		Runnable task = new TaskManger();
		Thread t = new Thread(task);
		t.start();
		
		User user = new User((TaskManger)task);
		
		Thread u = new Thread(user);
		
		
		u.start();
		
		
		
		
	}

}
