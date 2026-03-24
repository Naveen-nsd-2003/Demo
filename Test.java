package org.example;

class Test {
    public void show(double x) {
        System.out.println("Double " +x);
    }
    public void show(long x) {
        System.out.println("Long  " +x);
    }
    public void show(Object x) {
        System.out.println("Object  " +x);
    }
    public static void main(String[] args) {
        new Test().show(12);
    }
}
