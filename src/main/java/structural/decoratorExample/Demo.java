package structural.decoratorExample;

import structural.decoratorExample.html.BaseDecorator;
import structural.decoratorExample.html.BodyDecorator;
import structural.decoratorExample.html.Html;
import structural.decoratorExample.html.TagGenerator;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException {
//        ObjectInputStream ois =new ObjectInputStream(new ObjectInputStream(new FileInputStream("file.bin"))) ;
//        ois.close();
        TagGenerator fullHtmlGenerator = new BodyDecorator(new BodyDecorator(new BaseDecorator()));
        Html html = new Html();
        fullHtmlGenerator.addTags(html);
        System.out.println(html.getHtml());
    }
}
