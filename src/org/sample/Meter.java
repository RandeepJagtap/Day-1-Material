package org.sample;

/**
 * Created by Randeep on 8/10/2015.
 */
public class Meter extends Length{

    private static final Double toCentiMeterFactor=100.0;
    public Meter(){}
    public Meter(Double value) {
        this.value = value;
    }




    @Override
    public CentiMeter toCenti() {

        CentiMeter centiMeter =new CentiMeter(this.value*toCentiMeterFactor);

        return centiMeter;
    }

    public Length convertFrom(Length centiMeter) {
        return new Meter(centiMeter.getValue()/toCentiMeterFactor);
    }
    protected Length addFrom(Length centiMeter){
        return new Meter(this.getValue()+convertFrom(centiMeter).getValue());
    }
}
