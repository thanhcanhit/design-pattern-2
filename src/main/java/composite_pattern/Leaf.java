package composite_pattern;

public class Leaf implements  Component{
    private int giaTien;

    public Leaf(int giaTien) {
        this.giaTien = giaTien;
    }

    @Override
    public long tinhTien() {
        return this.giaTien;
    }
}
