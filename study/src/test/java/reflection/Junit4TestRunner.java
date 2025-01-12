package reflection;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

public class Junit4TestRunner {
    @Test
    public void run() throws Exception {
        Class<Junit4Test> clazz = Junit4Test.class;

        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(MyTest.class)) {
                method.invoke(clazz.newInstance());
            }
        }

        // TODO Junit4Test에서 @MyTest 애노테이션이 있는 메소드 실행
    }
}
