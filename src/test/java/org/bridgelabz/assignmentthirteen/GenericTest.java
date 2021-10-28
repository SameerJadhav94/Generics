package org.bridgelabz.assignmentthirteen;
import org.junit.Assert;
import org.junit.Test;


public class GenericTest
{
    @Test
    public void GivenThreeFloatNumbersIfEnteredGreaterNumberAtFirstPlaceShouldPass()
    {
        Generics g = new Generics(20.95f, 20.85f, 20.75f);
        Float result = g.max();
        Assert.assertEquals(g.a , result);
    }
    @Test
    public void GivenThreeFloatNumbersIfEnteredGreaterNumberAtSecondPlaceShouldPass()
    {
        Generics g = new Generics(20.85f, 20.95f, 20.75f);
        Float result = g.max();
        Assert.assertEquals(g.b , result);
    }
    @Test
    public void GivenThreeFloatNumbersIfEnteredGreaterNumberAtThirdPlaceShouldPass()
    {
        Generics g = new Generics(20.85f, 20.75f, 20.95f);
        Float result = g.max();
        Assert.assertEquals(g.c , result);
    }
}
