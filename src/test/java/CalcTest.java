import org.junit.Test;
import calculator.Calc;
import org.junit.Assert;

public class CalcTest {
    @Test
    public void subtractTest(){
        //Given
        Calc calc = new Calc();
        int x=10;
        int y= 5;
      int  expected= 5;
      int actual= calc.subtract(x,y);

      Assert.assertEquals(expected,actual);

    }
    @Test
    public void multiplyTest(){
        Calc calc=new Calc();
        int x=5;
        int y=3;

        double shouldBe=15;
        double forReal= calc.multiply(x,y);

        Assert.assertEquals(shouldBe,forReal,0.0001);
    }
@Test
    public void devideTest(){
        Calc calc= new Calc();
        int x=30;
        int y=2;

        double expected= 15;
        double actual= calc.divide(x,y);

        Assert.assertEquals(expected,actual, 0.0001);
}
@Test
    public void squareTest(){
        Calc calc= new Calc();
        int x=5;

        int expected= 25;
        int actual= calc.square(x);

        Assert.assertEquals(expected,actual);
}
@Test
    public void squareRootTest(){
        Calc calc=new Calc();
        int x= 16;

        double expected= 4;
        double actual= calc.squareRoot(x);

        Assert.assertEquals(expected,actual,0.001);
}
@Test
    public void exponentsTest(){
        Calc calc= new Calc();
        int x=2;
        int y=4;

        double expected= 16;
        double actual= calc.exponents(x,y);
         Assert.assertEquals(expected,actual,0.0001);
}
@Test
    public void sineMethodTest(){
        Calc calc=new Calc();

        double x=Math.sin(4);

        double expected=x;
        double actual=calc.sineMethod(4);

        Assert.assertEquals(expected,actual,0.0000000001);
}


    }





