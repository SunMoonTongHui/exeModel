package org.exemodel.util;

/**
 * @author zp [15951818230@163.com]
 */
public interface MapTo<T,E> {
    T apply(E t);
}
