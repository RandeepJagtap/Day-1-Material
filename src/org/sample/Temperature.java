package org.sample;

/**
 * Created by Randeep on 8/11/2015.
 */
public abstract class Temperature extends  ScalarUnit<Temperature>{


    protected abstract Temperature toBase();
    protected abstract Temperature clone(Double value);

    @Override
    public boolean isEqual(Temperature temperature1,Temperature temperature2){

        return (temperature1.toBase().equals(temperature2.toBase()));
    }

    @Override
    public Temperature convert(Temperature src, Temperature target){
        return target.convertFrom(src);

    }

    protected abstract Temperature convertFrom(Temperature src);
}
