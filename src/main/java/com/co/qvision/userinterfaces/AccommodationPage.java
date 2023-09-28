package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class    AccommodationPage {

    //En este modulo vamos a localizar cada uno de los elementos,los cuales se utilizaran para interactuar con ellos y asi poder usarlos

    //------------------------------------------Estos se usaran para Soliciar un alojamiento por medio de un buscador-------------------------------------------------------------------------------------------------------------------------
    public static final Target BTN_IGNORE=Target.the("Ignorar mensaje").locatedBy("(//button[@class='a83ed08757 c21c56c305 f38b6daa18 d691166b09 ab98298258 deab83296e f4552b6561'])");
    public static final Target TXT_PLACE=Target.the("Escribir lugar de hospedaje").locatedBy("//input[@name='ss']");
    public static final Target SPAN_DATE=Target.the("Añadir fechas de alojamiento").locatedBy("//div[@class='b91c144835']");
    public static final Target TXT_CHECK_IN=Target.the("Añadir fechas de primer chequeo").locatedBy("(//span[text()='27'])[1]");
    public static final Target TXT_CHECK_OUT=Target.the("Añadir fechas de ultimo chequeo").locatedBy("(//span[text()='3'])[2]");
    public static final Target BTN_PERSONS=Target.the("Agregar personas").locatedBy("//button[@class='d47738b911 b7d08821c3']");
    public static final Target SPAN_ADULTS=Target.the("Agregar Adultos").locatedBy("(//button[@type='button'])[10]");
    public static final Target SPAN_CHILDREN=Target.the("Agregar Niños").locatedBy("(//button[@type='button'])[12]");
    public static final Target SLT_EDAD_1=Target.the("Agregar Edad de los niños").locatedBy("(//select[@name='age'])[1]");
    public static final Target OPT_EDAD_1=Target.the("Escojer Edad del niño 1").locatedBy("(//option[@value='6'])[1]");
    public static final Target SLT_EDAD_2=Target.the("Agregar Edad de los niños").locatedBy("(//select[@name='age'])[2]");
    public static final Target OPT_EDAD_2=Target.the("Escojer Edad del niño 2").locatedBy("(//option[@value='12'])[2]");
    public static final Target SPAN_ROMS=Target.the("Escojer Cantidad de habitaciones").locatedBy("(//span[@class='eedba9e88a'])[7]");
    public static final Target BTN_DONE=Target.the("Boton guardar").locatedBy("(//button[@type='button'])[15]");
    public static final Target BTN_SEARCH=Target.the("Boton Buscar").locatedBy("//button[@type='submit']");

    public static final Target CARD_PRODUCT=Target.the("Targeta del producto").locatedBy("(//div[@data-testid='property-card'])[2]");
    public static final Target SEE_PRODUCT=Target.the("Ver producto").locatedBy("//img[@alt='Residhome Paris Clamart']");
    public static final Target BTN_RESERV=Target.the("HACER LA RESERVA DEL HOTEL").locatedBy("//button[@id='hp_book_now_button']");
    public static final Target SLT_AMOUNT=Target.the("Seleccionar el monto").locatedBy("//select[@name='nr_rooms_688074501_285610330_2_2_0']");
    public static final Target OPT_AMOUTNT=Target.the("Escojer monto").locatedBy("(//option[@value='4'])[5]");

    //----------------------Estos elementos son aquelos que se localizan en caso de que el esenario de prueba este orientado al error-----------------------------------------------------------------------------------------------------------------
    public static final Target TXT_ERROR=Target.the("Texto de verifiacion de errores").locatedBy("//div[@class='b661b52535']");
}

