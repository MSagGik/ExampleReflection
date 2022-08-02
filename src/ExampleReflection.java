import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ExampleReflection {
    public static void main(String[] args) throws ClassNotFoundException {
        // варианты доступа к объекту класса класс:
        Class personClass = Person.class; // первый способ
        Person person = new Person(); // второй способ
        Class personClass2 = person.getClass();
        Class personClass3 = Class.forName("Person"); // третий способ (задание пути к классу)
        // получение всех методов объекта класса класс
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName() + ", "
            + method.getReturnType() + ", " + Arrays.toString(method.getParameterTypes()));
        }
        // получение всех публичных полей объекта класса класс
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field.getName() + ", " + field.getType());
        }
        // получение всех полей (даже приватных) объекта класса класс
        Field[] fields2 = personClass.getDeclaredFields();
        for (Field field : fields2) {
            System.out.println(field.getName() + ", " + field.getType());
        }
        // получение всех аннотаций объекта класса класс
        Annotation[] annotations = personClass.getAnnotations();
        for (Annotation annotation : annotations) {
            if(annotation instanceof Author) { // если аннотация является экземпляром Author
                System.out.println("Yes");
            }
        }
    }
}
