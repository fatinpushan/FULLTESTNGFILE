import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Listner.class)
public class testclass extends beforeclasss  {


    @Test
    public void value1(){
        System.out.println("Value1 Test 1");

        MainJava obj = new MainJava() ;

        int x = obj.num1(6,2,4) ;

        Assert.assertEquals(x, 18);

        System.out.println();






    }




    @Test

    public void value2(){
        System.out.println("Value1 Test 2");
        MainJava obj = new MainJava() ;

        int x = obj.num2(5,5) ;
        Assert.assertEquals(x, 10);
        System.out.println();

    }









}
