package org.sample;

/**
 * Created by Randeep on 8/10/2015.
 */
public class Material {
    private Length length;
    public Material(){}
    public Material(Length length) {
        this.length = length;
    }

    public Length getLength() {
        return length;
    }
}
