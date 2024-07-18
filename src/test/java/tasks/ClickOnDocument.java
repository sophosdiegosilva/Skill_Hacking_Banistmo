package tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ClickOnDocument {
    public static Task named() {
        return Task.where("{0} da clic en el documento PDF",
                Click.on("//*[@id='collapse-tab5']/table/tbody/tr/td[2]/a/img")
        );
    }
}
