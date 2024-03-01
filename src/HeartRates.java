import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class HeartRates {
    private String firstName;
    private String lastName;
    private String dateOfBirth;

    // Constants
    private static final int RESTING_HEART_RATE = 70;
    private static final double LOWER_BOUNDARY = 0.5;
    private static final double UPPER_BOUNDARY = 0.85;

    public HeartRates(String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public int calculateAge(String birthday) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate birthDate = LocalDate.parse(dateOfBirth, formatter);

        LocalDate currentDate = LocalDate.now();

        Period period = Period.between(birthDate, currentDate);

        return period.getYears();
    }
    public int getMaxHeartRate(){
        int age = calculateAge(dateOfBirth);
        return 220 - age;
    }
    public void getTargetHeartRateRange(){
        double maxHeartRate = getMaxHeartRate();
        double averageHeartRate = maxHeartRate - RESTING_HEART_RATE;
        double lowerBoundaryTargetHeartRate =  (averageHeartRate * LOWER_BOUNDARY) + RESTING_HEART_RATE;
        double upperBoundaryTargetHeartRate = (averageHeartRate * UPPER_BOUNDARY) + RESTING_HEART_RATE;

        System.out.println("The target Heart Rate Range is between " + lowerBoundaryTargetHeartRate + " and " + upperBoundaryTargetHeartRate);
    }
    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName +
                "\nDate of Birth: " + dateOfBirth +
                "\nAge: " + calculateAge(dateOfBirth) + " years" +
                "\nMaximum Heart Rate (MHR): " + getMaxHeartRate();
    }

}
