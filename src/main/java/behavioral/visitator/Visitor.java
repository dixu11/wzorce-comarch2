package behavioral.visitator;

public interface Visitor {
    void visit(BronzeCard bronzeCard);
    void visit(SilverCard silverCard);
    void visit(GoldCard goldCard);
}
