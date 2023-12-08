package behavioral.visitator;

public class GoldCard extends Card{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
