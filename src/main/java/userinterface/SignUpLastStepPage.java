package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignUpLastStepPage {

    public static final Target INPUT_PASSWORD = Target.the("where do we write the password")
            .located(By.cssSelector("#password"));

    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("where do we write the same password to confirm")
            .located(By.cssSelector("#confirmPassword"));

    public static final Target CHECK_TERMS_OF_USE = Target.the("where do check to accept the platform´s term of use")
            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[5]/label[1]/span[1]"));

    public static final Target CHECK_PRIVACY_AND_POLICY = Target.the("where do check to accept the platform´s privacy and policy")
            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[6]/label[1]/span[1]"));

    public static final Target COMPLETE_SETUP_BUTTON4 = Target.the("button that complete de sign up form and allow us to the final page")
            .located(By.xpath("//a[@id='laddaBtn']"));

    public SignUpLastStepPage() {
    }
}
