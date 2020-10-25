package finalActivity;

import java.util.ArrayList;

public class FibonnaciActivity {

	public static void main(String[] args) {
		int length=10;
		ArrayList<Integer> fibo=new ArrayList<Integer>();
		fibo.add(0);
		fibo.add(1);
		for(int i=0; i<length; i++) {
			if(i<1) {
				System.out.print(fibo.get(i)+" ");
			}
			else {
				fibo.add(fibo.get(i)+fibo.get(i-1));
				System.out.print(fibo.get(i)+" ");
			}
		}
	

	}

}
