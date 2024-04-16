package com.haivis.flow.common;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface PersistenceAdapter {

    /**
     * 이 값은 논리적 구성 요소 이름에 대한 제안을 나타낼 수 있습니다,
     * 자동으로 감지되는 부품의 경우 스프링 빈으로 바뀝니다.
     * @제안된 구성요소 이름(있는 경우)을 반환합니다(아니면 String을 비워 둡니다
     */
    @AliasFor(annotation = Component.class)
    String value() default "";

}
