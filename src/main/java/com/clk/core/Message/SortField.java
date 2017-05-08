package com.clk.core.Message;

import java.io.Serializable;

/**
 * @version 1.0
 * @since JDK 1.7
 * @see
 */
public class SortField implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * @Fields name : 排序名称
     */
    private String name;
    /**
     * @Fields direction :排序方向 1:升序，0:降序
     */
    private boolean direction = Boolean.TRUE;

    public SortField() {

    }

    public SortField(String name2, boolean direction2) {

        setName(name2);
        setDirection(direction2);

    }

    public String getName() {
        return name;
    }

    public boolean isDirection() {
        return direction;
    }

    public void setDirection(boolean direction) {
        this.direction = direction;
    }

    public void setName(String name) {
        this.name = name;
    }

}
