package com.beepscore.android.findmissingnumber;

import junit.framework.TestCase;

/**
 * Created by stevebaker on 5/29/15.
 */
public class MissingNumberFinderTest extends TestCase {

    MissingNumberFinder missingNumberFinder;

    public void setUp() {
        missingNumberFinder = new MissingNumberFinder();
    }

    public void testWordReverser() {
        assertNotNull(missingNumberFinder);
    }

}
