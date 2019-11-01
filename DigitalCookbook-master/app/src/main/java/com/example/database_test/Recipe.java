package com.example.database_test;


public class Recipe {

    private String mText;
    private long mUpdateTime;

    public Recipe() {}

    public Recipe(String text) {
        mText = text;
        mUpdateTime = System.currentTimeMillis();
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public long getUpdateTime() {
        return mUpdateTime;
    }

    public void setUpdateTime(long updateTime) {
        mUpdateTime = updateTime;
    }
}
