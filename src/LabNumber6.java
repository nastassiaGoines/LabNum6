import java.util.Random;

public class LabNum_6 {

	public static void main(String[] args) {
		int nSides;
		int number;
		int die1;
		int die2;

		System.out.println("How many sides does each die have? ");
		System.out.println(nSides);
		System.out.println("Press '1' to roll");
		int die1 = generateRandomDieRoll(nSides);
		int die2 = generateRandomDieRoll(nSides);

	}

	public static int generateRandomDieRoll(int nSides) {
		int result;

		Random rand = new Random();
		result = rand.nextInt();

		return result;
	}
}
