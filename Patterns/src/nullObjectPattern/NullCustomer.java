package nullObjectPattern;

public class NullCustomer extends AbstractCustomer {

	public NullCustomer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isNull() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Not a customer";
	}

}
