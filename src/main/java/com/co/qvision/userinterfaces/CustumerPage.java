package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CustumerPage {
    public static final Target A_COMMENT=Target.the("Ir al amodulo para dejar la peticion").locatedBy("//a[@id='flights']");
        public static final Target BTN_CUSTUME=Target.the("Boton de califiacion").locatedBy("//div[@class='css-q8bhps']//button[@type='button']");
        public static final Target SLT_EMOTICON=Target.the("Seleccionar emoticon").locatedBy("(//input[@type='radio'])[4]");
        public static final Target TXT_MESSAGE=Target.the("Escribir mensaje").locatedBy("//textarea[@name='sgE-90239131-1-3']");
        public static final Target BTN_ENVIAR=Target.the("Enviar Respuesta").locatedBy("//input[@type='submit']");
        public static final Target VALIDATE_MESSAGE=Target.the("Validar Respuesta").locatedBy("//div[@class='sg-instructions']");

}
