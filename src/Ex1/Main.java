package Ex1;

public class Main {
    public static void main(String[] args) {
        Worker basicWorker = new Worker("Alice", "Taylor", 15);
        OnsiteWorker onsiteWorker = new OnsiteWorker("Bob", "Johnson", 18);
        OnlineWorker onlineWorker = new OnlineWorker("Clara", "Williams", 20);

        System.out.println("Basic Worker Salary: " + basicWorker.calculateSalary(160));
        System.out.println("Onsite Worker Salary: " + onsiteWorker.calculateSalary(160));
        System.out.println("Online Worker Salary: " + onlineWorker.calculateSalary(160));
    }
}