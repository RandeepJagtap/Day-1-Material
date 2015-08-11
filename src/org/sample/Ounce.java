package org.sample;

/**
 * Created by Randeep on 8/11/2015.
 */
public class Ounce extends Volume {
    private static final Double toBaseFactor=6.0;
    public Ounce() {
    }
    public Ounce(Double value) {
        this.value = value;
    }

    @Override
    public Volume toBase(){
        return new TeaSpoon(getValue()*getToBaseFactor());
    }

    @Override
    public Double getToBaseFactor(){
        return toBaseFactor;
    }
    @Override
    protected Volume clone(Double value)  {

        return new Ounce(value);
    }
}
