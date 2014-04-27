package cpu;
import java.util.Random;

public interface IUser {
	
	/*start a process
	CPU Time required
	IO Time required 
	Wait time*/
	
	void startProcess(int CPU_time,int IO_time);
	
	/*return this.process for a new process
	 * */
	Process newProcess();
	
}
