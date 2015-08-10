package org.sample;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Randeep on 8/10/2015.
 */

public class MaterialTest {

    @Test
    public void shouldTestMaterialLengthEquality(){


        Material material1= new Material(new Meter(2.0));
        Material material2= new Material(new CentiMeter(200.0));

        Assert.assertTrue(Length.isEqual(material1.getLength(),material2.getLength()));

    }
    @Test
    public void shouldTestMaterialLengthNotEqual(){


        Material material1= new Material(new Meter(2.0));
        Material material2= new Material(new CentiMeter(300.0));

        Assert.assertFalse(Length.isEqual(material1.getLength(), material2.getLength()));


    }
    @Test
    public void shouldTestMaterialLengthConversion(){


        Material material1= new Material(new Meter(2.0));


       Assert.assertEquals(6.56168, Length.convert(material1.getLength(), new Feet()).getValue(), .001);

    }
    @Test
    public void shouldTestMaterialLengthAddition(){


        Material material1= new Material(new Feet(10.0));
        Material material2= new Material(new Meter(3.0));
        Material material3 = new Material(Length.add(material1.getLength(),material2.getLength()));

        Assert.assertEquals(19.8425197, material3.getLength().getValue(), .001);

    }




}