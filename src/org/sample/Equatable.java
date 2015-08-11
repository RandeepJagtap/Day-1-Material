package org.sample;

/**
 * Created by Randeep on 8/11/2015.
 */
public interface Equatable<A extends Unit> {
    public boolean isEqual(A a1,A a2);
}
