package org.sample;

/**
 * Created by Randeep on 8/10/2015.
 */
public class Meter extends Length {

    private static final Double toBaseFactor =100.0;
    public Meter(){}
    public Meter(Double value) {
        this.value = value;
    }
    @Override
    public Length toBase(){
        return new CentiMeter(getValue()*getToBaseFactor());
    }

    @Override
    public Double getToBaseFactor(){
        return toBaseFactor;
    }
    @Override
    protected Length clone(Double value)  {

        return new Meter(value);
    }


}
