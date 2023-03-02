import java.util.Scanner;

public class Test35 {
    public static void main(String[] args) {
        int number = (int) (Math.random() *100 );
        System.out.println(number);
        while (true){
            Scanner scanner = new Scanner(System.in);
            int value = scanner.nextInt();
            if (value>number){
                System.out.println("Не ожидал от тебя такого. Загаданное число меньше, Брат");
            }
            if (value<number){
                System.out.println("Я сам в шоке, но загаданное число больше, Брат");
            }
            if (value==number){
                System.out.println("Число подобранно верно");
                break;
            }

        }
    }
}