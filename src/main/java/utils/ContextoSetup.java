package utils;

import pageObjects.GerenciarPO;

import java.io.IOException;

public class ContextoSetup {
    public GerenciarPO gerenciarPO;
    public BaseTeste baseTeste;

    public ContextoSetup() throws IOException {
        baseTeste = new BaseTeste();
        gerenciarPO = new GerenciarPO(baseTeste.webDriverManager());
    }
}
