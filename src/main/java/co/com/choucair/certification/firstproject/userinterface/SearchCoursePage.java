package co.com.choucair.certification.firstproject.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("Seleccion la universidad choucair").located(By.xpath("//div[@id='universidad*]//strong"));
    public static final Target INTUP_COURSE = Target.the("Buscar el curso").located(By.xpath("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Da click para buscar curso").located(By.xpath("//button[@class='btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the("Da click para buscar curso").located(By.xpath("//h4[contains(text(),'Recursos Automatización Bancolombia)"));
    public static final Target NAME_COURSE = Target.the("Extrae el nombre del curso").located(By.xpath("//h1[contains(text(),'Recursos Automatización Bancolombia)"));
}
