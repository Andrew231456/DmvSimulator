import java.util.Random;

public class DmvSimulator {
	public static int GetRandomNumber(int min, int max) {
		Random random = new Random();
		return random.nextInt(max - min + 1) + min;
	}
	
	public static void main(String[] args) {
		
		int min = 100;
		int max = 200;
		int spotNumber = GetRandomNumber(min,max);
		
		System.out.println("Welcome to the DMV! Let me get your spot number, please hold.");
		System.out.println("Your spot number is: " + spotNumber);
		
		int NumberAfterSpot = spotNumber + 1;
		int reCount = 0;
		
		while (NumberAfterSpot > spotNumber & NumberAfterSpot < max) {
			System.out.println("Spot Number: " + (NumberAfterSpot));
			NumberAfterSpot += 1;
		}
		System.out.println("Spot Number: " + (NumberAfterSpot));
		if (NumberAfterSpot == 200) {
			while (reCount <= spotNumber) {
				System.out.println("Spot Number: " + (reCount));
				reCount += 1;
				
				if (reCount == spotNumber - 1) {
					
					int percentage = GetRandomNumber(1,100);
					if (percentage == 1) {
						System.out.println("Spot Number: " + (reCount));
						System.out.println("Spot number [" + spotNumber + "] you have the right paperwork and are all set!");
						System.exit(0);
					} else {
						System.out.println("Spot Number: " + (reCount));
						System.out.println("Spot number [" + spotNumber + "] you do NOT have the right paperwork!  DO NOT come back until you have the required paperwork!");
						System.exit(0);
					}
					
				}
			}
		}
	}
}
