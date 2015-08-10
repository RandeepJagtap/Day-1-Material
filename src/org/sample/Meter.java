package org.sample;

/**
 * Created by Randeep on 8/10/2015.
 */
public class Meter {
    private Double value;
    private static final Integer toCentiMeterFactor=100;

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
    public CentiMeter toCentiMeter(){
        CentiMeter centiMeter =new CentiMeter();
        centiMeter.setValue(this.value*toCentiMeterFactor);
        return centiMeter;
    }
}
