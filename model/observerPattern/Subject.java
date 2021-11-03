package model.observerPattern;

import model.Snake;

public interface Subject {
    void removeSnakeListener(Observer o);
    void addSnakeListener(Observer o);
    void notifyObserver(Snake.Event event);
}
