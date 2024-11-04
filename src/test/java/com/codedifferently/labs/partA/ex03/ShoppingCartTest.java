package com.codedifferently.labs.partA.ex03;

import com.codedifferently.labs.partA.ex03.ShoppingCart;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShoppingCartTest {
    @Test
    public void shoppingTest01(){
        String expected= "Mary Smith wants to purchase 2 Shirts\n" +
                "Total cost with tax: 45.7392";
        String actual = ShoppingCart.shopping();
        Assertions.assertEquals(expected,actual);

    }
}
