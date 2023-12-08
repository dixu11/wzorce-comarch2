package behavioral.visitator;

public class BronzeCard extends Card {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
