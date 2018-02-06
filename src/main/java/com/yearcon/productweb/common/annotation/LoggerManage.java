package com.yearcon.productweb.common.annotation;

import java.lang.annotation.*;

/**
 * 这个注解很简单只有一个对方法的描述.并且这是一个方法级别的注解.
 * @author ayong
 * @create 2018-02-06 10:36
 **/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LoggerManage {
    public String logDescription();
}
