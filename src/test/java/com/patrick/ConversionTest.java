package com.patrick;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ConversionTest {

    @Test
    public void case1() {
        int arr[] = {2, 3};
        List<String> result = Conversion.listAllPossible(arr);
        Assert.assertTrue(result.size()==9);
        Assert.assertTrue(result.contains("bf"));
        Assert.assertFalse(result.contains("bg"));
        PrintUtil.printWithSpace(result);
    }

    @Test
    public void case2() {
        int arr[] = {9};
        List<String> result = Conversion.listAllPossible(arr);
        Assert.assertTrue(result.size()==4);
        Assert.assertTrue(result.contains("w"));
        Assert.assertFalse(result.contains("f"));
        PrintUtil.printWithSpace(result);
    }

    // repeating digits in a word
    @Test
    public void case3() {
        int arr[] = {5,2,2,5};
        List<String> result = Conversion.listAllPossible(arr);
        Assert.assertTrue(result.size() == Math.pow(3,4));
        Assert.assertTrue(result.contains("jack"));
        PrintUtil.printWithSpace(result);
    }

    // stage 2  - new requirements. Supports mapping digits from 0 to 99.
    @Test
    public void case4() {
        int arr[] = {4, 2, 19, 98};
        List<String> result = Conversion.listAllPossible(arr);
        // 19 is mapped to 4 letters, 98 is mapped to 6 letters
        Assert.assertTrue(result.size() == 3*3*4*6);
        Assert.assertTrue(result.contains("ibcd"));
        PrintUtil.printWithSpace(result);
    }


}
