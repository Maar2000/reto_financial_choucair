package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestSignUpPage {

    public static final Target SIGN_UP_BUTTON = Target.the("button that shows us the form to authenticate")
            .located(By.xpath("//unauthenticated-header/div[1]/div[3]/ul[2]/li[2]/a[1]"));

    public static final Target INPUT_FIRST_NAME = Target.the("where do we write the first name")
            .located(By.xpath("//input[@id='firstName']"));

    public static final Target INPUT_LAST_NAME = Target.the("where do we write the last name")
            .located(By.xpath("//input[@id='lastName']"));

    public static final Target INPUT_EMAIL_ADDRESS = Target.the("where do we write the email address")
            .located(By.xpath("//input[@id='email']"));

    public static final Target BIRTH_MONTH_LIST = Target.the("where do we select the birth month")
            .located(By.xpath("//select[@id='birthMonth']"));

    public static final Target BIRTH_DAY_LIST = Target.the("where do we select the birth day")
            .located(By.xpath("//select[@id='birthDay']"));

    public static final Target BIRTH_YEAR_LIST = Target.the("where do we select the birth year")
            .located(By.xpath("//select[@id='birthYear']"));

    public static final Target NEXT_BUTTON1 = Target.the("button that show us the second register step form page")
            .located(By.xpath("//span[contains(text(),'Next: Location')]"));
}
