package behavioral.memento.memento;


import java.util.Deque;
import java.util.LinkedList;

public class Caretaker {
    private final Deque<DocumentMemento> history = new LinkedList<>();
    private final Document document;

    public Caretaker(Document document) {
        this.document = document;
    }

    public void save() {
        history.push(document.createMemento()); // addFirst
    }

    public void undo() {
        if (history.isEmpty()) return;
        document.readMemento(history.pop()); // = removeFirst
    }
}
