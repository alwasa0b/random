package cpu;

public interface IProcess {
	
	/*get the id number of a cpu process*/
	int getID();
	void setID(int CPUTasks);
	
	/*get the IO burst of of a cpu process*/
	int getIO_time();
	void setIO_time(int CPUTasks);
	
	/*get the CPU burst of of a cpu process*/
	int getCPU_time();
	void setCPU_time(int CPUTasks);
	
	/*get the CPU wait time*/
	int getWaitTime();
	void setWaitTime(int CPUTasks);
	
	
	void setTask(CPUTasks CPUTasks);
	CPUTasks getTask();
}
