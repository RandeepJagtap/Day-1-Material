package org.sample;

/**
 * Created by Randeep on 8/11/2015.
 */
public abstract class Volume extends Unit{


    protected abstract Double getToBaseFactor();

    protected abstract Volume toBase();
    protected abstract Volume clone(Double value);


    public static boolean isEqual(Volume volume1,Volume volume2){

        return (volume1.toBase().equals(volume2.toBase()));
    }

    public static Volume convert(Volume src, Volume target){
        return target.clone(src.toBase().getValue() / target.getToBaseFactor());
    }

    public static Volume add(Volume src,Volume target) {

        return src.clone(src.getValue() + convert(target, src).getValue());
    }


}
