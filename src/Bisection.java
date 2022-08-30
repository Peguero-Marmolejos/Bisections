
public class Bisection {
	public static void main(String args[]) {
		double j = bisection(0.00001,0.00001, 0.0, 3.0);
		System.out.println(f(0.4895));
		System.out.println(f(2));
	System.out.println(f(j));

	}
	public static double f(double x) {
		return Math.pow(x*x*x+ x*x - 3*x+0.8+0.160314,.46289567164)
				;
	}
	
	public static double bisection(double tol_x,double tol_y, double a, double b) {
		if(f(a)==0) { System.out.println("\nThe answer is : " + a);return a;}
		if(f(b)==0) { System.out.println("\nThe answer is : " + b);return b;}
		if(f(a)< 0 && f(b)<0 ||f(a)>0 && f(b)>0) {System.out.println("\nThese are not valid bounds."); return-0.999999999;}
		double c = 0.0;
		int steps = 0;
		while(Math.abs(b-a)> tol_x) {
			c = (a+b)/2;
			steps++;
			System.out.println("Step " + steps + "a is : " + a);
			System.out.println("fa is : " + f(a));

			System.out.println("Step " + steps + "b is : " + b);
			System.out.println("fb is : " + f(b));

			System.out.println("Step " + steps + "c is : " + c);
			System.out.println("fc is : " + f(c));

			if(Math.abs(f(c))<= tol_y) {
				System.out.println("The answer is : " + c);
				return c;
			}
			else if((f(c)< 0 && f(b)<0) || (f(c)>0 && f(b)>0)){
				b=c;
			}
			else if((f(c)< 0 && f(a)<0) || (f(c)>0 && f(a)>0)){
				a=c;
			}
		}
		return c;

	}
}
