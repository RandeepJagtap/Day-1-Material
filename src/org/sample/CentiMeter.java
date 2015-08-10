package org.sample;

/**
 * Created by Randeep on 8/10/2015.
 */
public class CentiMeter {
    private Double value;
    private static final Integer toMeterFactor=100;

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
    public Meter toMeter(){
        Meter meter =new Meter();
        meter.setValue(this.value/toMeterFactor);
        return meter;
    }
}
