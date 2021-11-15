package br.inatel.cdg.funcionario;

public class Funcionarios {
    private int id;
    private int filhos;
    private double salario;

    public Funcionarios(int id, int filhos, double salario) {
        this.id = id;
        this.filhos = filhos;
        this.salario = salario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFilhos(int filhos) {
        this.filhos = filhos;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public int getFilhos() {
        return filhos;
    }

    public double getSalario() {
        return salario;
    }
}
