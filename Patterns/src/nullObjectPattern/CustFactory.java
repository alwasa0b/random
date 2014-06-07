package nullObjectPattern;

public class CustFactory {

	public static final String[] names={"Tammy","Yammy","Sammy","Sarry","Yanni"};
	public static AbstractCustomer getCustomer(String name){
		for(String n: names){
			if(n.equalsIgnoreCase(name))
			return new RealCustomer(name);
		}
		return new NullCustomer();
		
	}
}
