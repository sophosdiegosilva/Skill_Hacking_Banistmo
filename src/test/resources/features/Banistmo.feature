Feature: Descargar y validar documento PDF en Banistmo

    Scenario: Descargar el documento "Contrato único de Productos y Servicios Bancarios"
        Given El usuario esta en la pagina de empresas de Banistmo
        When El usuario navega a Productos y Servicios y selecciona Depositos
        And El usuario ingresa a la opcion Cuenta de ahorro comercial
        And El usuario da clic en el documento PDF
        Then El documento PDF descargado es correcto
