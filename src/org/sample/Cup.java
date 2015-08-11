package org.sample;

/**
 * Created by Randeep on 8/11/2015.
 */
public class Cup extends Volume {
    private static final Double toBaseFactor=24.0;
    public Cup() {
    }
    public Cup(Double value) {
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

        return new Cup(value);
    }
}
