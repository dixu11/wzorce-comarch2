package behavioral.memento.memento;

import java.awt.*;

public class Document {
    private String text;
    private int size;
    private Color color;

    public Document() {
        text = "";
        size = 11;
        color = Color.BLACK;
    }

    public void append(String text) {
        this.text += text;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setColor(Color color) {
        this.color = color;
    }

     DocumentMemento createMemento() {
        return new DocumentMemento(text, size, color);
    }

     void readMemento(DocumentMemento documentMemento) {
        text = documentMemento.text();
        size = documentMemento.size();
        color = documentMemento.color();
    }

    @Override
    public String toString() {
        return "Document{" +
                "text='" + text + '\'' +
                ", size=" + size +
                ", color=" + color +
                '}';
    }
}
