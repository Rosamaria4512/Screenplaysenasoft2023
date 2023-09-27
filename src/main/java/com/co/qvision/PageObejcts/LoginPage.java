package com.co.qvision.PageObejcts;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.booking.com/index.es.html?label=es-co-booking-desktop-QLGRvVsXz2aps*_lUmd*1gS652804041077%3Apl%3Ata%3Ap1%3Ap2%3Aac%3Aap%3Aneg%3Afi%3Atikwd-102518000%3Alp1003665%3Ali%3Adec%3Adm&gclid=CjwKCAjwgsqoBhBNEiwAwe5w077TiV0TUdUzYfYh1-6VJKeaKbN97OQud8lSIPgn5wWrkdyjhOGSYRoCtLEQAvD_BwE&aid=2336990&sid=91faa5accfec39eacfbf6ac0adf3e1d7")
public class LoginPage extends PageObject {
    By TXT_USER = By.xpath("//*[@id='username']");

    By TXT_PASSWORD = By.xpath("//*[@id='password']");

    public By getTXT_USER() {
        return TXT_USER;
    }

    public void setTXT_USER(By TXT_USER) {
        this.TXT_USER = TXT_USER;
    }

    public By getTXT_PASSWORD() {
        return TXT_PASSWORD;
    }

    public void setTXT_PASSWORD(By TXT_PASSWORD) {
        this.TXT_PASSWORD = TXT_PASSWORD;
    }
}
