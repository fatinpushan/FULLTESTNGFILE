import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listner extends TestListenerAdapter {


    public void onTestStart(ITestResult tr) {
        System.out.println("Test Started");
        System.out.println("TEst name is" + tr.getName());
    }


    public void onTestFailure(ITestResult tr) {
        System.out.println("This test failed");
        System.out.println("TEst name is" + tr.getName());

    }


    public void onTestSuccess(ITestResult tr) {
        System.out.println("This test PASSED");
        System.out.println("TEst name is" + tr.getName());
    }




    public void onFinish(ITestContext testContext) {
        System.out.println("ALL TEST FINISHED");


    }













}
