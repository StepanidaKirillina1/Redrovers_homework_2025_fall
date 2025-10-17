package homework.homework_17;

import java.util.List;

public abstract class ListSorting implements Task {
    protected List<Integer> numbers;

    public ListSorting(List<Integer> numbers) {
        this.numbers = numbers;
    }
}
