import org.testng.annotations.*;

public class ParallelClass2Test {

    @BeforeTest
    public void beforeTestMethod() {
        System.out.println("2 > Before Test:"+Thread.currentThread().threadId());
    }

//    @BeforeClass
//    public void beforeClass() {
//        System.out.println("2 > beforeClass:"+ Thread.currentThread().threadId());
//    }

    @Test()
    public void testMethod1() {
        System.out.println("2 > Test1:"+Thread.currentThread().threadId());
    }

    @Test()
    public void testMethod2() {
        System.out.println("2 > Test2:"+Thread.currentThread().threadId());
    }

    @Test()
    public void testMethod3() {
        System.out.println("2 > Test3:"+Thread.currentThread().threadId());
    }

    @AfterTest
    public void afterTestMethod() {
        System.out.println("2 > After Test:"+Thread.currentThread().threadId());
    }

//    @AfterClass
//    public void afterClass(){
//        System.out.println("2 > afterClass:"+Thread.currentThread().threadId());
//    }

}
