package edu.iis.mto.lab_0;

import static org.junit.Assert.assertThat;

import java.util.List;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

public class TailsTest {

    private static final String HELLO = "Hello";
    private TailsGenerator tailsGenerator;
    private List<String> tails;

    @Before
    public void setup() {

        tailsGenerator = new TailsGenerator();
        tails = tailsGenerator.tails(HELLO);
    }

    @Test
    public void tailsShouldReturnListOfStringsOfSizeEqualsToInputStringLengthPlusOne() {

        assertThat(tails, Matchers.hasSize(HELLO.length() + 1));
    }

    @Test
    public void tailsShouldReturnFullStringAsFirstElement() {

        assertThat(tails.get(0), Matchers.equalTo(HELLO));
    }

    @Test
    public void tailsShouldReturnEmptyStringAsLastElement() {

        assertThat(tails.get(tails.size() - 1), Matchers.equalTo(""));
    }

}
