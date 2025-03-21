package com.startSharp.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/realizar_pedido.feature",
        glue = "com/startSharp/stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class RealizarPedidoRunner {

}
