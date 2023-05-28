import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Listner.class)
public class dataprovidertest extends beforeclasss{


    @Test (dataProvider = "provider1" , dataProviderClass = dataprovider.class )

    public void dataprovidtest(String name, String number){
        System.out.println("Name is " + name);
        System.out.println("Number is " + number);
        System.out.println();
    } ;









}
