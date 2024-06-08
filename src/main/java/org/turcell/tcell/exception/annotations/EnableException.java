package org.turcell.tcell.exception.annotations;

import org.springframework.context.annotation.ComponentScan;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@ComponentScan(basePackages = {"com.turkcell.tcell.exception"}) // ana proje dışarısında ki başka paket taraması amacıyla
public @interface EnableException {
}
