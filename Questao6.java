import java.util.Scanner;

public class Questao6 {

 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String repetir;

        do {
        System.out.println("Para fazer a conversao do formato de 24 horas para 12 horas digite primeiro a hora: ");
        int hora = scanner.nextInt();

        System.out.println("Agora digite os minutos: ");
        int minuto = scanner.nextInt();
        
        String horaConvertida = conversaoHora(hora, minuto);
        mostrarTempo(horaConvertida);

        System.out.println("Deseja fazer a conversao novamente? Digite (S) para sim e (N) para não: ");
        repetir = scanner.next();

    } while (repetir.equalsIgnoreCase("S"));

        scanner.close();
    }
    
    public static String conversaoHora(int hora, int minuto) {
    String turno; 
    
    if (hora < 12) {
        turno = "A";
        if (hora == 0) {
            hora = 12;
        }
        } else {
            turno = "P";
            if ( hora > 12) {
                hora -= 12;
            }
        }
        return String.format("%02d:%02d %s", hora, minuto, turno);
    }

    public static void mostrarTempo(String tempo) {

    System.out.println("A hora convetida é: " + tempo + ".M.");

	}
}