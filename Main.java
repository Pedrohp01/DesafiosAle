import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#0.00");
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("Ana Silva", "Financeiro", 4500.00, 5));
        funcionarios.add(new Funcionario("Carlos Mendes", "TI", 7200.00, 3));
        funcionarios.add(new Funcionario("Beatriz Lima", "RH", 3900.00, 8));
        funcionarios.add(new Funcionario("João Pedro", "TI", 8500.00, 11));
        funcionarios.add(new Funcionario("Mariana Souza", "Financeiro", 4700.00, 2));
        funcionarios.add(new Funcionario("Ricardo Alves", "RH", 3100.00, 21));
        funcionarios.add(new Funcionario("Fernanda Rocha", "TI", 9300.00, 6));
        funcionarios.add(new Funcionario("Luiz Fernando", "Financeiro", 5200.00, 16));

        // Exibir todos os funcionários
        for (Funcionario f : funcionarios) {
            f.exibirInfo();
            System.out.println("---------------");
        }
        //1-
        funcionarios.stream().filter(f-> f.getSalario()>3000).forEach(Funcionario :: exibirInfo);
              List<Funcionario> atualizados = funcionarios.stream()
            .map(f -> {
                if (f.getAnosDeServico() > 10) {
          
                    return new Funcionario(
                        f.getNome(),
                        f.getDepartamento(),
                        f.getSalario() * 1.05,
                        f.getAnosDeServico()
                    );
                } else {
                    return f; 
                }
            })
            .collect(Collectors.toList());

        atualizados.forEach(f -> {
            f.exibirInfo();
            System.out.println("---------------");
        });

        System.out.println("Funcionários ordenados por nome:");
        funcionarios.stream()
            .sorted(Comparator.comparing(Funcionario::getNome))
            .forEach(f -> {
                f.exibirInfo();
                System.out.println("---------------");
            });

            double somaTotal = funcionarios.stream()
            .mapToDouble(Funcionario::getSalario)
            .sum();
            System.out.printf("Soma total dos salarios: R$ %.2f\n", somaTotal);

            System.out.println("\nMédia salarial por departamento:");
            Map<String, Double> mediaPorDepartamento = atualizados.stream()
                .collect(Collectors.groupingBy(
                    Funcionario::getDepartamento,
                    Collectors.averagingDouble(Funcionario::getSalario)
                ));
                mediaPorDepartamento.forEach((departamento, media) -> 
                System.out.println(departamento + ": R$ " +df.format( (media)))
            );
            System.out.println("\n===========================================");
            Funcionario maisAntigo = funcionarios.stream()
            .max(Comparator.comparingInt(Funcionario::getAnosDeServico))
            .orElse(null);
        
        if (maisAntigo != null) {
            System.out.println("Funcionário com mais tempo de serviço:");
            maisAntigo.exibirInfo();
        }
        System.out.println("Lista de Funcionários:\n");

        for (Funcionario f : funcionarios) {
            String linha = String.format(
                "Funcionário: %-20s | Departamento: %-12s | Salário: R$ %8.2f",
                f.getNome(), f.getDepartamento(), f.getSalario()
            );
            System.out.println(linha);
        }
        
    }
}
