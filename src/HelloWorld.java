// Сколько взяли долга и сколько я могу выплачивать в месяц.
// Надо посчитать через сколько месяцев я смогу выплатить долг?
// *Каждый месяц прибавляется 4% от общей суммы
import java.util.Scanner;
public class HelloWorld{
        public static void main(String[] args){
                Scanner massiv = new Scanner(System.in);
                System.out.print("Введите число долга: ");
                double amount = massiv.nextDouble();
                System.out.print("Введите сумму ежемесячного платежа: ");
                double plateg = massiv.nextDouble();
                double month = 0;

                do{
                        amount *= 1.04;
                        amount -= plateg;
                        month++;
                        System.out.println(amount);

                }while(amount >= 0);
                System.out.println("Вам нужно " + month + "месяцев");

        }
}