package testing;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ DivideNegativeTest.class, DivideTest.class })
public class AllTests {

}
