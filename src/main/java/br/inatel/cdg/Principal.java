package br.inatel.cdg;

import br.inatel.cdg.utils.CSVUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Principal {
    public static void main(String[] args) {
        Path caminho = Paths.get("funcionarios.csv");

        CSVUtils csvUtils = new CSVUtils(caminho);

        csvUtils.funcComFilho();
    }
}
