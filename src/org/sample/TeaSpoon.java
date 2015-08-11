package org.sample;

/**
 * Created by Randeep on 8/11/2015.
 */
public class TeaSpoon extends Volume {
    private static final Double toBaseFactor =1.0;
    public TeaSpoon(){}
    public TeaSpoon(Double value) {
        this.value = value;
    }
    @Override
    public Double getToBaseFactor(){
        return toBaseFactor;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TeaSpoon)) return false;

        TeaSpoon teaSpoon = (TeaSpoon) o;

        return Double.compare(teaSpoon.getValue(), getValue()) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(getValue());
        return (int) (temp ^ (temp >>> 32));
    }

    public Volume toBase(){
        return new TeaSpoon(getValue()*getToBaseFactor());
    }


    @Override
    protected Volume clone(Double value)  {

        return new TeaSpoon(value);
    }


}
