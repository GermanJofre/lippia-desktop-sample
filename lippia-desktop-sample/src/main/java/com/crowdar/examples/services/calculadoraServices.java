package com.crowdar.examples.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.examples.constants.calculadoraConstants;
import org.testng.Assert;

import static com.crowdar.core.actions.ActionManager.isVisible;

public class calculadoraServices {

    public static void calculadoraEjecutandose() {
        Assert.assertTrue(isVisible(calculadoraConstants.IGUAL));
    }

    public static void operaciones(String n1, String signo, String n2) {
        numeros(n1);
        ActionManager.click(String.format(calculadoraConstants.OPERACION, signo));
        numeros(n2);
        ActionManager.click(calculadoraConstants.IGUAL);
    }

    public static void numeros(String numeros) {
        for (int i = 0; i < numeros.length(); i++) {
                ActionManager.click(String.format(calculadoraConstants.NUMERO, numeros.charAt(i)));
            }
    }

    public static void resultado(String resul){
        Assert.assertEquals(getResult(),resul);
    }
    public static String getResult() {
        return ActionManager.getText(calculadoraConstants.RESULTADO).replaceAll("[a-zA-Z]+", "").trim();
    }
}
