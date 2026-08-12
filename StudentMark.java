package module1;
import java.util.Scanner;

class Marks {
    int mark1, mark2, mark3;
    Marks(int m1, int m2, int m3) {
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }
    int calculateTotal() {
        return mark1 + mark2 + mark3;
    }
    double calculateAverage() {
        return (mark1 + mark2 + mark3) / 3.0;
    }
}

public class StudentMark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter mark1: ");
        int m1 = sc.nextInt();
        System.out.print("Enter mark2: ");
        int m2 = sc.nextInt();
        System.out.print("Enter mark3: ");
        int m3 = sc.nextInt();
        Marks student = new Marks(m1, m2, m3);
        System.out.println("Total Marks: " + student.calculateTotal());
        System.out.println("Average Marks: " + student.calculateAverage());
        sc.close();
    }
}
