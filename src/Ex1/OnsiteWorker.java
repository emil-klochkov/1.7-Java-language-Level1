package Ex1;

public class OnsiteWorker extends Worker {
    public static double fuel = 50.0;

    public OnsiteWorker(String name, String surname, double hourlyRate) {
        super(name, surname, hourlyRate);
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        return (hoursWorked * hourlyRate) + fuel;
    }
}