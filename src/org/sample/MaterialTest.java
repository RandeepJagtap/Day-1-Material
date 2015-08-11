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

        Assert.assertTrue(new Meter().isEqual(material1.getLength(), material2.getLength()));

    }
    @Test
    public void shouldTestMaterialLengthNotEqual(){


        Material material1= new Material(new Meter(2.0));
        Material material2= new Material(new CentiMeter(300.0));

        Assert.assertFalse(new Meter().isEqual(material1.getLength(), material2.getLength()));


    }
    @Test
    public void shouldTestMaterialLengthConversion(){


        Material material1= new Material(new Meter(2.0));


       Assert.assertEquals(6.56168, new Meter().convert(material1.getLength(), new Feet()).getValue(), .001);

    }
    @Test
    public void shouldTestMaterialLengthAddition(){


        Material material1= new Material(new Feet(10.0));
        Material material2= new Material(new Meter(3.0));
        Material material3 = new Material(new Meter().add(material1.getLength(), material2.getLength()));

        Assert.assertEquals(19.8425197, material3.getLength().getValue(), .001);

    }
    @Test
    public void shouldTestVolumeEquality(){


        Volume volume1= new TeaSpoon(30.00);
        Volume volume2= new TableSpoon(10.00);

        Assert.assertTrue(new TableSpoon().isEqual(volume1, volume2));

    }
    @Test
    public void shouldTestVolumeNotEqual(){


        Volume volume1= new TeaSpoon(40.00);
        Volume volume2= new TableSpoon(10.00);

        Assert.assertFalse(new TableSpoon().isEqual(volume1, volume2));





    }

    @Test
    public void shouldTestVolumeConversion(){


        Volume volume1= new TeaSpoon(30.00);


        Assert.assertEquals(10, new TableSpoon().convert(volume1, new TableSpoon()).getValue(), .001);

    }
    @Test
    public void shouldTestVolumeAddition(){


        Volume volume1= new TeaSpoon(30.00);
        Volume volume2= new TableSpoon(10.00);
        Volume volume3 = new TeaSpoon(new TableSpoon().add(volume1, volume2).getValue());

        Assert.assertEquals(60, volume3.getValue(), .001);

    }
    @Test
    public void shouldTestTemperatureEquality(){


       Temperature temperature1=new Celsius(0.0);
        Temperature temperature2=new Fahrenheit(32.0);

        Assert.assertTrue(new Celsius().isEqual(temperature1, temperature2));

    }
    @Test
    public void shouldTestTemperatureNotEqual(){


        Temperature temperature1=new Celsius(0.0);
        Temperature temperature2=new Fahrenheit(212.0);

        Assert.assertFalse(new Celsius().isEqual(temperature1, temperature2));


    }
    @Test
    public void shouldTestTemperatureConversion(){


        Temperature temperature2=new Fahrenheit(32.0);


        Assert.assertEquals(0.0, new Celsius().convert(temperature2, new Celsius()).getValue(), .001);

    }


}