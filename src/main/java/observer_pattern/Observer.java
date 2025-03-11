package observer_pattern;

public interface Observer {
    void update(String message);
    void notifyMessage(String message, Subject subject);
}
