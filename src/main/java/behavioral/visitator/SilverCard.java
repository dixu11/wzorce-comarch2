package behavioral.visitator;

public class SilverCard extends Card {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
