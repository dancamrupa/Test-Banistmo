package net.bancolombia.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class CreateTextUserInterface {

    public static final Target CORPORATE_OPTION = Target.the("Corporate option")
            .locatedBy("//a[@id='header-empresas']");
    public static final Target SMART_CAPITAL = Target.the("Smart capital")
            .locatedBy("(//a[@class='header-menu_link'])[3]");
    public static final Target ECONOMIC_CURRENT = Target.the("Economic current")
            .locatedBy("(//a[@class='dropdown-toggle'])[2]");
    public static final Target BUTTON_MORE = Target.the("Button more")
            .locatedBy("//button[@id='verMas']");
    public static final Target PDF_LINK = Target.the("Pdf link")
            .locatedBy("(//a[contains(@href, '/empresas/capital-inteligente/actualidad-economica-sectorial/sector-petroleo/opep-aumentara-oferta-petroleo-julio-2021')])[2]");
    public static final Target PDF_IMAGE = Target.the("Pdf image")
            .locatedBy("(//img[@class='hidden-xs img-responsive'])[3]");
    public static final Target PDF_VALIDATION = Target.the("Pdf validation")
            .locatedBy("//title[contains(text(), 'informe-sectorial-petroleo-junio-2021.pdf')]");
}