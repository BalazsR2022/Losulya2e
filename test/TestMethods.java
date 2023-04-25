
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.lang.reflect.Method;
import controllers.MainController;
import java.util.ArrayList;

public class TestMethods {
    ArrayList<String> methodNames;

    @BeforeEach
    public void initList() {
        this.methodNames = new ArrayList<>();
        Method[] methods = MainController.class.getMethods();
        for (Method method : methods) {
            this.methodNames.add(
                    method.getName()

            );// ezzel kapom meg a metódusok nevét
        }
    }

    @Test
    public void testCalcWeightExist() {
        boolean actual = this.methodNames.contains("calcWeight");
        assertTrue(actual);

    }
}
