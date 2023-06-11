package ch.zhaw.iwi.devops.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TDDTest {
  
    /**
     * 
     */
    @Test
    public void numberConverter1() {
        TDD numberConverter = new TDD();
        String transformation = numberConverter.convert(10);

        assertEquals("X",transformation);

        //assertThat("X").isEqualTo(numberConverter.convert(10));
        
                
    }

  
}
