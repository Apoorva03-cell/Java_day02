import java.util.Scanner;

public class TrafficSystem {

    // Constant Fine Amounts
    private static final double SPEEDING_FINE = 100.0;
    private static final double UNDERAGE_FINE = 250.0;
    private static final double NO_HELMET_FINE = 50.0;
    private static final double NO_SEATBELT_FINE = 75.0;
    private static final double NO_LICENSE_FINE = 200.0;
    private static final int LEGAL_DRIVING_AGE = 18;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Gather Vehicle and Driver Data
        System.out.print("Enter Vehicle Number: ");
        String vehicleNumber = scanner.nextLine();

        System.out.print("Enter Current Speed (mph/kph): ");
        double currentSpeed = scanner.nextDouble();

        System.out.print("Enter Speed Limit (mph/kph): ");
        double speedLimit = scanner.nextDouble();

        System.out.print("Enter Driver Age: ");
        int age = scanner.nextInt();

        System.out.print("Is driver wearing a helmet? (true/false): ");
        boolean hasHelmet = scanner.nextBoolean();

        System.out.print("Is driver wearing a seatbelt? (true/false): ");
        boolean hasSeatbelt = scanner.nextBoolean();

        System.out.print("Does driver have a valid license? (true/false): ");
        boolean hasLicense = scanner.nextBoolean();

        // Process Violations
        double totalFine = 0.0;
        StringBuilder violations = new StringBuilder();

        if (currentSpeed > speedLimit) {
            totalFine += SPEEDING_FINE;
            violations.append("- Speeding Violation ($").append(SPEEDING_FINE).append(")\n");
        }

        if (age < LEGAL_DRIVING_AGE) {
            totalFine += UNDERAGE_FINE;
            violations.append("- Underage Driving Violation ($").append(UNDERAGE_FINE).append(")\n");
        }

        if (!hasHelmet) {
            totalFine += NO_HELMET_FINE;
            violations.append("- No Helmet Violation ($").append(NO_HELMET_FINE).append(")\n");
        }

        if (!hasSeatbelt) {
            totalFine += NO_SEATBELT_FINE;
            violations.append("- No Seatbelt Violation ($").append(NO_SEATBELT_FINE).append(")\n");
        }

        if (!hasLicense) {
            totalFine += NO_LICENSE_FINE;
            violations.append("- No Valid License Violation ($").append(NO_LICENSE_FINE).append(")\n");
        }

        // Output Results
        System.out.println("\n----- TRAFFIC VIOLATION REPORT -----");
        System.out.println("Vehicle Number: " + vehicleNumber);
        
        if (totalFine > 0) {
            System.out.println("Status: VIOLATION DETECTED");
            System.out.println("Violations Found:\n" + violations.toString().trim());
            System.out.println("Total Applicable Fine: $" + totalFine);
        } else {
            System.out.println("Status: COMPLIANT (No violations detected)");
            System.out.println("Total Applicable Fine: $0.0");
        }
        System.out.println("------------------------------------");

        scanner.close();
    }
}
