package structural.decoratorExample.html;

public class Html {
    private StringBuilder html = new StringBuilder();
    private int center;

    public void putInside(String content, int newCenter){
        html.insert(center, content);
        center += newCenter;
    }

    public String getHtml() {
        return html.toString();
    }
}
