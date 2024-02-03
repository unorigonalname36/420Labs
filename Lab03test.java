import org.junit.*;

public class Lab03test {
    

    @Test
    public void basicTest(){
        Lab03 Lab = new Lab03();
        Assert.assertEquals(20, Lab.algorithm(1,10));

    }

    @Test
    public void SameNumberTest(){
        Lab03 Lab = new Lab03();
        Assert.assertEquals(25, Lab.algorithm(50,50));

    }

    @Test
    public void NegagtiveNumberTest(){
        Lab03 Lab = new Lab03();
        Assert.assertEquals(0, Lab.algorithm(-50,50));

    }
}
