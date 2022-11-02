package com.example.myapplication.factories;

public interface AbstractFactory<T, V> {
    T create(V value);
}
