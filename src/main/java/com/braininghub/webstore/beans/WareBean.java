package com.braininghub.webstore.beans;

/**
 * Created by kopig on 2019. 05. 14..
 */
public class WareBean {
    private boolean successfullyCreated;
    private String name;

    public boolean isSuccessfullyCreated() {
        return successfullyCreated;
    }

    public void setSuccessfullyCreated(boolean successfullyCreated) {
        this.successfullyCreated = successfullyCreated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
