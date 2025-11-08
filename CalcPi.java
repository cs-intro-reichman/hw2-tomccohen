// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int num = Integer.parseInt(args[0]);
		double sum = 0;

		for (int i = 0; i < num; i++){
			double fraction = (1.0 / (2 * i + 1));

			if (i % 2 == 0){
				sum += fraction; //calculate the sum of odds
			} else {
				sum -= fraction; //calculate the sum  of evens
			}
		}
		double pi = Math.PI;
		System.out.println("pi according to Java: " + pi);
		System.out.println("pi, approximated:     " + sum * 4);
		}
	}
