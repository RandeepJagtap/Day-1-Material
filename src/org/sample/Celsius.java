package org.sample;

/**
 * Created by Randeep on 8/11/2015.
 */
public class Celsius extends Temperature {
    

    public Celsius() {
    }
    public Celsius(Double value) {
        this.value = value;
    }


    @Override
    public Temperature toBase(){
        return new Celsius(getValue());
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Celsius)) return false;

        Celsius celsius = (Celsius) o;

        return Double.compare(celsius.getValue(), getValue()) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(getValue());
        return (int) (temp ^ (temp >>> 32));
    }


    @Override
    protected Temperature clone(Double value)  {

        return new Celsius(value);
    }

    @Override
    protected Temperature convertFrom(Temperature src) {
        return new Celsius(src.toBase().getValue());
    }
}
