import org.testng.annotations.DataProvider;

public class dataprovider {


 @DataProvider (name = "provider1")

    public Object[][] num(){

     Object[][] array = new Object[3][2] ;

     array[0][0] = "Name1" ;
     array[0][1] = "718-455-7898" ;

     array[1][0] = "Name2" ;
     array[1][1] = "347-455-0989" ;

     array[2][0] = "Name3" ;
     array[2][1] = "984-999-7898" ;
     
return array;

 } ;



}
