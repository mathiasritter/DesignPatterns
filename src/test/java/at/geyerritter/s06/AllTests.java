package at.geyerritter.s06;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(value = Suite.class)
@SuiteClasses(value = {GansAdapterTest.class, GansTest.class, GummiEnteTest.class, LockPfeifeTest.class, TestMoorEnte.class})
public class AllTests {

}
