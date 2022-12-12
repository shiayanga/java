package com.github.shiayanga.oom;

/**
 * 使用 {@code -Xss} 减少栈内存容量，抛出 StackOverFlowError
 * <p>
 * VM Args: -Xss228k
 * @author liyang
 */
public class JavaVMStackSOF {
    private int stackLength = 1;
    public void stackLeak(){
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        JavaVMStackSOF oom = new JavaVMStackSOF();
        try {
            oom.stackLeak();
        }catch (Throwable t){
            System.out.println("stack length:" + oom.stackLength);
            throw t;
        }
    }
}
