package structural.decoratorExample.html;

public class BodyDecorator implements TagGenerator{

    private TagGenerator tagGenerator;

    public BodyDecorator(TagGenerator tagGenerator) {
        this.tagGenerator = tagGenerator;
    }

    @Override
    public void addTags(Html html) {
        tagGenerator.addTags(html);
        html.putInside("<body></body>",6);
    }
}
