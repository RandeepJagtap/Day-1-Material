package org.sample;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Randeep on 8/10/2015.
 */

public class MaterialTest {

    @Test
    public void shouldTestMaterialLengthEquality(){


        Material material1= new Material(new Meter(2.0));
        Material material2= new Material(new CentiMeter(200.0));

        Assert.assertTrue(Length.isEqual(material1.getLength(), material2.getLength()));

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
        Material material3 = new Material(Length.add(material1.getLength(), material2.getLength()));

        Assert.assertEquals(19.8425197, material3.getLength().getValue(), .001);

    }
    @Test
    public void shouldTestVolumeEquality(){


        Volume volume1= new TeaSpoon(30.00);
        Volume volume2= new TableSpoon(10.00);

        Assert.assertTrue(Volume.isEqual(volume1, volume2));

    }
    @Test
    public void shouldTestVolumeNotEqual(){


        Volume volume1= new TeaSpoon(40.00);
        Volume volume2= new TableSpoon(10.00);

        Assert.assertFalse(Volume.isEqual(volume1, volume2));





    }

    @Test
    public void shouldTestVolumeConversion(){


        Volume volume1= new TeaSpoon(30.00);


        Assert.assertEquals(10, Volume.convert(volume1, new TableSpoon()).getValue(), .001);

    }
    @Test
    public void shouldTestVolumeAddition(){


        Volume volume1= new TeaSpoon(30.00);
        Volume volume2= new TableSpoon(10.00);
        Volume volume3 = new TeaSpoon(Volume.add(volume1, volume2).getValue());

        Assert.assertEquals(60, volume3.getValue(), .001);

    }


}