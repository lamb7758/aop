package com.lamb7758.demo.aop.annotation;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import java.lang.annotation.*;

/**
 * @author ：高阳
 * @date ：Created in 2019/9/19 10:12
 * @description：
 * @modified By：
 * @version:
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
@Order(Ordered.HIGHEST_PRECEDENCE)
public @interface SystemControllerLog {
}
