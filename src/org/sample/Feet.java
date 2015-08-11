package org.sample;

/**
 * Created by Randeep on 8/10/2015.
 */
public class Feet extends Length {

    private static final Double toBaseFactor =30.48;
    public Feet(){}
    public Feet(Double value) {
        this.value = value;
    }
    @Override
    public Double getToBaseFactor(){
        return toBaseFactor;
    }
    @Override
    public Length toBase(){
        return new CentiMeter(getValue()*getToBaseFactor());
    }
    @Override
    protected Length clone(Double value)  {

        return new Feet(value);
    }



}
