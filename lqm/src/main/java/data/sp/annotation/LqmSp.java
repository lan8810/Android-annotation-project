package data.sp.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Hack on 2016/1/14.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface LqmSp {


    String name() default "";

    int sharedPreferenceMode() default 0;

    String[] imports() default {};

    boolean isSingleton() default false;

    String defBool() default "false";

    String defInt() default "-1";

    String defLong() default "-1L";

    String defFloat() default "Float.NaN";

    String defString() default "null";

}