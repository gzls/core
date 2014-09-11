package com.cmwebgame.core.container;

import java.util.List;

import com.cmwebgame.core.Config;

/**
 * Factory instance for creating IoC container.
 * 
 * @author Michael Liao (askxuefeng@gmail.com)
 */
public interface ContainerFactory {

    /**
     * Init container factory.
     */
    void init(Config config);

    /**
     * Find all beans in container.
     */
    List<Object> findAllBeans();

    /**
     * When container destroyed.
     */
    void destroy();
}
