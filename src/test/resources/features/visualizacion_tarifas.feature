# language: es
@VisualizacionTarifas
Característica: Visualizacion de tarifas Banistmo
  Yo como cliente de Banistmo
  Quiero poder ingresar al tarifario y visualizar los archivos que contienen las diferentes tarifas
  Para conocer los valores actualizados de tarifas de los servicios y productos del banco

  Dado el usuario ingresa al sitio principal de Banistmo

  @TarifasDepositos
  Escenario: Visualizacion de tarifas de cuentas deposito
    Cuando el usuario ingresa al tarifario de banistmo y elige ver las tarifas de cuentas deposito
    Entonces deberia visualizar un pdf con las tarifas correspondientes
