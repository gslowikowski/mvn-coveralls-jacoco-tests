import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FooTest {

    @Test
    public void test1()
    {
        Foo foo = new Foo();
        assertEquals(3, foo.sum(1, 2));
    }

}
