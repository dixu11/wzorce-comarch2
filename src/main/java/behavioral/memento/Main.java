package behavioral.memento;

import behavioral.memento.memento.Caretaker;
import behavioral.memento.memento.Document;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Document document = new Document();
        //DocumentMemento memento = document.createMemento();  // ukryłem to dla zasady hermetyzacji
        Caretaker caretaker = new Caretaker(document);

        caretaker.save();
        document.append("Hello");
        caretaker.save();
        document.append(" World");
        caretaker.save();
        document.setSize(20);
        caretaker.save();
        document.setColor(Color.RED);
        //document.readMemento(memento);

        System.out.println(document);
        caretaker.undo();
        System.out.println(document);
        caretaker.undo();
        System.out.println(document);
        caretaker.undo();
        System.out.println(document);
        caretaker.undo();


        System.out.println(document);
        caretaker.undo();

    }
}
