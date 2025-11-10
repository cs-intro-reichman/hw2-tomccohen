	// Demonstrates the Collatz conjecture.

import javax.print.DocFlavor.STRING;

public class Collatz {
		public static void main(String args[]) {
			int num = Integer.parseInt(args[0]);
			String mode = args [1];
			if (mode.equals("v")){

			for (int line = 1; line <= num; line++ ){ 
				int n = line;
				int stepsTillOne = 1;
				System.out.print(n + " ");
					if (n % 2 == 1){
						n = n * 3 + 1;
					}else {
						n = n / 2;
					}
					System.out.print(n + " ");
					stepsTillOne++;
					
				while ( n > 1 ){
					if (n % 2 == 0){
					n = n / 2;
					} else {
					n = n * 3 + 1;
					} 
					System.out.print(n + " ");
					stepsTillOne++;
				}
					System.out.print("(" + stepsTillOne + ")");
					System.out.println();
			}
					System.out.println("Every one of the first " + num + " hailstone sequences reached 1");

					
		} if (mode.equals("c")) {

			for (int line = 1; line <= num; line++ ){ 
				int n = line;
					if (n % 2 == 1){
						n = n * 3 + 1;
					}else {
						n = n / 2;
					}
					
				while ( n > 1 ){
					if (n % 2 == 0){
					n = n / 2;
					} else {
					n = n * 3 + 1;
					} 
				}
			}
					System.out.println("Every one of the first " + num + " hailstone sequences reached 1");
		}
		}
	}

