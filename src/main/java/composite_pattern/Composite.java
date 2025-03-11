package composite_pattern;

import java.util.ArrayList;
import java.util.List;

public class Composite  implements Component{
    private final List<Component> list;

    public Composite(List<Component> list) {
        this.list = list;
    }

    @Override
    public long tinhTien() {
        long sum = 0;
        for (Component component : list) {
            sum += component.tinhTien();
        }
        return sum;
    }
}
