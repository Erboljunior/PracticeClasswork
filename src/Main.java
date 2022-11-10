import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Student student = new Student("Erbol",18,"ashiraliuuluerbolotgmail.com",557527770){
//        };
        Scanner scanner = new Scanner(System.in);
        Date date=new Date();

        date.setDay(scanner.nextInt());
        date.setMonth(scanner.nextInt());
        date.setYear(scanner.nextInt());

        System.out.println(date.getDay()+"/"+date.getMonth()+"/"+date.getYear());

        
    }
}
