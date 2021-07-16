import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class RandomGeneratorTest {

    @Before
    public void init() {

    }

    @Test
    public void testRandomGeneration() {
        Assert.assertEquals(5+3, 8);
    }

    @Test
    public void testRandomGeneration_found() {

        Assert.assertEquals("Test Random" + " Generator", "Test Random Generator");
    }

}