// Classe Empregado representa um empregado com atributos e métodos relacionados
class Empregado {
    // Atributos privados da classe Empregado
    private String nome;
    private int idade;
    private double salario;

    // Construtor da classe Empregado
    // Inicializa os atributos
    public Empregado(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }
    // Retorna o nome do empregado
    public String getNome() {
        return nome;
    }
    // Define o nome do empregado
    public void setNome(String nome) {
        this.nome = nome;
    }
    // Retorna a idade do empregado
    public int getIdade() {
        return idade;
    }
    // Define a idade do empregado
    public void setIdade(int idade) {
        this.idade = idade;
    }
    // Retorna o salário do empregado
    public double getSalario() {
        return salario;
    }
    // Define o salário do empregado
    public void setSalario(double salario) {
        this.salario = salario;
    }
    // Método para representar o empregado como uma string
    public String toString() {
        // Retorna uma string com os detalhes do empregado
        return "Nome: " + nome + ", Idade: " + idade + ", Salário: R$ " + salario;
    }
    public void promover() {
        if (idade > 18) {
            aumentarSalario(0.25); // Aumenta o salário em 25%
            System.out.println("Promoção realizada com sucesso!");
        } else {
            System.out.println("O funcionário deve ter mais de 18 anos para ser promovido.");
        }
    }
    // Método para aumentar o salário do empregado
    // Calcula o novo salário com base no aumento percentual
    public void aumentarSalario(double aumento) {
        salario += salario * aumento;
        System.out.println("Salário atualizado para R$ " + salario);
    }
    // Método para demitir o empregado 
    public void demitir(int motivo) {
        switch (motivo) {
            case 1:
                System.out.println("Demitido por justa causa. Cumprir aviso prévio.");
                break;
            case 2:
                double multa = salario * 0.4;
                salario -= multa;
                System.out.println("Demitido por decisão do empregador. Multa de 40% aplicada, recisão é: R$ " + salario);
                break;
            case 3:
                double salarioAposentadoria;
                if (salario >= 1000 && salario <= 2000) {
                    salarioAposentadoria = 1500;
                } else if (salario > 2000 && salario <= 3000) {
                    salarioAposentadoria = 2500;
                } else if (salario > 3000 && salario <= 4000) {
                    salarioAposentadoria = 3500;
                } else {
                    salarioAposentadoria = 4000;
                }
                System.out.println("Funcionário aposentado. Salário de aposentadoria: R$ " + salarioAposentadoria);
                break;
            default:
                // Caso de motivo de demissão inválido
                System.out.println("Motivo de demissão inválido.");
        }
    }
    // Método para incrementar a idade do empregado
    public void fazerAniversario() {
        // Incrementa a idade do empregado em 1
        idade++;
        System.out.println("Feliz Aniversário! " + idade + " anos.");
    }
}

