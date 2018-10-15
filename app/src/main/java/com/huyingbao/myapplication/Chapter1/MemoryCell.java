package com.huyingbao.myapplication.Chapter1;

/**
 * 使用Object表示泛型
 * Created by liujunfeng on 2018/10/15.
 */
public class MemoryCell {
    private Object storedValue;

    public Object read() {
        return storedValue;
    }

    public void write(Object x) {
        storedValue = x;
    }
}
