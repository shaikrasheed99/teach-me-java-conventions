package powerpackage;

import org.junit.Test;

public class PowerFinderTest {
    @Test
    public void one_raised_to_one_is_one() {
        assert PowerFinder.calculate(1,1) == 1;
    }

    @Test
    public void two_raised_to_one_is_two() {
        assert PowerFinder.calculate(2,1) == 2;
    }

    @Test
    public void two_raised_to_two_is_four() {
        assert PowerFinder.calculate(2, 2) == 4;
    }

    @Test
    public void three_raised_to_two_is_nine() {
        assert PowerFinder.calculate(3, 2) == 9;
    }
}
