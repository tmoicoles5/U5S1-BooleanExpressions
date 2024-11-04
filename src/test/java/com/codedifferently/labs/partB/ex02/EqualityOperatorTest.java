package com.codedifferently.labs.partB.ex02;

import com.codedifferently.labs.partB.ex03.IfElseNameCheck;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EqualityOperatorTest {
    @Test
    public void equalityTest01(){
        String expected= "Are 4 and 5 equal? false";
        String actual = EqualityOperator.numEquality();
        Assertions.assertEquals(expected,actual);

    }
}
