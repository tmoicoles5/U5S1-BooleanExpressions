package com.codedifferently.labs.partC;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlgoChallengeTest {
    // Problem 08 Test
    @Test
    public void startWithIxTest01(){

        // Given
        String str = "mix snacks";

        // When
        Boolean expected = true;
        Boolean actual = AlgoChallenge.startWithIx(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }



    @Test
    public void startWithIxTest02(){

        // Given
        String str = "pix snacks";

        // When
        Boolean expected = true;
        Boolean actual = AlgoChallenge.startWithIx(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void startWithIxTest03(){

        // Given
        String str = "piz snacks";

        // When
        Boolean expected = false;
        Boolean actual = AlgoChallenge.startWithIx(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void startWithIxTest04(){

        // Given
        String str = "9ix snacks";

        // When
        Boolean expected = true;
        Boolean actual = AlgoChallenge.startWithIx(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    // Problem 09 Test
    @Test
    public void near10Test01() {

        // Given
        int a = 8;
        int b = 13;
        // When
        Integer expected = 8;
        Integer actual = AlgoChallenge.near10(a,b);
        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void near10Test02() {

        // Given
        int a = 13;
        int b = 8;
        // When
        Integer expected = 8;
        Integer actual = AlgoChallenge.near10(a,b);
        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void near10Test03() {

        // Given
        int a = 13;
        int b = 7;
        // When
        Integer expected = 0;
        Integer actual = AlgoChallenge.near10(a,b);
        // Then
        Assertions.assertEquals(expected, actual);
    }
}
