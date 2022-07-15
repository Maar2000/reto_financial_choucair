package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SignUp implements Task {

    private String firstName;
    private String lastName;
    private String email;
    private String month;
    private String day;
    private String year;
    private String city;
    private String postalCode;
    private String country;
    private String password;

    public SignUp(String firstName, String lastName, String email, String month, String day, String year, String city, String postalCode, String country, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.month = month;
        this.day = day;
        this.year = year;
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
        this.password = password;
    }

    public static SignUp the(String firstName, String lastName, String email, String month, String day, String year, String city, String postalCode, String country, String password) {
        return  Tasks.instrumented(SignUp.class, firstName, lastName, email, month, day, year, city, postalCode, country, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(firstName).into(UTestSignUpPage.INPUT_FIRST_NAME),
                Enter.theValue(lastName).into(UTestSignUpPage.INPUT_LAST_NAME),
                Enter.theValue(email).into(UTestSignUpPage.INPUT_EMAIL_ADDRESS),
                SelectFromOptions.byVisibleText(month).from(UTestSignUpPage.BIRTH_MONTH_LIST),
                SelectFromOptions.byVisibleText(day).from(UTestSignUpPage.BIRTH_DAY_LIST),
                SelectFromOptions.byVisibleText(year).from(UTestSignUpPage.BIRTH_YEAR_LIST),
                Click.on(UTestSignUpPage.NEXT_BUTTON1),

                Enter.theValue(city).into(SignUpStep2Page.INPUT_CITY),
                Enter.theValue(postalCode).into(SignUpStep2Page.INPUT_POSTAL_CODE),
                Click.on(SignUpStep2Page.COUNTRY_LIST),
                Enter.theValue(country).into(SignUpStep2Page.INPUT_SELECT_COUNTRY),
                WaitUntil.the(SignUpStep2Page.SELECT_COUNTRY_OPTION, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(SignUpStep2Page.SELECT_COUNTRY_OPTION),
                Click.on(SignUpStep2Page.NEXT_DEVICES_BUTTON2),

                Click.on(SignUpStep3Page.INPUT_COMPUTER),
                WaitUntil.the(SignUpStep3Page.SELECT_COMPUTER_OPTION, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(SignUpStep3Page.SELECT_COMPUTER_OPTION),
                Click.on(SignUpStep3Page.VERSION_LIST),
                Enter.theValue("Windows").into(SignUpStep3Page.INPUT_SELECT_VERSION),
                WaitUntil.the(SignUpStep3Page.SELECT_VERSION_OPTION, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(SignUpStep3Page.SELECT_VERSION_OPTION),
                Click.on(SignUpStep3Page.LANGUAGE_LIST),
                Enter.theValue("Spanish").into(SignUpStep3Page.INPUT_SELECT_LANGUAGE),
                WaitUntil.the(SignUpStep3Page.SELECT_LANGUAGE_OPTION, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(SignUpStep3Page.SELECT_LANGUAGE_OPTION),
                Click.on(SignUpStep3Page.MOBILE_DEVICE_LIST),
                Enter.theValue("Motorola").into(SignUpStep3Page.INPUT_SELECT_MOBILE_DEVICE),
                WaitUntil.the(SignUpStep3Page.SELECT_MOBILE_DEVICE_OPTION, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(SignUpStep3Page.SELECT_MOBILE_DEVICE_OPTION),
                Click.on(SignUpStep3Page.MOBILE_MODEL_LIST),
                Enter.theValue("Moto G60").into(SignUpStep3Page.INPUT_SELECT_MOBILE_MODEL),
                WaitUntil.the(SignUpStep3Page.SELECT_MOBILE_MODEL_OPTION, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(SignUpStep3Page.SELECT_MOBILE_MODEL_OPTION),
                Click.on(SignUpStep3Page.INPUT_OPERATING_SYSTEM),
                WaitUntil.the(SignUpStep3Page.SELECT_OPERATING_SYSTEM_OPTION, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(SignUpStep3Page.SELECT_OPERATING_SYSTEM_OPTION),
                Click.on(SignUpStep3Page.NEXT_LAST_STEP_BUTTON3),

                Enter.theValue(password).into(SignUpLastStepPage.INPUT_PASSWORD),
                Enter.theValue(password).into(SignUpLastStepPage.INPUT_CONFIRM_PASSWORD),
                Click.on(SignUpLastStepPage.CHECK_TERMS_OF_USE),
                Click.on(SignUpLastStepPage.CHECK_PRIVACY_AND_POLICY),
                Click.on(SignUpLastStepPage.COMPLETE_SETUP_BUTTON4),
                WaitUntil.the(SuccessfulRegistrationPage.SUCCESSFUL_MESSAGE, isVisible()).forNoMoreThan(60).seconds());

    }

    public SignUp() {
    }
}
