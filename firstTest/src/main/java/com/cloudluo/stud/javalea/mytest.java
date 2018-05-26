package com.cloudluo.stud.javalea;

import java.lang.ref.WeakReference;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * Created by CloudLuo on 2017/4/16.
 */
public class mytest {
    Map<String, Object> hashMap = new HashMap<String, Object>();
    List<String> list1 = new ArrayList<String>();
    List<String> list2 = new LinkedList<String>();
    volatile String shareStr = "share";
    ConcurrentHashMap<String, Object> cmap = new ConcurrentHashMap<String, Object>();

}
