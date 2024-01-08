package ru.mirea.it.ivbo01.n1;

public class ThreeGenericParams<T, V, K> {
    T t;
    V v;
    K k;

    public ThreeGenericParams(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public void printClassNames() {
        System.out.println("Class name of T: " + t.getClass().getName());
        System.out.println("Class name of V: " + v.getClass().getName());
        System.out.println("Class name of K: " + k.getClass().getName());
    }

}