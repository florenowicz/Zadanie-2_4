// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;

  
public class Main {
  public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
    System.out.println("Wybierz dzialnie");
     System.out.println("1  Suma" );
     System.out.println("2 Różnica");
     System.out.println("3 Iloczyn");
     System.out.println("4 Iloraz");
   
    int wybor = scanner.nextInt();
    System.out.print("Podaj liczbę a: ");
    double a = scanner.nextInt();
    System.out.print("Podaj liczbę b: ");
    double b = scanner.nextInt();
    
    switch (wybor) {
        case 1:
            System.out.println("Dodawanie: " + (a+b));
            break;

        case 2:
            System.out.println("Odejmowanie: " + (a-b));
            break;

        case 3:
            System.out.println("Mnożenie: " + (a*b));
            break;
       
       
         case 4:
        if(b==0){
           System.out.println("Nie można dzielić przez zero");
        break;
        }
      
           System.out.println("Dzielenie: " + (a/b));
           break;
        


  
    
    }

    
    
  
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
  }
}