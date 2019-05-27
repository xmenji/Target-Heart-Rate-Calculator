
package targetheartratecalc;
import java.util.Scanner;

/**
 *
 * @author Titan
 */
public class TargetHeartRateCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstName, 
                lastName,
                birthMonth;
        
        int
                birthDay,
                birthYear,
                age,
                maxHeartRate;
        
        
        System.out.print("Enter first name: ");
        firstName = input.nextLine();
        System.out.print("Enter last name: ");
        lastName = input.nextLine();
        System.out.print("Enter month of birth: ");
        birthMonth = input.nextLine();
        System.out.print("Enter day of birth: ");
        birthDay = input.nextInt();
        System.out.print("Enter year of birth: ");
        birthYear = input.nextInt();
        
        HeartRates person1 = new HeartRates(firstName, lastName, birthMonth, birthDay, birthYear);
        
        age = person1.getAge();
        
        System.out.printf("%s's Maximum Heart Rate: %d%n", person1.getFirstName(), person1.getMaxHeartRate(age));
        System.out.println(person1.getTargetHeartRate(age));
    }
    
}
