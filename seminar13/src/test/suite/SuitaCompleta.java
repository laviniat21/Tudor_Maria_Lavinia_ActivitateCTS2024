package test.suite;


import jdk.jfr.Category;
import org.junit.Rule;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.PachetTuristicTest;
import test.PersoanaTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({PachetTuristicTest.class, PersoanaTest.class})
public class SuitaCompleta {


}
