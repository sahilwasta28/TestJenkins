import static org.junit.Assert.*;

public class AdditionTest {

    @org.junit.Test
    public void add() {
        int result = Addition.add(4,4);
        int correct = 8;
        assertEquals(8,result);
    }
}