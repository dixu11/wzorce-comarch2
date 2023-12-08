package structural.decoratorExample.html;

public class BaseDecorator implements TagGenerator {



    @Override
    public void addTags(Html html) {
        html.putInside("<html></html>",6);
    }
}
