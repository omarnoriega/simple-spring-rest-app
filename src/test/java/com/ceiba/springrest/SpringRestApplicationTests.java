package com.ceiba.springrest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

@SpringBootTest
class SpringRestApplicationTests {

    @Test
    void testDate() {

        Date date1 = new Date();
        Date date2 = date1;
        assertEquals(date1, date2);
        assertSame(date1,date2);

    }

}
