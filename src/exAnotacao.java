import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})

public @interface exAnotacao {

    String value();

    String[] values();

    int quantdDeValue();
}
