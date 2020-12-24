import arrays.Test1;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Tests {
    Test1 test1;

    @Before
    public void creatTest1(){
        test1 = new Test1();
    }

    @Test(expected = RuntimeException.class)
    public void test1EX(){
        Test1.getLeterFour(new int[]{0, 3, 7, 5, 0, 0, 3, 2});
    }



}
