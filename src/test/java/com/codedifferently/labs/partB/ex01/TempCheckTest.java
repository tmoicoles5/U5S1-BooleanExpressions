package com.codedifferently.labs.partB.ex01;

import com.codedifferently.labs.partB.ex02.EqualityOperator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TempCheckTest {
    @Test
    public void equalityTest01(){
        String expected= "It's hot - a T shirt will be perfect.";
        String actual = TempCheck.bool();
        Assertions.assertEquals(expected,actual);

    }
}
