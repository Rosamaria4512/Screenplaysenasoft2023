package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class    AccommodationPage {

    //En este modulo vamos a localizar cada uno de los elementos,los cuales se utilizaran para interactuar con ellos y asi poder usarlos

    //------------------------------------------Estos se usaran para Soliciar un alojamiento por medio de un buscador-------------------------------------------------------------------------------------------------------------------------
    public static final Target BTN_IGNORE=Target.the("Ingnorar mensaje").locatedBy(" (//button[@class='a83ed08757 c21c56c305 f38b6daa18 d691166b09 ab98298258 deab83296e f4552b6561'])");
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


    //----------------------------------------------------------------Aqui se aplican los filtros de busqueda en caso de ser nesesario----------------------------------------------------------------------------------
    public static final Target SLT_TYPE=Target.the("Boton para escojer el  tipo de alojamiento").locatedBy("//button[@data-testid='sorters-dropdown-trigger']");
    public static final Target OPT_TYPE=Target.the("Opcion de tipo de alojamiento").locatedBy("(//div//ul[@class='ad7c39949a']//li//button[@type='button'])[3]");
    public static final Target SLT_OPTION_HOTEL=Target.the("Seleccionar el hotel").locatedBy("(//div[@data-testid='property-card'])[1]");
    public static final Target A_SEE_HOTEL=Target.the("ver informacion del hotel").locatedBy("(//a[@data-testid='availability-cta-btn'])[1]");
    public static final Target BTN_RESERVE=Target.the("Reservar hotel").locatedBy("//button[@id='hp_book_now_button']");
    //--------------------------------------------------------------------------------------------------------------------------------------------------
    public static final Target DIV_FILTRES_PRICE=Target.the("Cuadro de filtros recientes").locatedBy("(//div[@data-filters-group='price'])[1]");
    public static final Target DIV_FILTRES_POPULAR=Target.the("Cuadro de filtros recientes").locatedBy("//div[@data-filters-group='popular']");
    public static final Target SLT_FILTER_1=Target.the("Seleeccioner un filtro").locatedBy("(//div//div[@data-testid='filters-group']//input[@type='checkbox'])[1]");
    public static final Target SLT_FILTER_2=Target.the("Seleeccioner un filtro").locatedBy("(//div//div[@data-testid='filters-group']//input[@type='checkbox'])[5]");

    //---------------------------------------------------------------------------Estos localizadores se utilizaran para que se puedan agregar nuevos Elementos a la lista de guardar-------------------------------------------------------------------------------------------------------------------------
    public static final  Target ADD_SAVE_LIST_1=Target.the("Agregar a la lista de guardados").locatedBy("(//button[@data-testid='wishlist-button'])[1]");
    public static final  Target ADD_SAVE_LIST_2=Target.the("Agregar a la lista de guardados").locatedBy("(//button[@data-testid='wishlist-button'])[2]");
    public static final Target SLT_FILTER_3=Target.the("Seleeccioner un filtro").locatedBy("(//div//div[@data-testid='filters-group']//input[@type='checkbox'])[6]");
    public static final Target A_PERFIL=Target.the("Ir al modulo de perfil").locatedBy("//button[@data-testid='header-profile']");
    public static final Target SAVED_PERFIL=Target.the("Seleccionar a opcion guardados").locatedBy("//body/div[@id=':rc:']/div[1]/div[1]/div[1]/div[1]/ul[1]/li[6]/a[1]");
    public static final Target VRF_DIV_ELEMENTS=Target.the("Verificar elementos guardados").locatedBy("//ul[@class='bui-carousel__inner']");
    public static final Target TXT_CORREO=Target.the("Validar correo").locatedBy("");
    public static final Target TXT_PASS=Target.the("Validar contraseña").locatedBy("");














    public static final Target CARD_PRODUCT=Target.the("Targeta del producto").locatedBy("(//div[@data-testid='property-card'])[2]");
    public static final Target SEE_PRODUCT=Target.the("Ver producto").locatedBy("//img[@alt='Residhome Paris Clamart']");
    public static final Target BTN_RESERV=Target.the("HACER LA RESERVA DEL HOTEL").locatedBy("//button[@id='hp_book_now_button']");
    public static final Target SLT_AMOUNT=Target.the("Seleccionar el monto").locatedBy("//select[@name='nr_rooms_688074501_285610330_2_2_0']");
    public static final Target OPT_AMOUTNT=Target.the("Escojer monto").locatedBy("(//option[@value='4'])[5]");

    //----------------------Estos elementos son aquelos que se localizan en caso de que el esenario de prueba este orientado al error-----------------------------------------------------------------------------------------------------------------
    public static final Target TXT_ERROR=Target.the("Texto de verifiacion de errores").locatedBy("//div[@class='b661b52535']");
}

