public class Produto {
        private String nome;
        private String categoria;
        private double preco;
    
        // Construtor
        public Produto(String nome, String categoria, double preco) {
            this.nome = nome;
            this.categoria = categoria;
            this.preco = preco;
        }
    
        // Getters
        public String getNome() {
            return nome;
        }
    
        public String getCategoria() {
            return categoria;
        }
    
        public double getPreco() {
            return preco;
        }
    
        // Setters
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public void setCategoria(String categoria) {
            this.categoria = categoria;
        }
    
        public void setPreco(double preco) {
            this.preco = preco;
        }
 
        public void exibirInfo() {
            System.out.printf("Nome: %s\nCategoria: %s\nPreço: R$ %.2f\n", nome, categoria, preco);
        }
    }
    

