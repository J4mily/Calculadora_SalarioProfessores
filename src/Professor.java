abstract class Professor {
    protected String nome;
    protected String regime;

    public Professor(String nome, String regime) {
        this.nome = nome;
        this.regime = regime;
    }

    public abstract double calcularValorAReceber();

    public void exibirValorAReceber(String regime ) {
        double valorAReceber = calcularValorAReceber();

        System.out.println("\n====CÁLCULO DO SALÁRIO "+ regime +"====");
        System.out.println("> Nome do professor: " + nome);
        System.out.println("> Valor a receber: R$" + valorAReceber +"\n");
        
    }
}
