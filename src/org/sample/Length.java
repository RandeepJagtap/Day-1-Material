package org.sample;

/**
 * Created by Randeep on 8/10/2015.
 */
public abstract class Length {
    protected double value;
    public abstract CentiMeter toCenti();
    public abstract Length convertFrom(Length centiMeter);
    public Double getValue() {
        return value;
    }
    public static boolean isEqual(Length length1,Length length2){

        return (length1.toCenti().equals(length2.toCenti()));
    }

    public static Length convert(Length src , Length target){

       return target.convertFrom(src.toCenti());
        }

    public static Length add(Length src,Length target) {
        return src.addFrom(target.toCenti());
    }

    protected abstract Length addFrom(Length centiMeter);
}

