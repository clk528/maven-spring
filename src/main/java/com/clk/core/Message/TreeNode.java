/**
 *
 */
package com.clk.core.Message;

import java.util.ArrayList;
import java.util.Collection;

/**
 * TODO.
 * @param <K>
 * @date 2017年5月1日 上午8:46:32
 */
public class TreeNode<K> implements Treeable<K> {

    private K id;
    private String name;

    private K parentId;

    private Collection<Treeable<K>> children;

    /*
     * (non-Javadoc)
     */
    @Override
    public void addChildren(Treeable<K> child) {
        if (children == null) {
            children = new ArrayList<>();
        }
        children.add(child);

    }

    /**
     * @return the children
     */
    @Override
    public Collection<Treeable<K>> getChildren() {
        return children;
    }

    /**
     * @return the id
     */
    @Override
    public K getId() {
        return id;
    }

    /**
     * @return the name
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * @return the parentId
     */
    @Override
    public K getParentId() {
        return parentId;
    }

    /**
     * @param children the children to set
     */
    public void setChildren(Collection<Treeable<K>> children) {
        this.children = children;
    }

    /**
     * @param id the id to set
     */
    @Override
    public void setId(K id) {
        this.id = id;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param parentId the parentId to set
     */
    public void setParentId(K parentId) {
        this.parentId = parentId;
    }

}
