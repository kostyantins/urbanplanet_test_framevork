package project.asserts;

import org.testng.Assert;

import static project.utils.Logger.logFail;
import static project.utils.Logger.logPass;

public class CommonAssert {

    protected boolean actual;

    CommonAssert(final Boolean actual) {
        this.actual = actual;

    }

    public final CommonAssert isTrue() {

        if (!actual) {

            logFail("Expected True, but in fact False! ");
            Assert.fail("Expected True, but in fact False!");
        } else {
            logPass("True");
        }
        return this;
    }
}
