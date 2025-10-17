package homework.homework_17;

import java.util.List;

public class BubbleSorting extends ListSorting {

    BubbleSorting(List<Integer> numbers) {
        super(numbers);
    }

    @Override
    public void execute() {
        for (int i = 0; i < numbers.size() - 1; i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(i) > numbers.get(j)) {
                    int temp = numbers.get(i);
                    numbers.set(i, numbers.get(j));
                    numbers.set(j, temp);
                }
            }
        }
    }
}
