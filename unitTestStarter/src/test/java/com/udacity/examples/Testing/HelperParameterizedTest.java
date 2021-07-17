package com.udacity.examples.Testing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.sonatype.inject.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class HelperParameterizedTest {

    private String input;
    private String output;

    public HelperParameterizedTest(String input, String output) {
        this.input = input;
        this.output = output;
    }

    @Parameters
    public static Collection initData() {
        String empName[][] = {{"sonja","patrick"}, {"sonja","jeff"}};
        return Arrays.asList(empName);
    }

    @Test
    public void verify_inputNames_name_is_not_the_same_as_the_output_name() {
        //assertNotEqu
    }
}
