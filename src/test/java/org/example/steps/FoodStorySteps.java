package org.example.steps;

import io.cucumber.java.ru.Когда;
import org.springframework.beans.factory.annotation.Autowired;
import ru.ibsqa.chameleon.steps.AbstractSteps;

public class FoodStorySteps extends AbstractSteps {

    @Autowired
    private FoodSteps customDebugSteps;

    @Когда("^debug \"([^\"]*)\"")
    public void stepDebug(String param) {
        flow(() ->
                customDebugSteps.stepDebug(param)
        );
    }
}