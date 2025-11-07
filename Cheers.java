// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code
            String name = args[0];
            name = name.toUpperCase();
            String anLetters = "AEFHILMNORSX";
            int numTimes = Integer.parseInt(args[1]);
            for (int i = 0; i < name.length(); i++) {
                char currentLetter = name.charAt(i);
                if(anLetters.indexOf(currentLetter) != -1){
                        System.out.println("Give me an " + currentLetter + ": " + currentLetter + "!");
                } else{
                        System.out.println("Give me a  " + currentLetter + ": " + currentLetter + "!");
                }
            }
            System.out.println("What does that spell?");
            for (int i = 0; i < numTimes; i++) {
                System.out.println(name + "!!!");
            }
        }
}
