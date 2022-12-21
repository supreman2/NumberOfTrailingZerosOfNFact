import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class SolutionTest {
    @Test
    public void testZeros() throws Exception {
        assertThat(Solution.zeros(0), is(0));
        assertThat(Solution.zeros(6), is(1));
        assertThat(Solution.zeros(14), is(2));
        assertThat(Solution.zeros(21), is(4));
        assertThat(Solution.zeros(100), is(24));
        // assertThat(Solution.zeros(Integer.MAX_VALUE), is(536870902));
    }
}