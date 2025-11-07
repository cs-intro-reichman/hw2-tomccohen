
public class Cheers {
        public static void main(String[] args) {
	    String word = args[0];
            int num = Integer.parseInt(args[1]);
            String upperWord = word.toUpperCase();
            int lengthWord = word.length();
            String spacielLetters = "AEFHILMNORSX";       
            for (int i = 0; i < lengthWord; i++) {
                char c = upperWord.charAt(i);
                if (spacielLetters.indexOf(c) == -1){
                        System.out.println("Give me a  " + c +": " + c +"!");

                } else {
                         System.out.println("Give me an " + c +": " + c +"!");
                }
                } 
                System.out.println("What does that spell?");
                for (int i = 0; i < num; i++) {
                        if (i < num){
                                 System.out.println(upperWord + "!!!");
                        }
                }
                

            }

        }

