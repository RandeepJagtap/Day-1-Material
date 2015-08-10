package org.sample;

/**
 * Created by Randeep on 8/10/2015.
 */
public class Inch extends Length{
    private static final Double toCentiMeterFactor=2.54;
    public Inch(){}
    public Inch(Double value) {
        this.value = value;
    }
    @Override
    public CentiMeter toCenti() {

        CentiMeter centiMeter =new CentiMeter(this.value*toCentiMeterFactor);

        return centiMeter;
    }

    public Length convertFrom(Length centiMeter) {
        return new Inch(centiMeter.getValue()/toCentiMeterFactor);
    }
    protected Length addFrom(Length centiMeter){
        return new Inch(this.getValue()+convertFrom(centiMeter).getValue());
    }
}
