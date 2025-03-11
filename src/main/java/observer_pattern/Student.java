package observer_pattern;

public class Student implements Observer {
    private int id;
    private String name;
    private String role;

    public Student(int id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    @Override
    public void update(String message) {
        System.out.println("Student " + this.id + ": " + this.name + " received a notification: " + message);
    }

    @Override
    public void notifyMessage(String message, Subject subject) {
        if (this.role.equalsIgnoreCase("Lead")) {
            subject.notifyObservers(message);
        } else {
            throw new UnsupportedOperationException("Only lead student can notify the class");
        }
    }
}
