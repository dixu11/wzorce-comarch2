package behavioral.visitator;

public class SpaVisitor implements Visitor{
    @Override
    public void visit(BronzeCard bronzeCard) {
        System.out.println(5);
    }

    @Override
    public void visit(SilverCard silverCard) {
        System.out.println(10);
    }

    @Override
    public void visit(GoldCard goldCard) {
        System.out.println(15);
    }
}
