package behavioral.strategy.strategy1;

public class MyTree {

    private TreeStrategy strategy;

    public MyTree() {
        strategy = new WinterTreeStrategy();
    }

    public void show() {
        strategy.display();
    }

    public void setSeason(TreeStrategy strategy) {
        this.strategy = strategy;
    }
}
