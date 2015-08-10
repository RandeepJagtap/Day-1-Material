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

        Meter meter = new Meter(2.0);

       Assert.assertEquals(6.56168, Length.convert(material1.getLength(), new Feet()).getValue(), .001);


    }
//    @org.junit.Test
//    public void shouldTestMaterialLengthConversionFail(){
//
//
//        Material material1= new Material(new Meter(2.0));
//
//        Meter meter = new Meter(2.0);
//
//        Assert.assertEquals(6.66168, Length.convert(material1.getLength(), new Feet()).getValue(),.001);
//
//    }
}