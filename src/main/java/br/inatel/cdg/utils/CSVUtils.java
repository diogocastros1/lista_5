package br.inatel.cdg.utils;

import br.inatel.cdg.funcionario.Funcionarios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CSVUtils {
    private Path arquivo;
    private Path arquivoFinal = Paths.get("func_filtrado.csv");
    private Funcionarios[] funcionarios = new Funcionarios[100];
    private int i = 0;

    public CSVUtils(Path arquivo) {
        this.arquivo = arquivo;
    }

    public void funcComFilho(){

        try {
            List<String> linhas = Files.readAllLines(arquivo);

            linhas.forEach(l -> {
                String[] linhasSplit = l.split(",");
                funcionarios[i].setId(Integer.parseInt(linhasSplit[0]));
                funcionarios[i].setFilhos(Integer.parseInt(linhasSplit[3]));
                funcionarios[i].setSalario(Double.parseDouble(linhasSplit[4]));;
                i++;
            });

            int j = 0;
            for(j = 0; j < funcionarios.length; j++){
                if(funcionarios[j].getFilhos() != 0){
                    Files.writeString(arquivoFinal,Integer.toString(funcionarios[j].getId()),
                            StandardOpenOption.CREATE,
                            StandardOpenOption.APPEND);
                    Files.writeString(arquivoFinal,",",
                            StandardOpenOption.APPEND);
                    Files.writeString(arquivoFinal,Integer.toString(funcionarios[j].getFilhos()),
                            StandardOpenOption.APPEND);
                    Files.writeString(arquivoFinal,",",
                            StandardOpenOption.APPEND);
                    Files.writeString(arquivoFinal,Double.toString(funcionarios[j].getSalario()) + "\n",
                            StandardOpenOption.APPEND);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
