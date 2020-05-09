package com.kovko.equalshascode;

import lombok.Getter;
import lombok.Setter;

/**
 * Author: eukovko
 * Date: 5/1/2020
 */
@Getter
@Setter
public class ColorPointWithFaultySymmetry extends Point{

    private String color;

    public ColorPointWithFaultySymmetry(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof ColorPointWithFaultySymmetry) {
            ColorPointWithFaultySymmetry o = (ColorPointWithFaultySymmetry) object;
            if (this.color == null){
                    return o.color==null && super.equals(o);
            } else {
                return color.equals(o.color) && super.equals(o);
            }
        }
        return false;
    }
}
