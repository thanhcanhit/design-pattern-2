package observer_pattern;

public class ObserverTest {
    public static void main(String[] args) {
        Class KTPM17C = new Class();

        Student lead = new Student(1, "Lop Truong", "Lead");
        Student student2 = new Student(2, "Bob", "Member");
        Student student3 = new Student(3, "Charlie", "Member");

        KTPM17C.attach(lead);
        KTPM17C.attach(student2);
        KTPM17C.attach(student3);

        lead.notifyMessage("Hom nay co su kien", KTPM17C);
    }
}
