package com.wjk.imp;

/**
 * Created by WJK on 2016/9/8.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
