package org.sample;

/**
 * Created by Randeep on 8/11/2015.
 */
public class Fahrenheit extends Temperature {

    public Fahrenheit() {
    }
    public Fahrenheit(Double value) {
        this.value = value;
    }

    @Override
    public Temperature toBase(){
        return new Celsius((5.0/9.0)*(getValue()-32));
    }


    @Override
    protected Temperature clone(Double value)  {

        return new Fahrenheit(value);
    }

    @Override
    protected Temperature convertFrom(Temperature src) {
        return new Fahrenheit((9.0/5.0)*(src.toBase().getValue())+32);
    }

}
