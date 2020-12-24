import arrays.Test2;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Tests2 {
    Test2 test2;
    @Before
    public void creatTest2(){
        test2 = new Test2();
    }


    @Test
    public void test2(){
        Assert.assertEquals(true,Test2.gettOneAndFourArrays(new int[]{1, 1, 4, 4, 4, 1, 4, 1}));
    }
    @Test
    public void test3(){
        Assert.assertEquals(true,Test2.gettOneAndFourArrays(new int[]{1, 2, 4, 4, 4, 1, 4, 1}));
    }
}
