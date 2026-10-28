public class Employees {

    private int employeeId;
    private String name;
    private double hoursWork;
    private double payRate;


    //generate the constroctor


    public Employees(int employeeId, String name, int hoursWork, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.hoursWork = hoursWork;
        this.payRate = payRate;
        //crate object
        Employees employee = new Employees(employeeId, name, hoursWork, payRate);
        employee.getEmployeeId();
        employee.getName();
        employee.getHoursWork();
        employee.getPayRate();
        System.out.println(employee.getEmployeeId());
        System.out.println(employee.getName());
        System.out.println(employee.getHoursWork());
        System.out.println(employee.getPayRate());

    }

    //I am use the getter and setter

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHoursWork() {
        return hoursWork;
    }

    public void setHoursWork(int hoursWork) {
        this.hoursWork = hoursWork;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;


    }

    //calculate the employee gross
    double getGrossPay() {
        return  hoursWork * payRate;
    }
//display the employee information to string
    @Override
    public String toString() {
        return "Employees{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", hoursWork=" + hoursWork +
                ", payRate=" + payRate +
                '}';
    }



}


