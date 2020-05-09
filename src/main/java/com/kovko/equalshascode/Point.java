package com.kovko.equalshascode;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;

/**
 * Author: eukovko
 * Date: 5/1/2020
 */
@Data
@AllArgsConstructor
public class Point {

    private int x;
    private int y;

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if(object instanceof Point){
            Point point = (Point) object;
            return x == point.x &&
                    y == point.y;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
