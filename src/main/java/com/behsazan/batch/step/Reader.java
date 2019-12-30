package com.behsazan.batch.step;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

/**
 * Created by motavali on 12/30/2019.
 */
public class Reader implements ItemReader<String> {

    private String[] messages = { "behsazan.com",
            "Welcome to Spring Batch Example",
            "We use H2 Database for this example" };

    private int count = 0;

    @Override
    public String read() throws Exception, UnexpectedInputException,
            ParseException, NonTransientResourceException {

        if (count < messages.length) {
            return messages[count++];
        } else {
            count = 0;
        }
        return null;
    }

}
