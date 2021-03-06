﻿/**
 *
 */
package com.clk.core.Message;

import java.util.Collection;

/**
 * TODO.
 *
 * @param <K>
 * @param <V>
 * @date 2017年4月15日 下午12:18:34
 */
public interface Treeable<K> extends Id<K> {

    void addChildren(Treeable<K> child);

    Collection<Treeable<K>> getChildren();

    String getName();

    K getParentId();
}
