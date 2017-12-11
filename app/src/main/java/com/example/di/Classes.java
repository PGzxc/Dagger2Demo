package com.example.di;

/**
 */
public class Classes implements BoyInjection {
    //....

    private Boy boy;

    @Override
    public void inject(Boy boy) {
        this.boy = boy;
    }

    //....

}
