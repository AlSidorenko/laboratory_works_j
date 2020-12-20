package org.example.lab_01;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 09.12.2020 3:16.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class Laboratory_01_Test {

    @Test
    public void whenTestLab01() {
        Laboratory_01 lab = new Laboratory_01();
        double result = lab.function(2.25,1.05);
        double expected = 3.8644908107496994;

        assertThat(result, is(expected));

    }
}
