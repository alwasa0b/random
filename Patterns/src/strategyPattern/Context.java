package strategyPattern;

public class Context {
	MathOperation math;
	public Context(MathOperation math){
		this.math=math;
	}
	public int dothemath(int num1,int num2){
		return math.operate(num1, num2);
	}
}
