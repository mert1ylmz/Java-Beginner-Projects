import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Random random = new Random();
        int randomNumber = random.nextInt(10);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir tahminde bulununuz:");



        int attempst=0, maxattempt=3;
        System.out.println(randomNumber);
        do {

            if (attempst == maxattempt){
                System.out.println("Tahmin hakkiniz kalmamistir. Sayi ="+randomNumber);
            break;
            }

            int guess = scanner.nextInt();

            if (guess != randomNumber){
                System.out.println("Yanlis tahminde bulundunuz.");
                if (guess<randomNumber){
                    System.out.println("Soguk");
                }else {
                    System.out.println("Sicak");
                }


            }else {
                System.out.println("Tebrikler! Dogru tahmin ettiniz.");
                break;
            }
            attempst++;
           }while (true);


    }
}
