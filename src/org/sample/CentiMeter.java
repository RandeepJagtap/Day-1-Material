package org.sample;

/**
 * Created by Randeep on 8/10/2015.
 */
public class CentiMeter extends Length{


    public CentiMeter(){}
    public CentiMeter(Double value) {
        this.value = value;
    }



    @Override
    public CentiMeter toCenti() {
        return this;
    }

    @Override
    public Length convertFrom(Length centiMeter) {
        return this;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CentiMeter)) return false;

        CentiMeter that = (CentiMeter) o;

        return !(getValue() != null ? !getValue().equals(that.getValue()) : that.getValue() != null);

    }

    @Override
    public int hashCode() {
        return getValue() != null ? getValue().hashCode() : 0;
    }
    protected Length addFrom(Length centiMeter){
        return new CentiMeter(this.getValue()+convertFrom(centiMeter).getValue());
    }
}
