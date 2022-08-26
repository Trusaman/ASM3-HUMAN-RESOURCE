import java.util.Date;

abstract class Staff {
    protected String id;
    protected String name;
    protected int age;
    protected double salaryBase;
    protected Date startingDate;
    protected String department;
    protected double leaveDays;
    abstract void displayInformation();

}
