package behavioral.strategy.strategy1;

public class WinterTreeStrategy implements TreeStrategy {
    @Override
    public void display() {
        System.out.println("Drzewo bez liści");
    }
}
