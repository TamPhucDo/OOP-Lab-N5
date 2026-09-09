public class Ex1
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Ex1 ex1 = new Ex1();
		try {
			System.out.println(ex1.divide(10, 0));
		} catch (NumberOutofRangeException | ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println(ex1.multiply(1001, 2));
		} catch (NumberOutofRangeException e) {
			System.out.println(e.getMessage());
		}
	}
	public static  void checkRange(int a,int b) throws NumberOutofRangeException{
	    if (a < -1000 || a > 1000 || b < -1000 || b > 1000) {
	        throw new NumberOutofRangeException("Out of Range");
	    }
	}
	public static double divide(int a, int b) throws NumberOutofRangeException, ArithmeticException {
        checkRange(a,b);
        if(b ==0) {
            throw new ArithmeticException("divide by zero");
        }
        return a/b;
	}
	public double multiply(int a, int b) throws NumberOutofRangeException {
	     checkRange(a,b);
	     return a*b;
	}
}
