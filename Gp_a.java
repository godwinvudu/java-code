import java.util.Scanner;

public class Gp_a {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            // Read student name
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            
            // Introductory message
            System.out.println("Hello " + name);
            System.out.print("Please enter your student ID (should be exactly ten characters): ");
            
            // Validating ID length
            String id = scanner.nextLine();
            while (id.length() != 10) {
                if (id.length() < 10) {
                    System.out.print("Invalid ID (too short). Re-enter: ");
                } else {
                    System.out.print("Invalid ID (too long). Re-enter: ");
                }
                id = scanner.nextLine();
            }
            System.out.println("ID valid and accepted.\n");
            
            // Accepting scores with validation (Bonus Requirement)
            
            // 1. Assignment Score (Integer)
            System.out.print("Enter assignment score (0-100): ");
            int assignment = scanner.nextInt();
            while (assignment < 0 || assignment > 100) {
                System.out.println("Invalid input! Score must be between 0 and 100.");
                System.out.print("Re-enter assignment score: ");
                assignment = scanner.nextInt();
            }
            
            // 2. Midterm Score (Decimal)
            System.out.print("Enter midterm score (0-100): ");
            double midterm = scanner.nextDouble();
            while (midterm < 0 || midterm > 100) {
                System.out.println("Invalid input! Score must be between 0 and 100.");
                System.out.print("Re-enter midterm score: ");
                midterm = scanner.nextDouble();
            }
            
            // 3. Final Exam Score (Decimal)
            System.out.print("Enter final exam score (0-100): ");
            double fina_l = scanner.nextDouble();
            while (fina_l < 0 || fina_l > 100) {
                System.out.println("Invalid input! Score must be between 0 and 100.");
                System.out.print("Re-enter final exam score: ");
                fina_l = scanner.nextDouble();
            }
            
            // Compute the weighted total using required formula
            double weightedTotal = (assignment * 0.20) + (midterm * 0.20) + (fina_l * 0.60);
            
            // Round to the nearest integer for letter grading assignment
            long roundedTotal = Math.round(weightedTotal);
            String grade = " ";
            
            scanner.close();
            if (roundedTotal >= 90) {
                grade = "A";
            } else if (roundedTotal >= 80) {
                grade = "B";
            } else if (roundedTotal >= 70) {
                grade = "C";
            } else if (roundedTotal >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }
            
            // Output Formatted Report
            System.out.println("\n=================================");
            System.out.println("        STUDENT GRADE REPORT     ");
            System.out.println("=================================");
            System.out.println("Student Name : " + name);
            System.out.println("Student ID   : " + id);
            System.out.println("---------------------------------");
            System.out.println("Raw Scores & Component Weights:");
            System.out.println("  Assignment Score : " + assignment + " (Weight: 20%)");
            System.out.println("  MidSem Score     : " + midterm + " (Weight: 20%)");
            System.out.println("  Final Exam Score : " + fina_l + " (Weight: 60%)");
            System.out.println("---------------------------------");
            System.out.printf("Weighted Total   : %.2f\n", weightedTotal);
            System.out.println("Final Letter Grade: " + grade);
            System.out.println("=================================");
        }
    }
}
