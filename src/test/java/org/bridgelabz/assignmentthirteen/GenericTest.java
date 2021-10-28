package org.bridgelabz.assignmentthirteen;
import org.junit.Assert;
import org.junit.Test;


public class GenericTest
{
    @Test
    public void GivenThreeNumbersIfEnteredGreaterNumberAtFirstPlaceShouldPass()
    {
        Generics g = new Generics(20, 10, 5);
        Integer result = g.max();
        Assert.assertEquals(g.a , result);
    }
}
