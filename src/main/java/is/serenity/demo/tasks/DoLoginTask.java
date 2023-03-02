package is.serenity.demo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static is.serenity.demo.userinterfaces.LoginPage.*;
import static is.serenity.demo.utils.enums.userEnum.*;
import static is.serenity.demo.utils.enums.userEnum.TXT_USERNAME;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;


public class DoLoginTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.should(GivenWhenThen.seeThat(the(INP_USERNAME), isVisible()));
        actor.should(GivenWhenThen.seeThat(the(INP_PASSWORD), isVisible()));

        actor.wasAbleTo(
                Enter.theValue(TXT_USERNAME.getValue()).into(INP_USERNAME),
                Enter.theValue(TXT_PASSWORD.getValue()).into(INP_PASSWORD),
                Click.on(BTN_SIGNIN));


        actor.should(GivenWhenThen.seeThat(the(IMG_USER), isVisible()));
        // actor.attemptsTo(Click.on(BTN_MY_ACCOUNT));
        // Assert para establecer puntos de control
        // actor.should(GivenWhenThen.seeThat(the(LBL_REGISTER), isVisible()));
        // actor.wasAbleTo(Enter.theValue(USER_EMAIL.getValue()).into(INP_EMAIL), Enter.theValue(USER_PASSWORD.getValue()).into(INP_PASSWORD), Click.on(BTN_REGISTER_USER));
        }


    public static DoLoginTask doLogin() {
        return Tasks.instrumented(DoLoginTask.class);
    }

}
