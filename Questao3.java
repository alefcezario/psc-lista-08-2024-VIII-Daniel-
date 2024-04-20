import java.util.Scanner;

public class Questao3 {

	    public static void main(String[] args) {
	    int[] valores = new int[3];
		int resultado = somaValores(valores);
		System.out.println("A soma é: " + resultado);
	}
	
		public static int somaValores(int[] valores){
	        Scanner scanner = new Scanner(System.in);
	        
	        for (int i = 0; i < 3; i++ ) {
	        System.out.println("Digite o "+ (i + 1) + "º argumento a ser somado: ");
	        valores[i] = scanner.nextInt();
	        }
	        
	    int soma = 0;
        for (int valor : valores) {
            soma += valor;
        }
	        scanner.close();
	        return soma; 
	    }
	    

	}
