package org.sample;

/**
 * Created by Randeep on 8/10/2015.
 */
public abstract class Length extends  ArithmeticUnit<Length>{
    protected abstract Double getToBaseFactor();

    protected abstract Length toBase();
    protected abstract Length clone(Double value);

    @Override
    public boolean isEqual(Length length1,Length length2){

        return (length1.toBase().equals(length2.toBase()));
    }
    @Override
    public Length convert(Length src, Length target){
       return target.clone(src.toBase().getValue() / target.getToBaseFactor());
        }
    @Override
    public Length add(Length src,Length target) {

        return src.clone(src.getValue()+convert(target,src).getValue());
    }

}

