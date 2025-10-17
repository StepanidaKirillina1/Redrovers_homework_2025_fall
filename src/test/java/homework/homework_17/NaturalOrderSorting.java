package homework.homework_17;

import java.util.Comparator;
import java.util.List;

public class NaturalOrderSorting extends ListSorting {

    public NaturalOrderSorting(List<Integer> numbers) {
        super(numbers);
    }

    @Override
    public void execute() {
        numbers.sort(Comparator.naturalOrder());
    }
}
