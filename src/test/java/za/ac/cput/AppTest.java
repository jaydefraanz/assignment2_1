package za.ac.cput;


import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.junit.Assert.*;

public class AppTest
{
    static App myApp = new App();

    @Test
    public void fruits()
    {
        List<String> result = myApp.fruits();
        assertEquals(Arrays.asList("Apple","Banana","Watermelon","Orange"),result);
    }

    @Test
    public void cars()
    {
        Set<String> result = myApp.cars();
        assertEquals(3,result.size());
    }

    @Test
    public void cell()
    {
        Map<Integer,String> result = myApp.cell();
        assertThat(result.size(), is(6));
    }
}