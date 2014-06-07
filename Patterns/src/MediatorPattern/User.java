package MediatorPattern;

public class User {

	public String name;
	User(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public void sendMessege(String s){
		ChatRoom.displayMess(this, s);
	}
}
