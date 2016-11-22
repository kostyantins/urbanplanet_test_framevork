package project.asserts;

import project.elements.wrapers.AbstractClickableElement;

public final class FluentAssertions {

    private FluentAssertions() {
    }

    public static final AbstractElementAssert assertThat(final AbstractClickableElement actual) {
        return new AbstractElementAssert(actual);
    }

    public static final CommonAssert assertThat(final Boolean actual) {
        return new CommonAssert(actual);
    }
}
