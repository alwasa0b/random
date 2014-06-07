package iteratorPattern;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NameRepository n = new NameRepository();
		for(Iterator iter = n.getIterator();iter.hasNext();){
			String name = (String) iter.next();
			System.out.println("name: "+name);
		}

	}

}
