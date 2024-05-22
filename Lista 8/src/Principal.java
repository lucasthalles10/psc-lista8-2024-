import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Lista para armazenar os empregados cadastrados
        ArrayList<Empregado> empregados = new ArrayList<>();
        int op = 0;
        while (op != 7) {
            System.out.println("1. Criar novo empregado");
            System.out.println("2. Promover empregado");
            System.out.println("3. Aumentar salário do empregado");
            System.out.println("4. Demitir empregado");
            System.out.println("5. Fazer aniversário do empregado");
            System.out.println("6. Mostrar detalhes dos empregados");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            op = sc.nextInt();
            sc.nextLine(); // buffer

            switch (op) {
                case 1:
                    // Cria um novo empregado
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Idade: ");
                    int idade = sc.nextInt();
                    System.out.print("Salário: ");
                    double salario = sc.nextDouble();
                    // Adiciona o novo empregado à lista array de empregados
                    empregados.add(new Empregado(nome, idade, salario));
                    System.out.println("Criado com sucesso!");
                    break;
                case 2:
                    // Promove um empregado
                    if (empregados.isEmpty()) {
                        System.out.println("Nenhum empregado cadastrado.");
                    } else {
                        // Exibe a lista de empregados
                        System.out.println("Lista de empregados:");
                        for (int i = 0; i < empregados.size(); i++) {
                            System.out.println(i + ": " + empregados.get(i).getNome());
                        }
                        System.out.print("Escolha o empregado para promover (pelo número): ");
                        int indicePromocao = sc.nextInt();
                        // Promove o empregado escolhido
                        empregados.get(indicePromocao).promover();
                    }
                    break;
                case 3:
                    // Aumenta o salário de um empregado
                    if (empregados.isEmpty()) {
                        System.out.println("Nenhum empregado cadastrado.");
                    } else {
                        // Exibe a lista de empregados
                        System.out.println("Lista de empregados:");
                        for (int i = 0; i < empregados.size(); i++) {
                            System.out.println(i + ": " + empregados.get(i).getNome());
                        }
                        System.out.print("Escolha o empregado para aumentar o salário (pelo número): ");
                        int indiceAumentoSalario = sc.nextInt();
                        System.out.print("Informe o percentual de aumento (em decimal): ");
                        double percentualAumento = sc.nextDouble();
                        // Aumenta o salário do empregado escolhido
                        empregados.get(indiceAumentoSalario).aumentarSalario(percentualAumento);
                    }
                    break;
                case 4:
                    // Demite um empregado
                    if (empregados.isEmpty()) {
                        System.out.println("Nenhum empregado cadastrado.");
                    } else {
                        // Exibe a lista de empregados
                        System.out.println("Lista de empregados:");
                        for (int i = 0; i < empregados.size(); i++) {
                            System.out.println(i + ": " + empregados.get(i).getNome());
                        }
                        System.out.print("Escolha o empregado para demitir (pelo número): ");
                        int indiceDemitir = sc.nextInt();
                        System.out.println("1. Justa causa");
                        System.out.println("2. Decisão do empregador");
                        System.out.println("3. Aposentadoria");
                        System.out.print("Informe o motivo da demissão: ");
                        int motivo = sc.nextInt();
                        // Demite o empregado escolhido com o motivo informado
                        empregados.get(indiceDemitir).demitir(motivo);
                        // remove o empregado demitido do caso 1 e 2 
                        if (motivo == 2 || motivo == 3) {
                            empregados.remove(indiceDemitir);
                            System.out.println("Empregado removido da lista.");
                        }
                    }
                    break;
                case 5:
                    // Incrementa a idade de um empregado
                    if (empregados.isEmpty()) {
                        System.out.println("Nenhum empregado cadastrado.");
                    } else {
                        // Exibe a lista de empregados
                        System.out.println("Lista de empregados:");
                        for (int i = 0; i < empregados.size(); i++) {
                            System.out.println(i + ": " + empregados.get(i).getNome());
                        }
                        System.out.print("Escolha o empregado para fazer aniversário (pelo número): ");
                        int indiceAniversario = sc.nextInt();
                        // Incrementa a idade do empregado escolhido
                        empregados.get(indiceAniversario).fazerAniversario();
                        
                    }
                    break;
                case 6:
                    // Exibe os detalhes de todos os empregados
                    if (empregados.isEmpty()) {
                        System.out.println("Nenhum empregado cadastrado.");
                    } else {
                        System.out.println("Detalhes dos empregados:");
                        for (Empregado empregado : empregados) {
                            System.out.println(empregado);
                        }
                    }
                    break;
                case 7:
                    System.out.println("Saiu do programa!");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    // Método para listar os empregados cadastrados (não utilizado no switch case, mas pode ser útil)
    public static void listarEmpregados(ArrayList<Empregado> empregados) {
        if (empregados.isEmpty()) {
            System.out.println("Nenhum empregado cadastrado.");
        } else {
            for (int i = 0; i < empregados.size(); i++) {
                System.out.println(i + ": " + empregados.get(i));
            }
        }
    }
}