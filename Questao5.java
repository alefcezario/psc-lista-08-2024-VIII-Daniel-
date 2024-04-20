import java.util.Scanner;

public class Questao5 {

 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Para saber o valor final do seu produto, digite o custo do mesmo: ");
        Double custo = scanner.nextDouble();

        System.out.println("Agora digite o percentual de imposto: ");
        Double taxaImposto = scanner.nextDouble();
        
        Double resultado = somaImposto(taxaImposto, custo);
        
        System.out.println("O valor final do produto é: R$: " + resultado);

        scanner.close();
    }
    
    public static Double somaImposto(Double taxaImposto, Double custo) {
   
    Double valorFinal = custo + (custo / 100 * taxaImposto);
    
    return valorFinal;
    
    }
    
	}
