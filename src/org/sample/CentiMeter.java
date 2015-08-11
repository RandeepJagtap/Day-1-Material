package org.sample;

/**
 * Created by Randeep on 8/10/2015.
 */
public class CentiMeter extends Length {

    private static final Double toBaseFactor =1.0;
    public CentiMeter(){}
    public CentiMeter(Double value) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CentiMeter)) return false;

        CentiMeter centiMeter = (CentiMeter) o;

        return Double.compare(centiMeter.getValue(), getValue()) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(getValue());
        return (int) (temp ^ (temp >>> 32));
    }


    @Override
    protected Length clone(Double value)  {

        return new CentiMeter(value);
    }
}
