// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		int numTerms = Integer.parseInt(args[0]);
		double sum = 1.0;
		int currentDivider = 3;
		boolean isMinus = true;
		for (int i = 0; i < numTerms -1; i++) {
			if (isMinus) {
				sum = sum - (1.0/currentDivider);
			} else{
				sum = sum + (1.0/currentDivider);
			}
			currentDivider = currentDivider + 2;
			isMinus = !isMinus;
		}
		double approximatedPi = sum*4;
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated: " + approximatedPi);
	}
}
