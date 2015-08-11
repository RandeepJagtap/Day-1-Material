package org.sample;

/**
 * Created by Randeep on 8/11/2015.
 */
public class TableSpoon extends Volume {
    private static final Double toBaseFactor=3.0;
    public TableSpoon() {
    }
    public TableSpoon(Double value) {
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

        return new TableSpoon(value);
    }
}
