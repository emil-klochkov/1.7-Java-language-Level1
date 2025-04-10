package Ex2;

public class Main {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        OnsiteWorker onsite = new OnsiteWorker("David", "Martin", 17);
        OnlineWorker online = new OnlineWorker("Emma", "Clark", 22);

        onsite.worksInStore();
        online.worksFromHome();
    }
}