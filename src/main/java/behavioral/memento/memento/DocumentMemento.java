package behavioral.memento.memento;

import java.awt.*;

public class DocumentMemento {
    private final String text;
    private final int size;
    private final Color color;

    public DocumentMemento(String text, int size, Color color) {
        this.text = text;
        this.size = size;
        this.color = color;
    }

    public String getText() {
        return text;
    }

    public int getSize() {
        return size;
    }

    public Color getColor() {
        return color;
    }
}
