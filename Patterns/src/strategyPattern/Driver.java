package strategyPattern;

public class Driver {
	public static void main(String[] args) {
	      Context context = new Context(new Addtion());		
	      System.out.println("10 + 5 = " + context.dothemath(10, 5));

	      context = new Context(new Substract());		
	      System.out.println("10 - 5 = " + context.dothemath(10, 5));

	      context = new Context(new Multiplication());		
	      System.out.println("10 * 5 = " + context.dothemath(10, 5));
	   }
}
