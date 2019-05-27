
package targetheartratecalc;
import java.util.Scanner;
/**
 *
 * @author Titan
 */
public class HeartRates {
    private String firstName,
            lastName,
            birthMonth;
    private int birthDay,
            birthYear;
    
    public HeartRates(String firstName, String lastName, String birthMonth, int birthDay, int birthYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    
    public void setBirthMonth(String birthMonth){
        this.birthMonth = birthMonth;
    }
    public String getBirthMonth(){
        return birthMonth;
    }
    
    public void setBirthDay(int birthDay){
        this.birthDay = birthDay;
    }
    public int getBirthDay(){
        return birthDay;
    }
    
    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }
    public int getBirthYear(){
        return birthYear;
    }
    
    public int getAge(){
        
        Scanner input = new Scanner(System.in);
        int currentYear, age;
        
        System.out.print("Enter current year: ");
        currentYear = input.nextInt();
        
        age = currentYear - this.birthYear;
        
        return age;
    }
   
    public int getMaxHeartRate(int age){
        return 220 - age;
    }
    
    public String getTargetHeartRate(int age){
        String range;
        int maxHeartRate = getMaxHeartRate(age),
                lowRange = (int) (maxHeartRate * 0.50),
                highRange = (int) (maxHeartRate * 0.80);
        
        range = this.getFirstName() + "'s Target Heart Range: " + 
                lowRange + "% - " + highRange + "%.";
        
        return range;
    }
}
