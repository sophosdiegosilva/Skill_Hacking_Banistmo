package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.Cast;
import tasks.NavigateTo;
import tasks.ClickOnDocument;
import tasks.VerifyDocument;

public class StepDefinitions {

    @Given("El usuario esta en la pagina de empresas de Banistmo")
    public void elUsuarioEstaEnLaPaginaDeEmpresasDeBanistmo() {
        OnStage.setTheStage(new Cast());
        OnStage.theActorCalled("Usuario").attemptsTo(NavigateTo.theBanistmoEmpresasPage());
    }

    @When("El usuario navega a Productos y Servicios y selecciona Depositos")
    public void elUsuarioNavegaAProductosYServiciosYSeleccionaDepositos() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                NavigateTo.productosYServicios(),
                NavigateTo.depositos()
        );
    }

    @When("El usuario ingresa a la opcion Cuenta de ahorro comercial")
    public void elUsuarioIngresaALaOpcionCuentaDeAhorroComercial() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                NavigateTo.cuentaDeAhorroComercial(),
                NavigateTo.documentos()
        );
    }

    @When("El usuario da clic en el documento PDF")
    public void elUsuarioDaClicEnElDocumentoPDF() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickOnDocument.named());
    }

    @Then("El documento PDF descargado es correcto")
    public void elDocumentoPDFDescargadoEsCorrecto() {
        OnStage.theActorInTheSpotlight().attemptsTo(VerifyDocument.isCorrect());
    }
}