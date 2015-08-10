package org.sample;

/**
 * Created by Randeep on 8/10/2015.
 */
public class Material {

    public static boolean isEqual(Meter meter,CentiMeter centiMeter){

        return (meter.toCentiMeter()==centiMeter);
    }

    public static boolean isEqual(CentiMeter centiMeter,Meter meter){
        return (centiMeter.toMeter().getValue().equals(meter.getValue()));
    }

}
