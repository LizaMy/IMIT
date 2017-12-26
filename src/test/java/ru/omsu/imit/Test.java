package ru.omsu.imit;

import org.junit.Assert;

public class Test {
    @org.junit.Test
    public void testMaxRoot() throws Exception {
        MaxRoot maxRoot = new MaxRoot(new double[]{1,-2,-3});
        Assert.assertTrue(3.0 == maxRoot.maxRoot());
    }
}
