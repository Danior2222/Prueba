package co.com.choucair.certification.firstproject.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("https://operacion.choucairtesting.com/academy/login/index.php")
public class ChoucairAcademyPage extends PageObject {
    public static final Target LOGIN_BUTTON= Target.the("button that shows the form to login").located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(text(),'Ingresar')]"));
    public static final Target INPUT_USER= Target.the("where do we write the user").located(By.xpath("username"));
    public static final Target INPUT_PASSWORD= Target.the("where do we write the password").located(By.xpath("password"));
    public static final Target ENTER_BUTTON= Target.the("button to confirm login").located(By.xpath("//button[contains(@class,'btn btn-primary')]"));
}
