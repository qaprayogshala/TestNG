import org.testng.annotations.*;

public class ParallelClass1Test {

//    @BeforeSuite
//    public void beforeSuiteMethod() {
//        System.out.println("Before Suite:"+Thread.currentThread().threadId());
//    }
//
//    @BeforeTest
//    public void beforeTestMethod() {
//        System.out.println("1 > Before Test:"+Thread.currentThread().threadId());
//    }

//    @BeforeClass
//    public void beforeClass() {
//        System.out.println("1 > beforeClass:"+ Thread.currentThread().threadId());
//    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod:"+Thread.currentThread().threadId());
    }

    @Test()
    public void testMethod1() {
        System.out.println("1 > Test 1:" + Thread.currentThread().threadId());
    }

    @Test()
    public void testMethod2() {
        System.out.println("1 > Test 2:" + Thread.currentThread().threadId());
    }

    @Test()
    public void testMethod3() {
        System.out.println("1 > Test 3:" + Thread.currentThread().threadId());
    }

//    @AfterClass
//    public void afterClass(){
//        System.out.println("1 > afterClass:"+Thread.currentThread().threadId());
//    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod:"+Thread.currentThread().threadId());
    }

//    @AfterTest
//    public void afterTestMethod() {
//        System.out.println("1 > After Test:"+Thread.currentThread().threadId());
//    }
//
//    @AfterSuite
//    public void afterSuiteMethod() {
//        System.out.println("After Suite:"+Thread.currentThread().threadId());
//    }

//    @Factory
//    public static Object[] factoryMethod(){
//        return new Object[]{
//                new ParallelClass1Test(),
//                new ParallelClass1Test(),
//                new ParallelClass1Test()
//        };
//    }
}
