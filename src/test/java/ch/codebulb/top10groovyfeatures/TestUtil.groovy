package ch.codebulb.top10groovyfeatures

import groovy.transform.CompileStatic

@CompileStatic
class TestUtil {
    /**
     * Check whether all objects provided are equal.
     */
    protected static assertEquals(Object expected, Object... results) {
        assert 1 == [expected, *results].unique().size()
    }
}
