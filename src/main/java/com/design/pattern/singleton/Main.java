package com.design.pattern.singleton;

public class Main {
    public static void main(String[] args) {
        MyLog myLog = MyLog.getInstance();

        System.out.println("PRIORITY SET TO INFORMATION ===========");
        myLog.setPriority(Priority.INFORMATION);
        myLog.log("information", Priority.INFORMATION);
        myLog.log("warning", Priority.WARNING);
        myLog.log("error", Priority.ERROR);
        System.out.println("=======================================");

        System.out.println("PRIORITY SET TO WARNING ===========");
        myLog.setPriority(Priority.WARNING);
        myLog.log("information", Priority.INFORMATION);
        myLog.log("warning", Priority.WARNING);
        myLog.log("error", Priority.ERROR);
        System.out.println("=======================================");

        System.out.println("PRIORITY SET TO ERROR ===========");
        myLog.setPriority(Priority.ERROR);
        myLog.log("information", Priority.INFORMATION);
        myLog.log("warning", Priority.WARNING);
        myLog.log("error", Priority.ERROR);
        System.out.println("=======================================");
    }
}
