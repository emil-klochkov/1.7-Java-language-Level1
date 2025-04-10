package Ex2;

public class OnsiteWorker extends Worker {
    public static double fuel = 50.0;

    public OnsiteWorker(String name, String surname, double hourlyRate) {
        super(name, surname, hourlyRate);
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        return (hoursWorked * hourlyRate) + fuel;
    }

    @Deprecated
    public void worksInStore() {
        System.out.println(name + " used to work in a physical store.");
    }
}