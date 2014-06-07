package nullObjectPattern;

public class RealCustomer extends AbstractCustomer {

	public RealCustomer(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}

	@Override
	public boolean isNull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
