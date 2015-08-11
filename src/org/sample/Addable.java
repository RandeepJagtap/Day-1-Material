package org.sample;

/**
 * Created by Randeep on 8/11/2015.
 */
public interface Addable<A extends Unit> {
    public A add(A src,A target);
}
