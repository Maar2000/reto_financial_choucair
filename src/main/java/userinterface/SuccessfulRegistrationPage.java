package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SuccessfulRegistrationPage {

    public static final Target SUCCESSFUL_MESSAGE = Target.the("the message that indicates to everything is successful")
            .located(By.xpath("//h1[contains(text(),\"Welcome to the world's largest community of freela\")]"));

}
