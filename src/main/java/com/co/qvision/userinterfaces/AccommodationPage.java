package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AccommodationPage {
    //En este modulo vamos a localizar cada uno de los elementos,los cuales se utilizaran para interactuar con ellos y asi poder usarlos
    public static final Target TXT_PLACE=Target.the("Escribir lugar de hospedaje").locatedBy("//input[@id=':rg:']");
    public static final Target SPAN_DATE=Target.the("Añadir fechas de alojamiento").locatedBy("//div[@class='b91c144835']");

    public static final Target TXT_CHECK_IN=Target.the("Añadir fechas de primer chequeo").locatedBy("(//span[text()='27'])[1]");
    public static final Target TXT_CHECK_OUT=Target.the("Añadir fechas de ultimo chequeo").locatedBy("(//span[text()='3'])[2]");
    public static final Target BTN_PERSONS=Target.the("Agregar personas").locatedBy("//button[@class='d47738b911 b7d08821c3']");
    public static final Target SPAN_ADULTS=Target.the("Agregar Adultos").locatedBy("(//span[@class='fcd9eec8fb bf9a32efa5'])[3]");
    public static final Target SPAN_CHILDREN=Target.the("Agregar Adultos").locatedBy("(//span[@class='fcd9eec8fb bf9a32efa5'])[5]");
    public static final Target SLT_EDAD_1=Target.the("Agregar Edad de los niños").locatedBy("//select[@id=':r1e:']");
    public static final Target OPT_EDAD_1=Target.the("Escojer Edad del niño 1").locatedBy("(//option[@value='6'])[1]");

    public static final Target SLT_EDAD_2=Target.the("Agregar Edad de los niños").locatedBy("//select[@id=':r1f:']");
    public static final Target OPT_EDAD_2=Target.the("Escojer Edad del niño 2").locatedBy("(//option[@value='12'])[2]");
    public static final Target SPAN_ROMS=Target.the("Escojer Cantidad de habitaciones").locatedBy("(//span[@class='eedba9e88a'])[7]");
    public static final Target BTN_DONE=Target.the("Boton guardar").locatedBy("(//button[@type='button'])[15]");
    public static final Target BTN_SEARCH=Target.the("Boton Buscar").locatedBy("//button[@type='submit']");
    public static final Target DIV_FILTROS=Target.the("Menu de filtros").locatedBy("//div[@id='filter_group_used_filters_:rar:']");
    public static final Target OPT_FILTER=Target.the("Agregar filtos").locatedBy("//input[@id=':r8p:']");

    public static final Target DIV_FILTROS_TYPE=Target.the("Menu de filtros para tipo de alojamiento").locatedBy("//div[@id='filter_group_ht_id_:r9u:']");
    public static final Target SLT_TYPE=Target.the("Opcion de tipo de alojamiento").locatedBy("//input[@id=':ra0:']");
    public static final Target CARD_PRODUCT=Target.the("Targeta del producto").locatedBy("(//div[@data-testid='property-card'])[2]");
    public static final Target SLT_HOTEL=Target.the("Seleccionar hotel").locatedBy("(//div[@data-testid='property-card'])[18]");
    public static final Target BTN_RESERV=Target.the("HACER LA RESERVA DEL HOTEL").locatedBy("//button[@id='hp_book_now_button']");
    public static final Target SLT_AMOUNT=Target.the("Seleccionar el monto").locatedBy("//select[@name='nr_rooms_688074501_285610330_2_2_0']");
    public static final Target OPT_AMOUTNT=Target.the("Escojer monto").locatedBy("(//option[@value='4'])[5]");


}

