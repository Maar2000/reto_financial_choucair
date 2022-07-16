package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignUpStep2Page {

    public static final Target INPUT_CITY = Target.the("where do we write or select the city")
            .located(By.xpath("//input[@id='city']"));

    public static final Target INPUT_POSTAL_CODE = Target.the("where do we write the zip or postal code")
            .located(By.xpath("//input[@id='zip']"));

    public static final Target COUNTRY_LIST = Target.the("where do we look the countries options list")
            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/span[1]/i[1]"));

    public static final Target INPUT_SELECT_COUNTRY =Target.the("where do we write the country hint")
            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[1]/div[4]/div[2]/div[1]/div[1]/input[1]"));

    public static final Target SELECT_COUNTRY_OPTION = Target.the("where do we select the country")
            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[1]/div[4]/div[2]/div[1]/div[1]/ul[1]/li[1]/div[3]/span[1]/div[1]"));

    public static final Target NEXT_DEVICES_BUTTON2 = Target.the("button that show us the third register step form page")
            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/a[1]"));

    public SignUpStep2Page() {
    }
}
