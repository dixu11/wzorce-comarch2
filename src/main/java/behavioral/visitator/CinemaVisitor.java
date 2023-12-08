package behavioral.visitator;

public class CinemaVisitor  implements Visitor{
    @Override
    public void visit(BronzeCard bronzeCard) {
        System.out.println(10);
    }

    @Override
    public void visit(SilverCard silverCard) {
        System.out.println(20);
    }

    @Override
    public void visit(GoldCard goldCard) {
        System.out.println(30);
    }
}
