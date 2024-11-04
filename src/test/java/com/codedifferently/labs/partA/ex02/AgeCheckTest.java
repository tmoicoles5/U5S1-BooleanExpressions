package com.codedifferently.labs.partA.ex02;

import com.codedifferently.labs.partA.ex02.AgeCheck;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AgeCheckTest {
    @Test
    public void ageTest01(){
        String expected = "I'm not old enough yet... :*(";
        String actual = AgeCheck.age();
        Assertions.assertEquals(expected, actual);
    }
}
