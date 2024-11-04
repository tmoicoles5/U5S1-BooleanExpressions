package com.codedifferently.labs.partB.ex03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IfElseNameCheckTest {

    @Test
    public void nameTest01(){
        String name = "Elvis";
        String expected= "You are the king of rock and roll";
        String actual = IfElseNameCheck.nameCheck(name);
        Assertions.assertEquals(expected,actual);

    }
}
