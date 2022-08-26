public class Employee extends Staff implements ICalculator{
    double overtimeHours;

    @Override
    public void displayInformation() {

    }

    @Override
    public double calculateSalary() {
        return this.salaryBase;
    }
}
