package com.example.domain;

public class Employee {

    
    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public Employee(int empId, String name, String ssn, double salary) {
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public double getSalary() {
        return salary;
    }
    
    public void raiseSalary(double increase){
        this.salary += increase;
    }
    

    public String getDetails(){
        return "Employee id " + getEmpId() + " Employee name " + getName();
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Employee){
            Employee e = (Employee) obj;
            return e.empId  == this.empId 
                    && e.name.equals(this.name);
        }
        return false;
    }
    
    

}
