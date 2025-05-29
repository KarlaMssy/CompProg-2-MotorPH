package MotorPH;

public class Attendance {
    private String date;
    private int logIn, logOut;
    
    //Constructor
    public Attendance(String date, int logIn, int logOut) {
        this.date = date;
        this.logIn = logIn;
        this.logOut = logOut;
    }
    
    //Getters
    public String getDate() { 
        return date;
    }
    public int getLogIn() { 
        return logIn;
    }
    public int getLogOut() { 
        return logOut;
    }
    
    //Setters
    public void setDate(String date) { 
        this.date = date;
    }
    public void setLogIn(int logIn) { 
        this.logIn = logIn;
    }
    public void setLogOut(int logOut) { 
        this.logOut = logOut;
    }
    
    public int calculateDailyHours() {
        //Returns daily worked hours with 10-minute grace period adjustment.
        return 0;
    }
}

