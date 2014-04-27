package cpu;

public class Process implements IProcess {
	private CPUTasks CPUTasks;
	private static int id;
	Process(){
		
		this.CPUTasks=new CPUTasks();
		this.CPUTasks.id=id;
		id++;
	}
	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return CPUTasks.id;
	}

	@Override
	public void setID(int CPUTasks) {
		// TODO Auto-generated method stub
		this.CPUTasks.id=CPUTasks;

	}
	public String toString() {
	    return getID()+" "+getIO_time()+" "+getCPU_time()+" "+getWaitTime();
	}
	@Override
	public int getIO_time() {
		// TODO Auto-generated method stub
		return this.CPUTasks.IO_time;
	}

	@Override
	public void setIO_time(int CPUTasks) {
		// TODO Auto-generated method stub
		this.CPUTasks.IO_time=CPUTasks;

	}

	@Override
	public int getCPU_time() {
		// TODO Auto-generated method stub
		return this.CPUTasks.CPU_time;
	}

	@Override
	public void setCPU_time(int CPUTasks) {
		// TODO Auto-generated method stub
		this.CPUTasks.CPU_time=CPUTasks;

	}

	@Override
	public int getWaitTime() {
		// TODO Auto-generated method stub
		return this.CPUTasks.wait_time;
	}

	@Override
	public void setWaitTime(int CPUTasks) {
		// TODO Auto-generated method stub
		this.CPUTasks.wait_time=CPUTasks;

	}
	

	@Override
	public void setTask(cpu.CPUTasks CPUTasks) {
		// TODO Auto-generated method stub
		this.CPUTasks=CPUTasks;
		
	}

	@Override
	public cpu.CPUTasks getTask() {
		// TODO Auto-generated method stub
		return this.CPUTasks;
	}

}
