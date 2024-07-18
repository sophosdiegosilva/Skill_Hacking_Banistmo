package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.annotations.Subject;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

@Subject("{0} verifica que el documento PDF es correcto")
public class VerifyDocument implements Task {

    private final String expectedText;

    public VerifyDocument(String expectedText) {
        this.expectedText = expectedText;
    }

    public static VerifyDocument isCorrect() {
        return instrumented(VerifyDocument.class, "Expected text in the PDF"); // Cambia el texto esperado según sea necesario
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        // Obtiene la ruta relativa del archivo PDF dentro del proyecto
        File pdfFile = new File("src/test/resources/CONTRATO-UNICO-OCT-2022.pdf");

        try (PDDocument document = PDDocument.load(pdfFile)) {
            PDFTextStripper pdfStripper = new PDFTextStripper();
            String pdfText = pdfStripper.getText(document);

            // Cambia "Expected text in the PDF" por el texto específico que esperas verificar
            assertThat(pdfText, containsString(expectedText));
        } catch (IOException e) {
            throw new AssertionError("Error al leer el PDF", e);
        }
    }
}
