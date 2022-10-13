package exercise;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> numbersList = new ArrayList<>(Arrays.asList(2, 3, 5, 9));
        List<Integer> resultingList1 = new ArrayList<>(Arrays.asList(2, 3, 5));
        List<Integer> resultingList2 = new ArrayList<>(Arrays.asList(2, 3, 5, 9));
        List<Integer> emptyList = new ArrayList<>();
        assertThat(exercise.App.take(numbersList, 3)).isEqualTo(resultingList1);
        assertThat(exercise.App.take(numbersList, 7)).isEqualTo(resultingList2);
        assertThat(exercise.App.take(numbersList, 0)).isEqualTo(emptyList);
        // END
    }
}
