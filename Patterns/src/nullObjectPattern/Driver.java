package nullObjectPattern;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractCustomer customer1 = CustFactory.getCustomer("Tammy");
		AbstractCustomer customer2 = CustFactory.getCustomer("Sammy");
		AbstractCustomer customer3 = CustFactory.getCustomer("Tanni");
		AbstractCustomer customer4 = CustFactory.getCustomer("Fammi");
		System.out.println("Customers");
	    System.out.println(customer1.getName());
	    System.out.println(customer2.getName());
	    System.out.println(customer3.getName());
	    System.out.println(customer4.getName());

	}

}
