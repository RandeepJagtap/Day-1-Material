package org.sample;

/**
 * Created by Randeep on 8/11/2015.
 */
public abstract class Volume  extends ArithmeticUnit<Volume>{


    protected abstract Double getToBaseFactor();

    protected abstract Volume toBase();
    protected abstract Volume clone(Double value);

    @Override
    public boolean isEqual(Volume volume1,Volume volume2){

        return (volume1.toBase().equals(volume2.toBase()));
    }
    @Override
    public Volume convert(Volume src, Volume target){
        return target.clone(src.toBase().getValue() / target.getToBaseFactor());
    }
    @Override
    public Volume add(Volume src,Volume target) {

        return src.clone(src.getValue() + convert(target, src).getValue());
    }


}
