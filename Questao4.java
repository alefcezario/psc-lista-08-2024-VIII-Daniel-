public class Questao4 {

 public static void main(String[] args) {

        int argumento = 10; 
        char resultado = verificaValorPouN(argumento);
        System.out.println("O resultado é: " + resultado);
    }
    
    public static char verificaValorPouN(int num) {
        if (num > 0) {
            return 'P'; 
            
        } else {
            return 'N'; 
            
        }
    }
}
