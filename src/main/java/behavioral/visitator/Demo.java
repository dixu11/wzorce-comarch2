package behavioral.visitator;

public class Demo {
    public static void main(String[] args) {
        BronzeCard bronzeCard = new BronzeCard();
        SilverCard silverCard = new SilverCard();
        GoldCard goldCard = new GoldCard();

        SpaVisitor spaVisitor = new SpaVisitor();
        TaxiVisitor taxiVisitor = new TaxiVisitor();

        spaVisitor.visit(bronzeCard);
        spaVisitor.visit(silverCard);
        spaVisitor.visit(goldCard);

        taxiVisitor.visit(bronzeCard);
        taxiVisitor.visit(silverCard);
        taxiVisitor.visit(goldCard);

        //bronzeCard.accept(spaVisitor);
        System.out.println("-------------");
        CinemaVisitor cinemaVisitor = new CinemaVisitor();
        silverCard.accept(cinemaVisitor);
        cinemaVisitor.visit(silverCard);
    }
}
