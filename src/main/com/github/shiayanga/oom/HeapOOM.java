package com.github.shiayanga.oom;

import java.util.ArrayList;

/**
 * VM Args: -Xms20m -Xmx20m -XX:HeapDumpOnOutOfMemoryError
 * @author LiYang
 */
public class HeapOOM {
    static class OOMObject{}

    public static void main(String[] args) {
        ArrayList<OOMObject> list = new ArrayList<>();
        while (true){
            list.add(new OOMObject());
        }
    }
}
