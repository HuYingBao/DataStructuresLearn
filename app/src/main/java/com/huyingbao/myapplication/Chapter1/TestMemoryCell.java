package com.huyingbao.myapplication.Chapter1;

/**
 * 使用泛型类
 * Created by liujunfeng on 2018/10/15.
 */
public class TestMemoryCell {
    public static void main(String[] args) {
        testMemoryCell();
        wrapperMemoryCell();
    }

    private static void testMemoryCell() {
        MemoryCell memoryCell = new MemoryCell();
        memoryCell.write("37");
        String val = (String) memoryCell.read();
        System.out.println("Contents is " + val);
    }

    private static void wrapperMemoryCell() {
        MemoryCell memoryCell = new MemoryCell();
        memoryCell.write(Integer.valueOf(37));
        Integer wapperVal = (Integer) memoryCell.read();
        int val = wapperVal.intValue();
        System.out.println("Contents is " + val);
    }
}
