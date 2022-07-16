package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignUpStep3Page {

    public static final Target INPUT_COMPUTER = Target.the("where do we write or select the type of computer")
            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/i[1]"));

    public static final Target SELECT_COMPUTER_OPTION = Target.the("where do we select the computer option")
            .located(By.xpath("//div[contains(text(),'Windows')]"));

    public static final Target VERSION_LIST = Target.the("where do we look the version of computer list")
            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/span[1]/i[1]"));

    public static final Target INPUT_SELECT_VERSION =Target.the("where do we write the version hint")
            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/input[1]"));

    public static final Target SELECT_VERSION_OPTION = Target.the("where do we select the version")
            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[1]/div[8]/span[1]/div[1]"));

    public static final Target LANGUAGE_LIST = Target.the("where do we look the language options list")
            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[3]/div[2]/div[1]/div[1]/span[1]/i[1]"));

    public static final Target INPUT_SELECT_LANGUAGE =Target.the("where do we write the language hint")
            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[3]/div[2]/div[1]/input[1]"));

    public static final Target SELECT_LANGUAGE_OPTION = Target.the("where do we select the language")
            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[3]/div[2]/div[1]/ul[1]/li[1]/div[3]/span[1]/div[1]"));

    public static final Target MOBILE_DEVICE_LIST = Target.the("where do we look the mobile devices options list")
            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/span[1]/i[1]"));

    public static final Target INPUT_SELECT_MOBILE_DEVICE =Target.the("where do we write the mobile devices hint")
            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/input[1]"));

    public static final Target SELECT_MOBILE_DEVICE_OPTION = Target.the("where do we select the mobile devices")
            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[3]/span[1]/div[1]"));

    public static final Target MOBILE_MODEL_LIST = Target.the("where do we look the mobile model options list")
            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[2]/div[2]/div[1]/div[1]/span[1]/i[1]"));

    public static final Target INPUT_SELECT_MOBILE_MODEL =Target.the("where do we write the mobile model hint")
            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[2]/div[2]/div[1]/input[1]"));

    public static final Target SELECT_MOBILE_MODEL_OPTION = Target.the("where do we select the mobile model")
            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[2]/div[2]/div[1]/ul[1]/li[1]/div[3]/span[1]/div[1]"));

    public static final Target INPUT_OPERATING_SYSTEM = Target.the("where do we write or select the mobile's operating system ")
            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[3]/div[2]/div[1]/div[1]/span[1]/i[1]"));

    public static final Target SELECT_OPERATING_SYSTEM_OPTION = Target.the("where do we select the operating system option")
            .located(By.xpath("//div[contains(text(),'Android 11')]"));

    public static final Target NEXT_LAST_STEP_BUTTON3 = Target.the("button that show us the last register step form page")
            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/a[1]"));

    public SignUpStep3Page() {
    }
}
