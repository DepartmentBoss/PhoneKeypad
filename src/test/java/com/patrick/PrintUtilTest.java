package com.patrick;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PrintUtilTest {

    @Test
    public void printing() {
        List<String> list = new ArrayList<>();
        list.add("Jack");
        list.add("Kate");
        list.add("Bill");
        PrintUtil.printWithSpace(list);
        // see the result in console window
    }

}
