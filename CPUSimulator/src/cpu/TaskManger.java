package cpu;

import java.util.ArrayList;

public class TaskManger implements ITaskManger, Runnable {
	
	ArrayList<IProcess> ProcessList;
	IProcess Process;
	
	
	TaskManger(){
		ProcessList = new ArrayList<IProcess>();
		
	
	}
	TaskManger(IProcess IProcess){
		ProcessList = new ArrayList<IProcess>();
		this.Process= IProcess;
		addProcess();
	}
	@Override
	public void addProcess() {
		// TODO Auto-generated method stub
		
		ProcessList.add(this.Process);

	}

	@Override
	public void removeProcess(IProcess c) {
		// TODO Auto-generated method stub
		ProcessList.remove(c);

	}
	@Override
	public void Processing() {
		// TODO Auto-generated method stub
		if(ProcessList.size()>0){
		for (int i=0;i<ProcessList.size();i++){
			ProcessingSingleProcess(ProcessList.get(i));
		}
		}
	}
	public void ProcessingSingleProcess(IProcess c) {
		// TODO Auto-generated method stub
		
		while(c.getCPU_time()>0){
			c.setCPU_time(c.getCPU_time()-1);
			for (int i=1;i<ProcessList.size();i++){
				ProcessList.get(i).setWaitTime(ProcessList.get(i).getWaitTime()+1);
			}
		}if (c.getCPU_time()==0){
			
			System.out.println(c);
			ProcessList.remove(c);
			
		}
	}
	
	
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true){
			Processing();
			
		}
		
		
	}
	@Override
	public void addProcess(IProcess c) {
		// TODO Auto-generated method stub
		ProcessList.add(c);
	}

	

}
