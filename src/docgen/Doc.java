package docgen;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface Doc {
    /**
     * Returns a description of the class or method that is annotated
     * with <tt>@Doc</tt>.
     *
     * <p>When the <tt>Doc</tt> annotation is added to a class or method, a
     * a value does not have to be included for this element since a
     * default value is specified.
     *
     * @return a description of the annotated class or method
     */
    String descr() default "";

    /**
     * Returns an array of descriptions for the parameters if the annotated
     * element is a method with parameters.
     */
    String[] params() default {};

    /**
     * Returns a description of the return value if the annotated element
     * is a non-void method.
     */
    String returns() default "";
}
