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
    @Test
    public void GivenThreeNumbersIfEnteredGreaterNumberAtSecondPlaceShouldPass()
    {
        Generics g = new Generics(10, 20, 5);
        Integer result = g.max();
        Assert.assertEquals(g.b , result);
    }
    @Test
    public void GivenThreeNumbersIfEnteredGreaterNumberAtThirdPlaceShouldPass()
    {
        Generics g = new Generics(10, 20, 50);
        Integer result = g.max();
        Assert.assertEquals(g.c , result);
    }
}
