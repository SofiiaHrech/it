package org.example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

    class Ab{
        @AnnMethod(a =2, b = 5)
        public static int substraction (int a, int b){
            int sum = a - b;
            return sum;
        }
    }
                Class<?> cls = Ab.class;
                Method[] Methods = cls.getDeclaredMethods();
                for(Method m : Methods ){
                    if(m.isAnnotationPresent(AnnMethod.class)){
                        AnnMethod test = m.getAnnotation(AnnMethod.class);
                        int res = (Integer)m.invoke(null, test.a(), test.b());
                        System.out.println((res));
                    }
        }
    }
    }