import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE}) // ограничение использования аннотации только к методам и классам
@Retention(RetentionPolicy.RUNTIME) // аннотация доступна во время работы программы
public @interface Author {
    String name(); // автор метода
    int dateOfCreation(); // дата создания метода
}