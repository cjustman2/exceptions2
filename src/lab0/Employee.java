package lab0;

import java.util.Date;

/**
 * In this challenge you need to address the probability that at some
 * point the arguments to method parameters may not be valid. 
 * <p>
 * For example, String arguments may be null or empty; other objects may be 
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all 
 * arguments are valid. The only exception is when any argument is acceptable 
 * based on requirements. Fix the code below using if logic to validate
 * method arguments and throw IllegalArgumentException or a custom
 * exception if the validation fails.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {
    public static final int MAX_VACATION_DAYS = 28;
    private String firstName;
    private String lastName;
    private String ssn;
    private Date hireDate;
    private int daysVacation;

    public Employee() {
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        hireDate = new Date();
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, Date hireDate, int daysVacation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.hireDate = hireDate;
        this.daysVacation = daysVacation;
    }
    
    public int getDaysVacation() {
        return daysVacation;
    }
    /**
     * Make sure numbers are positive
     * @param daysVacation 
     */
    public void setDaysVacation(int daysVacation) {
        if(daysVacation >= 0){
        this.daysVacation = daysVacation;
        }else{
        throw new IllegalArgumentException();
        }
    }

    public String getFirstName() {
        return firstName;
    }
    
    /**
     * allow any letter case for the text and fix later in code depending on 
     * requirements.
     * @param firstName 
     */

    public void setFirstName(String firstName) {
        if(firstName == null || firstName.length() == 0){
            throw new IllegalArgumentException("Entry Required.");
        }
        this.firstName = firstName;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getLastName() {
        return lastName;
    }
    /**
     * lastName must be at least 2 characters long and not null
     * @param lastName 
     */
    public void setLastName(String lastName) {
        if(lastName != null && lastName.length() > 1){
        this.lastName = lastName;
        }
    }

    public final String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    
    
}
