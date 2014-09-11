package com.cmwebgame.core;

/**
 * Object which has resource to release should implement this interface.
 * 
 * @author Michael Liao (askxuefeng@gmail.com)
 */
public interface Destroyable {

    /**
     * Called when container destroy the object.
     */
    void destroy();

}
