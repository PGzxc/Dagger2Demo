package com.example.dagger2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface PersonForName {
    
}
