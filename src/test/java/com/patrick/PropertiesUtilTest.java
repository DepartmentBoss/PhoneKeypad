package com.patrick;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class PropertiesUtilTest {

    @Test
    public void readPropertiesTest() {
        String value = PropertiesUtil.getValue("2");
        assertThat(value, is(equalTo("abc")));

        // my internet connection cannot download the complete assertJ and Hamcrest library
        // so we revert to using JUnit style Assert
        value = PropertiesUtil.getValue("0");
        Assert.assertTrue(value.isEmpty());

        value = PropertiesUtil.getValue(20);
        Assert.assertTrue(value.equals("back"));

        // there is no mapping for 30 in our properties file
        value = PropertiesUtil.getValue(30);
        Assert.assertTrue(value.isEmpty());
    }

}
