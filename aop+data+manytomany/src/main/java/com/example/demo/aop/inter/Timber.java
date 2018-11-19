package com.example.demo.aop.inter;

import java.lang.annotation.*;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/7/8  20:40
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public  @interface Timber {
    boolean save() default false;

    boolean remove() default false;
}
