package MotorPH;


public class GovernmentId {
     private String sssNo, philhealthNo, tinNo, pagibigNo;

    //Constructor
    public GovernmentId(String sssNo, String philhealthNo, String tinNo, String pagibigNo) {
        this.sssNo = sssNo;
        this.philhealthNo = philhealthNo;
        this.tinNo = tinNo;
        this.pagibigNo = pagibigNo;
    }

    //Getters
    public String getSssNo() { 
        return sssNo; 
    }
    public String getPhilhealthNo() { 
        return philhealthNo; 
    }
    public String getTinNo() { 
        return tinNo; 
    }
    public String getPagibigNo() { 
        return pagibigNo; 
    }
    
    //Setters
    public void setSssNo(String sssNo) { 
        this.sssNo = sssNo; 
    }
    public void setPhilhealthNo(String philhealthNo) { 
        this.philhealthNo = philhealthNo; 
    }
    public void setTinNo(String tinNo) { 
        this.tinNo = tinNo; 
    }
    public void setPagibigNo(String pagibigNo) { 
        this.pagibigNo = pagibigNo; 
    }
}
