package com.example.validation.constraints.annotations;

import com.example.validation.constraints.EmailWhitelistValidator;
import com.example.validation.constraints.Phone010Validator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// @Phone010 가 붙은 필드는
@Target(ElementType.FIELD) // 어노테이션을 어디에 적용할 것인지 (선택)
@Retention(RetentionPolicy.RUNTIME) // 어노테이션이 언제까지 유지 될 것인지
@Constraint(validatedBy = Phone010Validator.class)
public @interface Phone010 {
    // Annotation Element
    String message() default "010 으로 시작하지않습니다";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
