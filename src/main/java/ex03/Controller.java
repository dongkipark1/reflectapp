package ex03;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 깃발을 만드는 것
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE) // 클래스 위에 달아준다
public @interface Controller {
}
