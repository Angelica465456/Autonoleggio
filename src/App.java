import java.util.Scanner;
import java.util.InputMismatchException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;


public class App {
    public static void main(String[] args) throws Exception{
		Scanner sca = new Scanner(System.in);
        LocalDate oggi = LocalDate.now();

        System.out.println("Anno scadenza patente: ");
        int anno = sca.nextInt();

        System.out.println("Mese scadenza paente: ");
        int mese = sca.nextInt();

        System.out.println("Giorno scadenza patente: ");
        int giorno = sca.nextInt();

        LocalDate scad = LocalDate.of(anno, mese, giorno);

        scad.compareTo(oggi);

        if(scad.compareTo(oggi) < 0){
            System.out.println("\nLa patente è scaduta.");
        }else{
            System.out.println("\nLa patente è ok.");
        }
	}
}