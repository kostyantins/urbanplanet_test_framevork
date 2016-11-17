package project.asserts;

import project.elements.wrapers.AbstractElement;

public class FluentAssertions {

    private FluentAssertions() {
    }

    public static final AbstractElementAssert assertThat(final AbstractElement actual) {
        return new AbstractElementAssert(actual);
    }

    public static final CommonAssert assertThat(final Boolean actual) {
        return new CommonAssert(actual);
    }
}
