import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int level = 1;

        System.out.print("Masukkan HP : ");
        int hp = sc.nextInt();
        System.out.print("Masukkan Damage : ");
        int damage = sc.nextInt();
        System.out.print("Menang? (true/false): ");
        boolean menang = sc.nextBoolean();

        if (menang == true) {
            level++;
        } else {
            hp -= damage;
            level--;
        }

        System.out.println("Sisa HP : " + hp);
        System.out.println("Level : " + level);
    }
}
