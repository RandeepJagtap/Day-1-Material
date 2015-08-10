package org.sample;

import junit.framework.Assert;

import static org.junit.Assert.*;

/**
 * Created by Randeep on 8/10/2015.
 */

public class MaterialTest {

    @org.junit.Test
    public void shouldTestMaterialLengthEquality(){


        CentiMeter centiMeter=new CentiMeter();
        Meter meter= new Meter();
        meter.setValue(2.0);
        centiMeter.setValue(200.0);

        Assert.assertTrue(Material.isEqual(centiMeter,meter));

    }
    @org.junit.Test
    public void shouldTestMaterialLengthNotEqual(){


        CentiMeter centiMeter=new CentiMeter();
        Meter meter= new Meter();

        meter.setValue(3.0);
        centiMeter.setValue(200.0);

        Assert.assertTrue(Material.isEqual(meter,centiMeter));

    }


}