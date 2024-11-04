package com.codedifferently.labs.partB.ex04;

import com.codedifferently.labs.partA.ex03.ShoppingCart;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IfElseTest {
    @Test
    public void luckyNumberTest01(){
        String expected= "That's unlucky!";
        String actual = IfElse.equalToSeven();
        Assertions.assertEquals(expected,actual);

    }
}
