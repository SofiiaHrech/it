package org.example;

import java.lang.annotation.*;

    @Target(value= ElementType.METHOD)
    @Retention(value= RetentionPolicy.RUNTIME)
    public @interface AnnMethod {
        int a() ;
        int b() ;
    }
