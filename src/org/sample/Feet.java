package org.sample;

import java.util.DoubleSummaryStatistics;

/**
 * Created by Randeep on 8/10/2015.
 */
public class Feet extends Length {

    private static final Double toCentiMeterFactor=30.48;
    public Feet(){}
    public Feet(Double value) {
        this.value = value;
    }
  @Override
    public CentiMeter toCenti() {

        CentiMeter centiMeter =new CentiMeter(this.value*toCentiMeterFactor);

        return centiMeter;
    }
    public Length convertFrom(Length centiMeter) {
        return new Feet(centiMeter.getValue()/toCentiMeterFactor);
    }
    protected Length addFrom(Length centiMeter){
        return new Feet(this.getValue()+convertFrom(centiMeter).getValue());
    }
}
