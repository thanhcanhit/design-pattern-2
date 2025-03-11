package observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class Class implements Subject{
    private final List<Observer> list;

    public Class() {
        list = new ArrayList<>();
    }

    @Override
    public void attach(Observer observer) {
        list.add( observer);
    }

    @Override
    public void detach(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : list) {
            observer.update(message);
        }
    }
}
