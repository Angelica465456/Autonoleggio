import java.util.Scanner;
import java.util.InputMismatchException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;


public class App {
    public static void main(String[] args) throws Exception{
		Scanner sca = new Scanner(System.in);
        LocalDate ora = LocalDate.now();

        System.out.println("Adesso: "+ora);
	}
}