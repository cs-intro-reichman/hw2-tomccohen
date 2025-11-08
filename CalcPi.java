// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int num = Integer.parseInt(args[0]);
		double sum = 0;
		for (int i = 0; i < num; i++){
			double fraction = (1.0 / (2 * i + 1));
			if (i % 2 == 0){
				sum += fraction;
			} else {
				sum -= fraction;
			}
		}
		double pi = Math.PI;
		System.out.println("pi according to JAVA: " + pi);
		System.out.println("pi, approximated:     " + sum * 4);
		}
	}
