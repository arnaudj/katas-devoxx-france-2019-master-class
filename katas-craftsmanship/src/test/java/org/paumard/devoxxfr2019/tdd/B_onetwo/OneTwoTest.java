/*
 * Copyright (C) 2019 José Paumard
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.paumard.devoxxfr2019.tdd.B_onetwo;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This is one more TDD Kata, made to practice TDD at a intermediate level. This kata is a good way to
 * practice the implementation of the Strategy pattern. The good news id that the tests have
 * already been written. The rule is the following: write the simplest code to make the test pass one by one,
 * in the order they appear in this class. Remember: you need to find the minimal code that will one test pass
 * at a time!
 * <p/>
 * The OneTwo Kata
 * <p/>
 * We need a method to convert strings to other strings in the following way. To understand the conversion,
 * just read the input string. The first example string shows one two. There is indeed one number, and this
 * number is two.
 * <ul><code>2</code> -> <code>one two</code></ul>
 * <ul><code>1 2</code> -> <code>one one one two</code></ul>
 * <p/>
 * Easy. Now, we can also count numbers, as in the following examples.
 * <ul><code>2 2</code> -> <code>two two</code></ul>
 * <ul><code>3 9 9 9 8 8</code> -> <code>one three three nine two eight</code></ul>
 * <ul><code>1 1 1 1 1 1 1</code> -> <code>seven one</code></ul> (Brasilians will love this example)
 * <ul><code>2 4 4 4 6 6 6 6 6</code> -> <code>one two three four five six</code></ul>
 * Got it? Now, to keep things simple, we do not count past 9. Thus the conversion of the following string.
 * <p/>
 * <ul><code>5 5 5 5 5 5 5 5 5 5 5 5</code> -> <code>nine five three five</code></ul>
 * And of course we would like a second method to do the opposite conversion.
 */
@FixMethodOrder(MethodSorters.JVM)
public class OneTwoTest {

    @Test
    public void should_return_one_one_for_1() {

        // Given
        OneTwo oneTwo = new OneTwo();
        String input = "1";
        String expectedResult = "one one";

        // When
        String result = oneTwo.convertToNames(input);

        // Then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    public void should_return_one_two_for_2() {

        // Given
        OneTwo oneTwo = new OneTwo();
        String input = "2";
        String expectedResult = "one two";

        // When
        String result = oneTwo.convertToNames(input);

        // Then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    public void should_return_one_three_for_3() {

        // Given
        OneTwo oneTwo = new OneTwo();
        String input = "3";
        String expectedResult = "one three";

        // When
        String result = oneTwo.convertToNames(input);

        // Then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    public void should_return_one_four_for_4() {

        // Given
        OneTwo oneTwo = new OneTwo();
        String input = "4";
        String expectedResult = "one four";

        // When
        String result = oneTwo.convertToNames(input);

        // Then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    public void should_return_one_five_for_5() {

        // Given
        OneTwo oneTwo = new OneTwo();
        String input = "5";
        String expectedResult = "one five";

        // When
        String result = oneTwo.convertToNames(input);

        // Then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    public void should_return_one_six_for_6() {

        // Given
        OneTwo oneTwo = new OneTwo();
        String input = "6";
        String expectedResult = "one six";

        // When
        String result = oneTwo.convertToNames(input);

        // Then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    public void should_return_one_seven_for_7() {

        // Given
        OneTwo oneTwo = new OneTwo();
        String input = "7";
        String expectedResult = "one seven";

        // When
        String result = oneTwo.convertToNames(input);

        // Then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    public void should_return_one_eight_for_8() {

        // Given
        OneTwo oneTwo = new OneTwo();
        String input = "8";
        String expectedResult = "one eight";

        // When
        String result = oneTwo.convertToNames(input);

        // Then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    public void should_return_one_nine_for_9() {

        // Given
        OneTwo oneTwo = new OneTwo();
        String input = "9";
        String expectedResult = "one nine";

        // When
        String result = oneTwo.convertToNames(input);

        // Then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    public void should_return_one_nine_one_six_for_9_6() {

        // Given
        OneTwo oneTwo = new OneTwo();
        String input = "9 6";
        String expectedResult = "one nine one six";

        // When
        String result = oneTwo.convertToNames(input);

        // Then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    public void should_return_two_one_for_1_1() {

        // Given
        OneTwo oneTwo = new OneTwo();
        String input = "1 1";
        String expectedResult = "two one";

        // When
        String result = oneTwo.convertToNames(input);

        // Then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    public void should_return_two_two_for_2_2() {

        // Given
        OneTwo oneTwo = new OneTwo();
        String input = "2 2";
        String expectedResult = "two two";

        // When
        String result = oneTwo.convertToNames(input);

        // Then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    public void should_return_one_three_three_nine_two_eight_for_3_9_9_9_8_8() {

        // Given
        OneTwo oneTwo = new OneTwo();
        String input = "3 9 9 9 8 8";
        String expectedResult = "one three three nine two eight";

        // When
        String result = oneTwo.convertToNames(input);

        // Then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    public void should_return_seven_one_for_1_1_1_1_1_1_1() {

        // Given
        OneTwo oneTwo = new OneTwo();
        String input = "1 1 1 1 1 1 1";
        String expectedResult = "seven one";

        // When
        String result = oneTwo.convertToNames(input);

        // Then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    public void should_return_one_two_three_four_five_six_for_2_4_4_4_6_6_6_6_6() {

        // Given
        OneTwo oneTwo = new OneTwo();
        String input = "2 4 4 4 6 6 6 6 6";
        String expectedResult = "one two three four five six";

        // When
        String result = oneTwo.convertToNames(input);

        // Then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    public void should_return_nine_five_three_five_for_5_5_5_5_5_5_5_5_5_5_5_5() {

        // Given
        OneTwo oneTwo = new OneTwo();
        String input = "5 5 5 5 5 5 5 5 5 5 5 5";
        String expectedResult = "nine five three five";

        // When
        String result = oneTwo.convertToNames(input);

        // Then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    public void should_return_1_for_one_one() {

        // Given
        OneTwo oneTwo = new OneTwo();
        String input = "one one";
        String expectedResult = "1";

        // When
        String result = oneTwo.convertToFigures(input);

        // Then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    public void should_return_2_for_one_two() {

        // Given
        OneTwo oneTwo = new OneTwo();
        String input = "one two";
        String expectedResult = "2";

        // When
        String result = oneTwo.convertToFigures(input);

        // Then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    public void should_return_3_for_one_three() {

        // Given
        OneTwo oneTwo = new OneTwo();
        String input = "one three";
        String expectedResult = "3";

        // When
        String result = oneTwo.convertToFigures(input);

        // Then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    public void should_return_4_for_one_four() {

        // Given
        OneTwo oneTwo = new OneTwo();
        String input = "one four";
        String expectedResult = "4";

        // When
        String result = oneTwo.convertToFigures(input);

        // Then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    public void should_return_5_for_one_five() {

        // Given
        OneTwo oneTwo = new OneTwo();
        String input = "one five";
        String expectedResult = "5";

        // When
        String result = oneTwo.convertToFigures(input);

        // Then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    public void should_return_6_for_one_six() {

        // Given
        OneTwo oneTwo = new OneTwo();
        String input = "one six";
        String expectedResult = "6";

        // When
        String result = oneTwo.convertToFigures(input);

        // Then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    public void should_return_7_for_one_seven() {

        // Given
        OneTwo oneTwo = new OneTwo();
        String input = "one seven";
        String expectedResult = "7";

        // When
        String result = oneTwo.convertToFigures(input);

        // Then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    public void should_return_8_for_one_eight() {

        // Given
        OneTwo oneTwo = new OneTwo();
        String input = "one eight";
        String expectedResult = "8";

        // When
        String result = oneTwo.convertToFigures(input);

        // Then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    public void should_return_9_for_one_nine() {

        // Given
        OneTwo oneTwo = new OneTwo();
        String input = "one nine";
        String expectedResult = "9";

        // When
        String result = oneTwo.convertToFigures(input);

        // Then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    public void should_return_3_3_for_two_three() {

        // Given
        OneTwo oneTwo = new OneTwo();
        String input = "two three";
        String expectedResult = "3 3";

        // When
        String result = oneTwo.convertToFigures(input);

        // Then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    public void should_return_3_3_5_5_5_5_for_two_three_four_five() {

        // Given
        OneTwo oneTwo = new OneTwo();
        String input = "two three four five";
        String expectedResult = "3 3 5 5 5 5";

        // When
        String result = oneTwo.convertToFigures(input);

        // Then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    public void should_return_2_4_4_4_6_6_6_6_6_for_one_two_three_four_five_six() {

        // Given
        OneTwo oneTwo = new OneTwo();
        String input = "one two three four five six";
        String expectedResult = "2 4 4 4 6 6 6 6 6";

        // When
        String result = oneTwo.convertToFigures(input);

        // Then
        assertThat(result).isEqualTo(expectedResult);
    }
}
