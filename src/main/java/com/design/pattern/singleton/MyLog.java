package com.design.pattern.singleton;

import java.util.Objects;

public class MyLog {
    private static MyLog instance;
    private Priority priority;

    private MyLog() {}

    public static MyLog getInstance() {
        synchronized (MyLog.class) {
            if (Objects.isNull(instance)) {
                instance = new MyLog();
            }
        }
        return instance;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public void log(String msg, Priority msgPriority) {
        if (priority == null) {
            System.out.println("Priority not set!");
            return;
        }

        switch (priority) {
            case INFORMATION -> {
                if (msgPriority == Priority.INFORMATION) System.out.println(msg);
                if (msgPriority == Priority.WARNING) System.out.println(msg);
                if (msgPriority == Priority.ERROR) System.out.println(msg);
            }
            case WARNING -> {
                if (msgPriority == Priority.INFORMATION) break;
                if (msgPriority == Priority.WARNING) System.out.println(msg);
                if (msgPriority == Priority.ERROR) System.out.println(msg);
            }
            case ERROR -> {
                if (msgPriority == Priority.INFORMATION) break;
                if (msgPriority == Priority.WARNING) break;
                if (msgPriority == Priority.ERROR) System.out.println(msg);
            }
        }
    }
}
