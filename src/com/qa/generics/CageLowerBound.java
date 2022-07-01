package com.qa.generics;

import java.util.List;

public class CageLowerBound {

    private List<? super Elephant> list;

    public void add(List<? super Elephant> list) {
        this.list = list;
    }

    public List<? super Elephant> get() {
        return list;
    }
}
