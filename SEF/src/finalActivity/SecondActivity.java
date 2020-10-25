package finalActivity;

public class SecondActivity {
	public static void main(String args[]) {
		double x= 25;
		double y= 43;
		double[] array= {4, 13, 24, -21, 13};
		SecondActivity calculator=new SecondActivity();
		System.out.println(calculator.addition(array));
		System.out.println(calculator.multiplication(array));
		System.out.println(calculator.division(x, y));
		System.out.println(calculator.subtraction(x, y));
		
		
		
	}
	
	public double addition(double[] storage){
		double result=0;
		for(int i=0; i<storage.length; i++) {
			result=result+storage[i];
		}
		return result;
	}
	public double subtraction(double x, double y) {
		return x-y;
	}
	public double division(double x, double y) {
		if(x==0 ||y==0) return 0;
		else return x/y;
	}
	public double multiplication(double [] storage) {
		double result=1;
		for(int i=0; i<storage.length; i++) {
			result=result*storage[i];
		}
		return result;
	}
}
