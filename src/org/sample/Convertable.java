package org.sample;

/**
 * Created by Randeep on 8/11/2015.
 */
public interface Convertable<A extends Unit> {

    public A convert(A src, A target);
}
