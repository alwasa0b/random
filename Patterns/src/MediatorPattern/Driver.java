package MediatorPattern;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User Tammy = new User("Tammy");
		User John = new User("John");
		Tammy.sendMessege("Hi John");
		John.sendMessege("I love you Tammy");
	}

}
