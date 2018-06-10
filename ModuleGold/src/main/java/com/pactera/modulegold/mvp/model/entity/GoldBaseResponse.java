package com.pactera.modulegold.mvp.model.entity;

import java.io.Serializable;

public class GoldBaseResponse<T> implements Serializable{
    private T results;

    public T getResults() {
        return results;
    }

    public void setResults(T results) {
        this.results = results;
    }
}
