package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	private int state;
	
	public int getState(){
		return state;
	}
	
	public void setState(int state){
		this.state = state;
		notifyAllObserver();
	}
	
	public void attach(Observer observer){
		observers.add(observer);
	}

	private void notifyAllObserver() {
		// TODO Auto-generated method stub
		for(Observer obs: observers){
			obs.update();
		}
		
	}

}
