package com.wjk.test;

/**
 * Created by Administrator on 17/06/15.
 * 代理模式
 */

public class DaiLiModel{

    /**
     * 把真实角色传如代理角色中，因为实现了相同接口，所以在代理角色中的接口方法实现真实角色的接口方法。
     * 这样调用代理角色的接口方法就相当与调用了真实角色的接口方法
     * 还可以在代理角色的接口方法中，做其他处理
     */
    public static void main(String[] args) {
        Subject subject=new ProxySubject(new RealSubject());
        subject.request();
    }

}


abstract class Subject{
    abstract void request();
}

// 真实角色：实现了Subject的request()方法
class RealSubject extends Subject{

    public RealSubject() {
    }

    @Override
    void request() {
        System.out.println( " From real subject. " );
    }
}

// 代理角色：
class ProxySubject extends Subject{

    // 以真实角色作为代理角色的属性
    private  Subject realSubject;

    public ProxySubject(Subject realSubject) {
        this.realSubject = realSubject;
    }

    // 该方法封装了真实对象的request方法
    @Override
    void request() {
        realSubject.request();  // 此处执行真实对象的request方法
    }
}





