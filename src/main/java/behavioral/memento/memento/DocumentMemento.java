package behavioral.memento.memento;

import java.awt.*;

public record DocumentMemento(
        String text,
        int size,
        Color color
) {
}
