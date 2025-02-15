package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }

    @Test
    public void knowsAboutFrost() throws Exception {
        assertThat(queryProcessor.process("Frost"), containsString("poet"));
    }

    @Test
    public void isNotCaseSensitiveFrost() throws Exception {
        assertThat(queryProcessor.process("frost"), containsString("poet"));
    }

    @Test
    public void testLargest() throws Exception {
        assertThat(queryProcessor.process("which of the following numbers is the largest: 1, 2"), containsString("2"));
    }
}
