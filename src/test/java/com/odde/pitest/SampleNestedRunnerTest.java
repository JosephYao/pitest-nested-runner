package com.odde.pitest;

import com.nitorcreations.junit.runners.NestedRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(NestedRunner.class)
public class SampleNestedRunnerTest {

    public class FirstGroup {

        @Test
        public void should_pass() {
            assertEquals(1, new FirstClass().value());
        }

    }

    public class SecondGroup {

        @Test
        public void should_pass() {
            assertEquals(2, new SecondClass().value());
        }

    }
}
