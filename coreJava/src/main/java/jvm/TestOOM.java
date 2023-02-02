package jvm;

import java.util.ArrayList;
import java.util.List;

// 模拟内存溢出的发生
public class TestOOM {

    public static void main(String[] args) {
        List<OutOfMemory> list = new ArrayList<>();

        while (true) {
            /**
             * 无限创建OutOfMemory对象，直至将堆空间占满，并且创建的OutOfMemory对象一直被list集合对象引用着，
             * 导致GC也无法回收，最终出现堆内存溢出问题
             */
            list.add(new OutOfMemory("5656"));
            System.out.println("5656");
        }
    }
}

