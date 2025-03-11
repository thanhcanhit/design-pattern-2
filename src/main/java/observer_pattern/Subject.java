package observer_pattern;

public interface Subject {
    void attach(Observer observer);

    void detach(Observer observer);

    void notifyObservers(String message);
}
