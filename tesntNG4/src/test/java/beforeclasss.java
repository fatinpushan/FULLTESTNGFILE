import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class beforeclasss {


   @BeforeMethod
    public void beforeMathod (){
       System.out.println("Before you run  your test, run this Before Method every time");
   } ;

   @AfterMethod
    public void afterMethod(){
       System.out.println("After every test run this method so we know its working");
   }


   @BeforeClass
   public void beforeClass(){
       System.out.println("Before every single class run this code so we know its working ");
   }

   @AfterClass
   public void afterClass(){
       System.out.println("After every class run this method so we know its working");
   }





}
