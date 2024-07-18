package tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.By;

public class NavigateTo {
    public static Task theBanistmoEmpresasPage() {
        return Task.where("{0} abre la página de empresas de Banistmo",
                Open.url("https://www.banistmo.com/wps/portal/banistmo/empresas/")
        );
    }

    public static Task productosYServicios() {
        return Task.where("{0} navega a Productos & Servicios",
                Click.on("//*[@id='navbar-collapse-grid']/ul/li[3]/a")
        );
    }

    public static Task depositos() {
        return Task.where("{0} selecciona Depósitos",
                Click.on("//*[@id='navbar-collapse-grid']/ul/li[3]/ul/li/div[1]/ul[1]/li[1]/a")
        );
    }

    public static Task cuentaDeAhorroComercial() {
        return Task.where("{0} ingresa a la opción Cuenta de ahorro comercial",
                Click.on("//*[@id='none']/div/div/div[2]/div[2]/div/div[2]/h2/a")
        );
    }

    public static Task documentos() {
        return Task.where("{0} se desplaza a la sección Documentos",
                Scroll.to(By.id("//*[@id='collapse-86']/h3[5']"))
        );
    }
}
