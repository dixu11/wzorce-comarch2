package behavioral.visitator;

public class TaxiVisitor implements Visitor{
    @Override
    public void visit(BronzeCard bronzeCard) {
        System.out.println(2);
    }

    @Override
    public void visit(SilverCard silverCard) {
        System.out.println(4);
    }

    @Override
    public void visit(GoldCard goldCard) {
        System.out.println(6);
    }
}
