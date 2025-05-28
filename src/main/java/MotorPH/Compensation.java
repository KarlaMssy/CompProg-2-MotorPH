package MotorPH;

public class Compensation {
    private int riceSubsidy, phoneAllowance, clothingAllowance, basicSalary, grossRate;
    private double hourlyRate;

    //Constructor
    public Compensation(int riceSubsidy, int phoneAllowance, int clothingAllowance, int basicSalary) {
        this.riceSubsidy = riceSubsidy;
        this.phoneAllowance = phoneAllowance;
        this.clothingAllowance = clothingAllowance;
        this.basicSalary = basicSalary;
    }

    //Getters
    public int getGrossRate() { 
        return grossRate; 
    }
    public double getHourlyRate() { 
        return hourlyRate; 
    }
    //Setters
    public void setGrossRate(int grossRate) { 
        this.grossRate = grossRate; 
    }
    public void setHourlyRate(double hourlyRate) { 
        this.hourlyRate = hourlyRate; 
    }
    
    public void calculateGrossRate() {
        //Calculates gross rate by summing base salary and all allowances.
    }
    public void calculateHourlyRate() {
        //Computes the hourly rate from monthly salary assuming 22 workdays.
    }
}
