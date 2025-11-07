// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int seed = Integer.parseInt(args[0]);
		String mode = args[1];
		String verbose = "";
		int sequenceCount = 0;
		String summaryStart = "Every one of the first ";
		String summaryEnd = " hailstone sequences reached 1.";
		for (int i = 1; i <= seed; i++) {
			int currentNum = i;
			String sequenceString = i + " ";
			int iterations = 1;
			boolean first = true;
			while (currentNum != 1 || first) {
				first = false;
				if (currentNum % 2 == 0) {
				currentNum = currentNum / 2;
			} else {
				currentNum = (currentNum * 3) + 1;
			}
			iterations++;
			sequenceString = sequenceString + currentNum + " ";
			}
			if(mode.equals("v")){
			System.out.println(sequenceString + "(" + iterations + ")");
			}
			sequenceCount++;
		}
		System.out.println(summaryStart + sequenceCount + summaryEnd);
	}
}
