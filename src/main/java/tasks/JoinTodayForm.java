package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.UTestSignUpPage;

public class JoinTodayForm implements Task {
    public static JoinTodayForm onThePage() {
        return Tasks.instrumented(JoinTodayForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UTestSignUpPage.SIGN_UP_BUTTON));
    }
}
