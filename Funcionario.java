  public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private int anosDeServico;

    // Construtor
    public Funcionario(String nome, String departamento, double salario, int anosDeServico) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.anosDeServico = anosDeServico;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getSalario() {
        return salario;
    }

    public int getAnosDeServico() {
        return anosDeServico;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setAnosDeServico(int anosDeServico) {
        this.anosDeServico = anosDeServico;
    }

    // Método para exibir informações
    public void exibirInfo() {
        System.out.printf("Nome: %s\nDepartamento: %s\nSalário: R$ %.2f\nAnos de Serviço: %d\n",
                nome, departamento, salario, anosDeServico);
    }
}
